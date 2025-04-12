/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class EP2 {
    public static final FP2$a a(Context object, Class object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object3 = "klass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = b.k(string2) ^ true;
        if (bl2) {
            object3 = new FP2$a((Context)object, (Class)object2, string2);
            return object3;
        }
        object2 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

