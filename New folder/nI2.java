/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 */
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class nI2
extends qg3_2
implements Function2 {
    public final /* synthetic */ QB1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public nI2(QB1 qB1, Context context, String string2, String string3, f80_0 f80_02) {
        this.a = qB1;
        this.b = context;
        this.c = string2;
        this.d = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        QB1 qB1 = this.a;
        Context context = this.b;
        object = new nI2(qB1, context, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nI2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nI2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object iterator) {
        boolean bl2;
        Object object = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(iterator);
        iterator = this.a.f.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Context context;
            block15: {
                int n3;
                int n4;
                block14: {
                    object = (MU0)iterator.next();
                    context = this.b;
                    Intrinsics.checkNotNull(object);
                    String string2 = ((MU0)object).a;
                    String string3 = ((MU0)object).c;
                    StringBuilder stringBuilder = new StringBuilder();
                    String string4 = this.c;
                    stringBuilder.append(string4);
                    stringBuilder.append(string2);
                    string2 = this.d;
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    try {
                        context = context.getAssets();
                    }
                    catch (Exception exception) {
                        rx1.a.getClass();
                        object = Yo1.a;
                        continue;
                    }
                    context = Typeface.createFromAsset((AssetManager)context, (String)string2);
                    Intrinsics.checkNotNull(context);
                    string2 = "getStyle(...)";
                    Intrinsics.checkNotNullExpressionValue(string3, string2);
                    string2 = "Italic";
                    n4 = 0;
                    stringBuilder = null;
                    n3 = StringsKt.F(string3, string2, false);
                    string4 = "Bold";
                    boolean bl3 = StringsKt.F(string3, string4, false);
                    if (n3 != 0 && bl3) {
                        n4 = 3;
                        break block14;
                    }
                    if (n3 != 0) {
                        n4 = 2;
                        break block14;
                    }
                    if (!bl3) break block14;
                    n4 = 1;
                }
                n3 = context.getStyle();
                if (n3 == n4) break block15;
                context = Typeface.create((Typeface)context, (int)n4);
            }
            try {
                ((MU0)object).d = context;
            }
            catch (Exception exception) {
                rx1.a.getClass();
                object = Yo1.a;
            }
        }
        return Unit.a;
    }
}

