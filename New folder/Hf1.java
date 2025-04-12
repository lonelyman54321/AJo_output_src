/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class Hf1
implements mn1_0 {
    public final dh_1 a;
    public final yc1_2 b;

    public Hf1(dh_1 dh_12, yc1_2 yc1_22) {
        Intrinsics.checkNotNullParameter(dh_12, "ctCaches");
        this.a = dh_12;
        this.b = yc1_22;
    }

    public final Pair a(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        Object object = this.b;
        if (object != null) {
            CharSequence charSequence = new StringBuilder("If present, will remove ");
            charSequence.append(string2);
            charSequence.append(" data from GIF in-memory");
            charSequence = charSequence.toString();
            String string4 = "FileDownload";
            object.b(string4, (String)charSequence);
        }
        object = this.a.b.a();
        object.getClass();
        Intrinsics.checkNotNullParameter(string2, string3);
        return (Pair)((vg1_1)object).b.c(string2);
    }

    public final boolean b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        yc1_2 yc1_22 = this.b;
        if (yc1_22 != null) {
            CharSequence charSequence = new StringBuilder("If present, will remove ");
            charSequence.append(string2);
            charSequence.append(" data from GIF disk-memory");
            charSequence = charSequence.toString();
            String string3 = "FileDownload";
            yc1_22.b(string3, (String)charSequence);
        }
        return this.a.b.b().d(string2);
    }

    public final File c(String string2, byte[] byArray) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(byArray, "data");
        return this.a.b.b().a(string2, byArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object d(String object, sn1_1 sn1_12) {
        boolean bl2;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(sn1_12, "transformTo");
        Object object3 = this.g((String)object);
        Object object4 = null;
        if (object3 == null) return object4;
        Object object5 = this.b;
        if (object5 != null) {
            object2 = ((String)object).concat(" data found in GIF disk memory");
            String string2 = "FileDownload";
            object5.b(string2, (String)object2);
        }
        if ((object5 = (Object)((byte[])nn1_0.b.invoke(object3))) != null) {
            object2 = new Pair(object5, object3);
            this.e((String)object, (Pair)object2);
        }
        if (bl2 = Intrinsics.areEqual(sn1_12, object = sn1$a_0.a)) {
            object = nn1_0.a;
            if ((object3 = ((NN1$c)object).invoke(object3)) != null) return object3;
            return null;
        }
        object = SN1$b.a;
        bl2 = Intrinsics.areEqual(sn1_12, object);
        if (bl2) {
            bl2 = object5 instanceof Object;
            if (!bl2) return null;
            object3 = object5;
            return object3;
        }
        object = SN1$c.a;
        bl2 = Intrinsics.areEqual(sn1_12, object);
        if (bl2) {
            return object3;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final boolean e(String string2, Pair pair) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(pair, "data");
        yc1_2 yc1_22 = this.b;
        if (yc1_22 != null) {
            CharSequence charSequence = new StringBuilder("Saving ");
            charSequence.append(string2);
            charSequence.append(" data in GIF in-memory");
            charSequence = charSequence.toString();
            String string3 = "FileDownload";
            yc1_22.b(string3, (String)charSequence);
        }
        return this.a.b.a().a(pair, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object f(String object, sn1_1 sn1_12) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(sn1_12, "transformTo");
        Pair pair = this.h((String)object);
        Object object2 = null;
        if (pair == null) return object2;
        Object object3 = this.b;
        if (object3 != null) {
            object = ((String)object).concat(" data found in GIF in-memory");
            String string2 = "FileDownload";
            object3.b(string2, (String)object);
        }
        object = sn1$a_0.a;
        boolean bl2 = Intrinsics.areEqual(sn1_12, object);
        object3 = pair.a;
        if (bl2) {
            object = nn1_0.c.invoke(object3);
            if (object != null) return object;
            return object2;
        } else {
            object = SN1$b.a;
            bl2 = Intrinsics.areEqual(sn1_12, object);
            if (bl2) {
                if (object3 != null) return object3;
                return object2;
            } else {
                object = SN1$c.a;
                bl2 = Intrinsics.areEqual(sn1_12, object);
                if (bl2) {
                    object = pair.b;
                    if (object != null) return object;
                    return object2;
                } else {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            }
        }
    }

    public final File g(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        yc1_2 yc1_22 = this.b;
        if (yc1_22 != null) {
            CharSequence charSequence = new StringBuilder("GIF In-Memory cache miss for ");
            charSequence.append(string2);
            charSequence.append(" data");
            charSequence = charSequence.toString();
            String string3 = "FileDownload";
            yc1_22.b(string3, (String)charSequence);
        }
        return this.a.b.b().c(string2);
    }

    public final Pair h(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        vg1_1 vg1_12 = this.a.b.a();
        vg1_12.getClass();
        Intrinsics.checkNotNullParameter(string2, string3);
        return (Pair)vg1_12.b.b(string2);
    }
}

