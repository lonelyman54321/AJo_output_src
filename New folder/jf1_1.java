/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jf1
 */
public final class jf1_1
implements mn1_0 {
    public final dh_1 a;
    public final yc1_2 b;

    public jf1_1(dh_1 dh_12, yc1_2 yc1_22) {
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
            charSequence.append(" data from IMAGE in-memory");
            charSequence = charSequence.toString();
            String string4 = "FileDownload";
            object.b(string4, (String)charSequence);
        }
        object = this.a.a.a();
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
            charSequence.append(" data from IMAGE disk-memory");
            charSequence = charSequence.toString();
            String string3 = "FileDownload";
            yc1_22.b(string3, (String)charSequence);
        }
        return this.a.a.b().d(string2);
    }

    public final File c(String string2, byte[] byArray) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(byArray, "data");
        return this.a.a.b().a(string2, byArray);
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
        yc1_2 yc1_22 = this.b;
        if (yc1_22 != null) {
            object2 = ((String)object).concat(" data found in image disk memory");
            String string2 = "FileDownload";
            yc1_22.b(string2, (String)object2);
        }
        if ((yc1_22 = (Bitmap)nn1_0.a.invoke(object3)) != null) {
            object2 = new Pair(yc1_22, object3);
            this.e((String)object, (Pair)object2);
        }
        if (bl2 = Intrinsics.areEqual(sn1_12, object = sn1$a_0.a)) {
            bl2 = yc1_22 instanceof Object;
            if (!bl2) return null;
            object3 = yc1_22;
            return object3;
        }
        object = SN1$b.a;
        bl2 = Intrinsics.areEqual(sn1_12, object);
        if (bl2) {
            object = nn1_0.b;
            if ((object3 = ((NN1$d)object).invoke(object3)) != null) return object3;
            return null;
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
            charSequence.append(" data in IMAGE in-memory");
            charSequence = charSequence.toString();
            String string3 = "FileDownload";
            yc1_22.b(string3, (String)charSequence);
        }
        return this.a.a.a().a(pair, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object f(String object, sn1_1 object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "transformTo");
        Pair pair = this.h((String)object);
        Object object3 = null;
        if (pair == null) return object3;
        Object object4 = this.b;
        if (object4 != null) {
            object = ((String)object).concat(" data found in image in-memory");
            String string2 = "FileDownload";
            object4.b(string2, (String)object);
        }
        object = sn1$a_0.a;
        boolean bl2 = Intrinsics.areEqual(object2, object);
        object4 = pair.a;
        if (bl2) {
            if (object4 != null) return object4;
            return object3;
        } else {
            object = SN1$b.a;
            bl2 = Intrinsics.areEqual(object2, object);
            if (bl2) {
                object = nn1_0.d;
                object2 = "null cannot be cast to non-null type android.graphics.Bitmap";
                Intrinsics.checkNotNull(object4, (String)object2);
                object4 = (Bitmap)object4;
                object = ((NN1$a)object).invoke(object4);
                if (object != null) return object;
                return object3;
            } else {
                object = SN1$c.a;
                bl2 = Intrinsics.areEqual(object2, object);
                if (bl2) {
                    object = pair.b;
                    if (object != null) return object;
                    return object3;
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
            CharSequence charSequence = new StringBuilder("IMAGE In-Memory cache miss for ");
            charSequence.append(string2);
            charSequence.append(" data");
            charSequence = charSequence.toString();
            String string3 = "FileDownload";
            yc1_22.b(string3, (String)charSequence);
        }
        return this.a.a.b().c(string2);
    }

    public final Pair h(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        vg1_1 vg1_12 = this.a.a.a();
        vg1_12.getClass();
        Intrinsics.checkNotNullParameter(string2, string3);
        return (Pair)vg1_12.b.b(string2);
    }
}

