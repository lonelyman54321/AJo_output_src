/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Sp0 {
    public static final /* synthetic */ int a;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(tI3 tI32, LI3 lI3, th3_1 th3_12, List object) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        Object object2 = n3 >= n4 ? "Job Id" : "Alarm Id";
        CharSequence charSequence = "\n Id \t Class Name\t ";
        Object object3 = new StringBuilder((String)charSequence);
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append("\t State\t Unique Name\t Tags\t");
        object2 = ((StringBuilder)object3).toString();
        stringBuilder.append((String)object2);
        object = ((Iterable)object).iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (EI3)object.next();
            object3 = JI3.a((EI3)object2);
            if ((object3 = th3_12.c((gI3)object3)) != null) {
                n4 = ((sh3_0)object3).c;
                object3 = n4;
            } else {
                n4 = 0;
                object3 = null;
            }
            charSequence = ((EI3)object2).a;
            String string2 = CollectionsKt.R(tI32.b((String)charSequence), ",", null, null, null, 62);
            Object object4 = lI3.a((String)charSequence);
            int n7 = 62;
            object4 = CollectionsKt.R((Iterable)object4, ",", null, null, null, n7);
            String string3 = "\t ";
            charSequence = Gn.a("\n", (String)charSequence, string3);
            String string4 = ((EI3)object2).c;
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(object3);
            ((StringBuilder)charSequence).append(string3);
            object2 = ((EI3)object2).b.name();
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append((String)object4);
            n3 = 9;
            ((StringBuilder)charSequence).append((char)n3);
            object2 = ((StringBuilder)charSequence).toString();
            stringBuilder.append((String)object2);
        }
        Intrinsics.checkNotNullExpressionValue(stringBuilder.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}

