/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hy2
 */
public final class hy2_0
implements be2_2 {
    public final String a;
    public final cj2_0 b;
    public final Function1 c;
    public final i90_0 d;
    public final Object e;
    public volatile by2_0 f;

    public hy2_0(String object, cj2_0 cj2_02, Function1 function1, i90_0 i90_02) {
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(function1, "produceMigrations");
        Intrinsics.checkNotNullParameter(i90_02, "scope");
        this.a = object;
        this.b = cj2_02;
        this.c = function1;
        this.d = i90_02;
        this.e = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(gn1_2 object, Object object2) {
        object2 = (Context)object2;
        Intrinsics.checkNotNullParameter(object2, "thisRef");
        Object object3 = "property";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = this.f;
        if (object != null) return object;
        object = this.e;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        object3 = this.f;
                        if (object3 != null) break block3;
                        object2 = object2.getApplicationContext();
                        object3 = this.b;
                        Object object4 = this.c;
                        Object object5 = "applicationContext";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                        object4 = object4.invoke(object2);
                        object4 = (List)object4;
                        object5 = this.d;
                        gy2_2 gy2_22 = new gy2_2((Context)object2, this);
                        this.f = object2 = fy2_0.a((cj2_0)object3, (List)object4, (i90_0)object5, gy2_22);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = this.f;
                Intrinsics.checkNotNull(object2);
                return object2;
            }
            throw throwable2;
        }
    }
}

