/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.ranges.b;
import kotlin.text.StringsKt;

public final class yy1 {
    public final Set a;
    public final String b;
    public final String c;

    public yy1(Collection set) {
        int n3;
        Serializable serializable;
        ArrayList<Serializable> arrayList;
        int n7;
        String string2;
        Object object = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(object, "randomUUID().toString()");
        HashSet<String> hashSet = "nonce";
        Intrinsics.checkNotNullParameter(object, (String)((Object)hashSet));
        int n8 = 43;
        int n10 = 128;
        int n14 = 1;
        super(n8, n10, n14);
        Object object2 = cd2_2.a;
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        String string4 = "random";
        Intrinsics.checkNotNullParameter(object2, string4);
        try {
            n7 = dd2_2.b((cd2_2)object2, (IntRange)((Object)string2));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            String string5 = illegalArgumentException.getMessage();
            object = new NoSuchElementException(string5);
            throw object;
        }
        object2 = new a('a', 'z');
        super('A', 'Z');
        object2 = CollectionsKt.Y((b)object2, (b)((Object)arrayList));
        int n15 = 57;
        super('0', (char)n15);
        object2 = CollectionsKt.W(arrayList, (Collection)object2);
        arrayList = Character.valueOf('-');
        object2 = CollectionsKt.X((Collection)object2, arrayList);
        arrayList = Character.valueOf('.');
        object2 = CollectionsKt.X((Collection)object2, arrayList);
        arrayList = Character.valueOf('_');
        object2 = CollectionsKt.X((Collection)object2, arrayList);
        char c2 = '~';
        arrayList = Character.valueOf(c2);
        object2 = CollectionsKt.X((Collection)object2, arrayList);
        arrayList = new ArrayList<Serializable>(n7);
        String string6 = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            serializable = cd2_2.a;
            Intrinsics.checkNotNullParameter(object2, string3);
            Intrinsics.checkNotNullParameter(serializable, string4);
            int n4 = ((ArrayList)object2).isEmpty();
            if (n4 == 0) {
                n4 = ((ArrayList)object2).size();
                serializable.getClass();
                n15 = cd2_2.b.c(n4);
                serializable = (Character)CollectionsKt.I((Iterable)object2, n15);
                serializable.getClass();
                arrayList.add(serializable);
                continue;
            }
            set = new Set("Collection is empty.");
            throw set;
        }
        boolean bl2 = false;
        string6 = "";
        n15 = 0;
        serializable = null;
        int n4 = 62;
        string2 = CollectionsKt.R(arrayList, string6, null, null, null, n4);
        Intrinsics.checkNotNullParameter(object, (String)((Object)hashSet));
        hashSet = "codeVerifier";
        Intrinsics.checkNotNullParameter(string2, (String)((Object)hashSet));
        super();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            n8 = 6;
            n3 = StringsKt.N((CharSequence)object, ' ', 0, false, n8);
            if (n3 >= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                hashSet = null;
            }
            n3 ^= n14;
        } else {
            n3 = 0;
            hashSet = null;
        }
        if (n3 == 0 || (n3 = (int)(lj2_1.b(string2) ? 1 : 0)) == 0) {
            n14 = 0;
        }
        if (n14 != 0) {
            if (set != null) {
                super(set);
            } else {
                hashSet = new HashSet<String>();
            }
            hashSet.add("openid");
            set = Collections.unmodifiableSet(hashSet);
            Intrinsics.checkNotNullExpressionValue(set, "unmodifiableSet(permissions)");
            this.a = set;
            this.b = object;
            this.c = string2;
            return;
        }
        object = "Failed requirement.".toString();
        set = new Set((String)object);
        throw set;
    }
}

