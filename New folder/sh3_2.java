/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 *  android.provider.Settings$Global
 */
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from sH3
 */
public final class sh3_2
extends qg3_2
implements Function2 {
    public rr_2 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ContentResolver d;
    public final /* synthetic */ Uri e;
    public final /* synthetic */ th3_0 f;
    public final /* synthetic */ dr_2 g;
    public final /* synthetic */ Context h;

    public sh3_2(ContentResolver contentResolver, Uri uri, th3_0 th3_02, le_2 le_22, Context context, f80_0 f80_02) {
        this.d = contentResolver;
        this.e = uri;
        this.f = th3_02;
        this.g = le_22;
        this.h = context;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        sh3_2 sh3_22;
        th3_0 th3_02 = this.f;
        Object object2 = this.g;
        dr_2 dr_22 = object2;
        dr_22 = (le_2)object2;
        ContentResolver contentResolver = this.d;
        Uri uri = this.e;
        Context context = this.h;
        object2 = sh3_22;
        sh3_22 = new sh3_2(contentResolver, uri, th3_02, (le_2)dr_22, context, f80_02);
        sh3_22.c = object;
        return sh3_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (sh3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sh3_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block8: {
            block9: {
                block10: {
                    block11: {
                        var2_3 = j90_0.COROUTINE_SUSPENDED;
                        var3_4 = this.b;
                        var4_5 = 2;
                        var5_6 = 1;
                        var6_7 = this.f;
                        var7_8 = this.d;
                        if (var3_4 == 0) break block10;
                        if (var3_4 == var5_6) break block11;
                        if (var3_4 != var4_5) {
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        var8_9 = this.a;
                        var9_10 = (fs0_2)this.c;
                        try {
                            vl2_2.b(var1_1);
                        }
                        catch (Throwable var1_2) {
                            break block8;
                        }
                        while (true) {
                            var1_1 = var9_10;
                            ** GOTO lbl35
                            break;
                        }
                    }
                    var8_9 = this.a;
                    var9_10 = (fs0_2)this.c;
                    {
                        vl2_2.b(var1_1);
                        ** GOTO lbl-1000
                    }
                }
                vl2_2.b(var1_1);
                var1_1 = (fs0_2)this.c;
                var8_9 = this.e;
                var9_10 = null;
                var7_8.registerContentObserver((Uri)var8_9, false, (ContentObserver)var6_7);
                {
                    var8_9 = this.g;
                    var8_9 = var8_9.iterator();
lbl35:
                    // 2 sources

                    this.c = var1_1;
                    this.a = var8_9;
                    this.b = var5_6;
                    var9_10 = var8_9.b(this);
                    if (var9_10 == var2_3) {
                        return var2_3;
                    }
                    var10_11 = var9_10;
                    var9_10 = var1_1;
                    var1_1 = var10_11;
                }
lbl-1000:
                // 2 sources

                {
                    var1_1 = (Boolean)var1_1;
                    var11_12 = var1_1.booleanValue();
                    if (!var11_12) break block9;
                    var8_9.next();
                    var1_1 = this.h;
                    var1_1 = var1_1.getContentResolver();
                    var12_13 = "animator_duration_scale";
                    var13_14 = 1.0f;
                    var14_15 = Settings.Global.getFloat((ContentResolver)var1_1, (String)var12_13, (float)var13_14);
                    var12_13 = new Float(var14_15);
                    this.c = var9_10;
                    this.a = var8_9;
                    this.b = var4_5;
                    if ((var1_1 = var9_10.emit(var12_13, this)) != var2_3) ** continue;
                    return var2_3;
                }
            }
            var7_8.unregisterContentObserver((ContentObserver)var6_7);
            return Unit.a;
        }
        var7_8.unregisterContentObserver((ContentObserver)var6_7);
        throw var1_2;
    }
}

