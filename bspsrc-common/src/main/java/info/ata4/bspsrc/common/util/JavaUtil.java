package info.ata4.bspsrc.common.util;

import java.util.Map;

/**
 * Util helper class for general Java related methods
 */
public class JavaUtil {

    /**
     * Same as {@link Map#getOrDefault(K, V)} but with relaxed type parameters
     */
    public static <K, V extends U, U> U mapGetOrDefault(Map<K, V> map, K key, U defaultValue) {
        V v;
        return (((v = map.get(key)) != null) || map.containsKey(key))
                ? v
                : defaultValue;
    }
}
