/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
import android.graphics.RectF;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class gi$b
extends Lambda
implements Function2 {
    public final /* synthetic */ ul3_0 c;

    public gi$b(ul3_0 ul3_02) {
        this.c = ul3_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (RectF)object;
        object2 = (RectF)object2;
        object = cf_2.g((RectF)object);
        object2 = cf_2.g((RectF)object2);
        return this.c.a((aG2)object, (aG2)object2);
    }
}

