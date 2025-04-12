/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class u0
implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ u0(int n3) {
        this.a = n3;
    }

    public final int compare(Object object, Object object2) {
        int n3;
        block13: {
            int n4 = this.a;
            switch (n4) {
                default: {
                    object = (File)object;
                    object2 = (File)object2;
                    return CrashlyticsReportPersistence.d((File)object, (File)object2);
                }
                case 0: 
            }
            object = (Di1)object;
            object2 = (Di1)object2;
            Class<w0> clazz = w0.class;
            boolean bl2 = td0.b(clazz);
            n3 = 0;
            if (!bl2) {
                block11: {
                    block12: {
                        String string2 = "o2";
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object.getClass();
                        string2 = "data";
                        Intrinsics.checkNotNullParameter(object2, string2);
                        object = ((Di1)object).g;
                        if (object == null) break block11;
                        long l2 = (Long)object;
                        object = ((Di1)object2).g;
                        if (object == null) break block12;
                        long l3 = (Long)object;
                        try {
                            int n7;
                            n3 = n7 = Intrinsics.compare(l3, l2);
                        }
                        catch (Throwable throwable) {
                            td0.a(clazz, throwable);
                        }
                    }
                    boolean bl3 = true;
                    n3 = 1;
                    break block13;
                }
                int n8 = -1;
                n3 = -1;
            }
        }
        return n3;
    }
}

