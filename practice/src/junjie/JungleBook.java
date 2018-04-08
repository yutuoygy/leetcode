package junjie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class JungleBook {

    // i is the species.
    // predator[i] = the id number of direct predator of i

    public int maximumGroups(int[] predators) {
        //int res = 0;

        List<List<Integer>> res =  new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        //Register species and its direct predators
        for (int i = 0; i < predators.length - 1; i++) {
            map.put(i, predators[i]);
        }
        List<Integer> group = new LinkedList<>();
        group.add(0);
        for (int i = 1; i < predators.length - 1; i++ ) {
            for (int j = 0; j < group.size() - 1; j++) {
                if(i != map.get(j)) {
                    group.add(i);
                } else {
                    List<Integer> newGroup = new LinkedList<>();
                    newGroup.add(i);
                }
            }

        }
        return res.size();
    }
}
