package org.javasig.sep2013.joiner;

/**
 * Created with IntelliJ IDEA.
 * User: mpredli01
 * Date: 9/7/13
 * Time: 6:53 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.HashMap;
import java.util.Map;
import com.google.common.base.Joiner;

public class DemoJoiner {

    public DemoJoiner() {
        }

    public String joinValues01(String[] input) {
        Joiner joiner = Joiner.on(", ").skipNulls();
        return joiner.join(input);
        }

    public String joinValues02(String[] input) {
        Joiner joiner = Joiner.on(", ").useForNull("I can't remember the title");
        return joiner.join(input);
        }

    public String joinValues03(Map<Integer,String> map) {
        return Joiner.on(", ").useForNull("whatever").withKeyValueSeparator(" -> ").join(map);
        }

    public static void main(String[] args) {
        final String[] tarantino = {
            "Reservoir Dogs","Pulp Fiction","Jackie Brown","Kill Bill",null,"Django"
            };

        Map<Integer,String> map = new HashMap<>();
        for(int i = 0;i < tarantino.length;++i) {
            map.put(i,tarantino[i]);
            }

        DemoJoiner demoJoiner = new DemoJoiner();
        System.out.println(demoJoiner.joinValues01(tarantino));
        System.out.println(demoJoiner.joinValues02(tarantino));
        System.out.println(demoJoiner.joinValues03(map));
        }
    }
