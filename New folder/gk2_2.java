/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from GK2
 */
public final class gk2_2
extends hm0_2 {
    public static final hn2_2 e = hn2$a.a("/", false);
    public final ClassLoader b;
    public final hm0_2 c;
    public final hh3_2 d;

    public gk2_2(ClassLoader object) {
        Intrinsics.checkNotNullParameter(object, "classLoader");
        vn1_2 vn1_22 = hm0_2.a;
        Intrinsics.checkNotNullParameter(vn1_22, "systemFileSystem");
        this.b = object;
        this.c = vn1_22;
        object = new hk2_2(this);
        this.d = object = yr1_2.b((Function0)object);
    }

    public final y63_0 a(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "file");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this);
        charSequence.append(" is read-only");
        charSequence = charSequence.toString();
        object = new IOException((String)charSequence);
        throw object;
    }

    public final void b(hn2_2 object, hn2_2 object2) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(object2, "target");
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(this);
        ((StringBuilder)object2).append(" is read-only");
        object2 = ((StringBuilder)object2).toString();
        object = new IOException((String)object2);
        throw object;
    }

    public final void c(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "dir");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this);
        charSequence.append(" is read-only");
        charSequence = charSequence.toString();
        object = new IOException((String)charSequence);
        throw object;
    }

    public final void d(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "path");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this);
        charSequence.append(" is read-only");
        charSequence = charSequence.toString();
        object = new IOException((String)charSequence);
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List g(hn2_2 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "dir");
        Object object2 = e;
        object2.getClass();
        CharSequence charSequence = "child";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        boolean bl3 = true;
        String string2 = i_0.b((hn2_2)object2, (hn2_2)object, (boolean)bl3).c((hn2_2)object2).a.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator iterator = ((List)this.d.getValue()).iterator();
        boolean bl4 = false;
        while (bl2 = iterator.hasNext()) {
            Object object3 = (Pair)iterator.next();
            ArrayList<Object> arrayList = (hm0_2)((Pair)object3).a;
            object3 = (hn2_2)((Pair)object3).b;
            try {
                char c2;
                Object object4;
                Object object5;
                int n3;
                Object object6 = ((hn2_2)object3).d(string2);
                arrayList = ((hm0_2)((Object)arrayList)).g((hn2_2)object6);
                arrayList = arrayList;
                object6 = new ArrayList();
                arrayList = arrayList.iterator();
                while ((n3 = arrayList.hasNext()) != 0) {
                    object4 = object5 = arrayList.next();
                    object4 = (hn2_2)object5;
                    c2 = gk2$a_0.a(object4);
                    if (c2 == '\u0000') continue;
                    ((ArrayList)object6).add(object5);
                }
                n3 = 10;
                n3 = yx_2.o(object6, n3);
                arrayList = new ArrayList<Object>(n3);
                object6 = ((ArrayList)object6).iterator();
                while ((n3 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                    object5 = object6.next();
                    object5 = (hn2_2)object5;
                    object4 = "<this>";
                    Intrinsics.checkNotNullParameter(object5, object4);
                    object4 = "base";
                    Intrinsics.checkNotNullParameter(object3, object4);
                    object4 = ((hn2_2)object3).a;
                    object4 = ((ff_2)object4).q();
                    object5 = ((hn2_2)object5).a;
                    object5 = ((ff_2)object5).q();
                    object5 = StringsKt.U((String)object5, (String)object4);
                    c2 = '/';
                    char c3 = '\\';
                    object5 = kotlin.text.b.o((String)object5, c3, c2);
                    object5 = ((hn2_2)object2).d((String)object5);
                    arrayList.add(object5);
                }
            }
            catch (IOException iOException) {}
            continue;
            {
                cx_2.r(arrayList, linkedHashSet);
                bl4 = true;
            }
        }
        if (bl4) {
            return CollectionsKt.k0(linkedHashSet);
        }
        charSequence = new StringBuilder("file not found: ");
        ((StringBuilder)charSequence).append(object);
        object = ((StringBuilder)charSequence).toString();
        object2 = new FileNotFoundException((String)object);
        throw object2;
    }

    public final hl0_1 i(hn2_2 object) {
        Iterator iterator = "path";
        Intrinsics.checkNotNullParameter(object, (String)((Object)iterator));
        boolean bl2 = gk2$a_0.a((hn2_2)object);
        if (!bl2) {
            return null;
        }
        iterator = e;
        iterator.getClass();
        Object object2 = "child";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl3 = true;
        object = i_0.b((hn2_2)((Object)iterator), (hn2_2)object, (boolean)bl3).c((hn2_2)((Object)iterator)).a.q();
        iterator = ((List)this.d.getValue()).iterator();
        while (bl3 = iterator.hasNext()) {
            object2 = (Pair)iterator.next();
            hm0_2 hm0_22 = (hm0_2)((Pair)object2).a;
            object2 = ((hn2_2)((Pair)object2).b).d((String)object);
            if ((object2 = hm0_22.i((hn2_2)object2)) == null) continue;
            return object2;
        }
        return null;
    }

    public final ul0_1 j(hn2_2 object) {
        Object object2 = "file";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = gk2$a_0.a((hn2_2)object);
        String string2 = "file not found: ";
        if (bl2) {
            boolean bl3;
            object2 = e;
            object2.getClass();
            Intrinsics.checkNotNullParameter(object, "child");
            boolean bl4 = true;
            object2 = i_0.b((hn2_2)object2, (hn2_2)object, (boolean)bl4).c((hn2_2)object2).a.q();
            Object object3 = ((List)this.d.getValue()).iterator();
            while (bl3 = object3.hasNext()) {
                Object object4 = (Pair)object3.next();
                hm0_2 hm0_22 = (hm0_2)((Pair)object4).a;
                object4 = (hn2_2)((Pair)object4).b;
                try {
                    object4 = ((hn2_2)object4).d((String)object2);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    continue;
                }
                return hm0_22.j((hn2_2)object4);
            }
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            object2 = new FileNotFoundException((String)object);
            throw object2;
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new FileNotFoundException((String)object);
        throw object2;
    }

    public final y63_0 k(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "file");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this);
        charSequence.append(" is read-only");
        charSequence = charSequence.toString();
        object = new IOException((String)charSequence);
        throw object;
    }

    public final a93_0 l(hn2_2 object) {
        Object object2 = "file";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = gk2$a_0.a((hn2_2)object);
        String string2 = "file not found: ";
        if (bl2) {
            object2 = e;
            object2.getClass();
            Intrinsics.checkNotNullParameter(object, "child");
            object2 = i_0.b((hn2_2)object2, (hn2_2)object, (boolean)false).c((hn2_2)object2).a.q();
            Object object3 = this.b;
            object2 = ((ClassLoader)object3).getResourceAsStream((String)object2);
            if (object2 != null) {
                return o72_0.h((InputStream)object2);
            }
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            object2 = new FileNotFoundException((String)object);
            throw object2;
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new FileNotFoundException((String)object);
        throw object2;
    }
}

