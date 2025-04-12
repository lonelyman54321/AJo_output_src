/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/*
 * Renamed from al
 */
public final class al_2
extends Lambda
implements Function1 {
    public static final al_2 d;
    public static final al_2 e;
    public final /* synthetic */ int c;

    static {
        al_2 al_22;
        d = al_22 = new al_2(1, 0);
        e = al_22 = new al_2(1, 1);
    }

    public /* synthetic */ al_2(int n3, int n4) {
        this.c = n4;
        super(n3);
    }

    public final Object invoke(Object object) {
        int n3 = this.c;
        switch (n3) {
            default: {
                object = (JSONObject)object;
                Intrinsics.checkNotNullParameter(object, "inApp");
                Object object2 = new Date();
                long l2 = ((Date)object2).getTime();
                long l3 = 1000;
                object2 = String.valueOf(l2 / l3);
                object = object.optString("ti", (String)object2);
                Intrinsics.checkNotNullExpressionValue(object, "inApp.optString(Constant\u2026.time / 1000).toString())");
                return object;
            }
            case 0: 
        }
        object = (Boolean)object;
        ((Boolean)object).booleanValue();
        return object;
    }
}

