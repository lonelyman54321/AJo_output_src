/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
 * Renamed from q50
 */
public interface q50_0 {
    public static final String[] a;
    public static final HashSet b;
    public static final HashSet c;
    public static final HashSet d;
    public static final HashSet e;
    public static final HashSet f;
    public static final String[] g;

    static {
        HashSet<String> hashSet;
        a = new String[]{"Notification Clicked", "Notification Viewed", "Geocluster Entered", "Geocluster Exited"};
        List<String> list = "Identity";
        String string2 = "Email";
        Object object = Arrays.asList(list, string2);
        b = hashSet = new HashSet<String>((Collection<String>)object);
        object = "Phone";
        List<String> list2 = Arrays.asList(list, string2, object);
        c = hashSet = new HashSet<String>(list2);
        list2 = Arrays.asList("cgk", "encryptionmigration", "Email", "Phone", "Identity", "Name");
        d = hashSet = new HashSet<String>(list2);
        list2 = Arrays.asList("encryptionmigration");
        hashSet = new HashSet<String>(list2);
        list = Arrays.asList("Name", string2, list, object);
        e = hashSet = new HashSet<String>(list);
        list = Arrays.asList("cc", "tz", "Carrier");
        f = hashSet = new HashSet<String>(list);
        g = new String[0];
    }
}

