/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.adservices.topics.TopicsManager
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

public abstract class Uo3 {
    public static final Uo3$a a(Context object) {
        cp3_0 cp3_02;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = Build.VERSION.SDK_INT;
        h4 h42 = h4.a;
        int n4 = 0;
        int n7 = 30;
        int n8 = n3 >= n7 ? h42.a() : 0;
        Uo3$a uo3$a = null;
        int n10 = 5;
        String string2 = "context.getSystemService\u2026opicsManager::class.java)";
        if (n8 >= n10) {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = Mo3.a();
            object = bf_0.a(object, (Class)object2);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = No3.a(object);
            cp3_02 = new cp3_0((TopicsManager)object);
        } else {
            if (n3 >= n7) {
                n4 = h42.a();
            }
            if (n4 == (n3 = 4)) {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = Mo3.a();
                object = bf_0.a(object, (Class)object2);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object = No3.a(object);
                cp3_02 = new cp3_0((TopicsManager)object);
            } else {
                n3 = 0;
                cp3_02 = null;
            }
        }
        if (cp3_02 != null) {
            uo3$a = new Uo3$a(cp3_02);
        }
        return uo3$a;
    }
}

