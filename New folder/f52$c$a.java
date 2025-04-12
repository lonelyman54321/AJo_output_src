/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.entity.NotificationActions;
import com.ril.ajio.data.database.entity.Notifications;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class f52$c$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ Notifications b;
    public final /* synthetic */ g52 c;
    public final /* synthetic */ List d;

    public f52$c$a(fs0_2 fs0_22, Notifications notifications, g52 g522, ArrayList arrayList) {
        this.a = fs0_22;
        this.b = notifications;
        this.c = g522;
        this.d = arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object emit(Object var1_1, f80_0 var2_3) {
        block13: {
            block12: {
                var3_4 = this.d;
                var4_5 = this.b;
                var5_6 = var2_3 instanceof f52$c$a$a;
                if (!var5_6) ** GOTO lbl-1000
                var6_7 = var2_3;
                var6_7 = (f52$c$a$a)var2_3;
                var7_8 = var6_7.b;
                var8_9 = -1 << -1;
                var9_10 = var7_8 & var8_9;
                if (var9_10 != 0) {
                    var6_7.b = var7_8 -= var8_9;
                } else lbl-1000:
                // 2 sources

                {
                    var6_7 = new f52$c$a$a(this, (f80_0)var2_3);
                }
                var2_3 = var6_7.a;
                var10_11 = j90_0.COROUTINE_SUSPENDED;
                var8_9 = var6_7.b;
                var9_10 = 1;
                if (var8_9 != 0) {
                    if (var8_9 == var9_10) {
                        vl2_2.b(var2_3);
                        return Unit.a;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var2_3);
                var1_1 = (AppDataBase)var1_1;
                var2_3 = var1_1.notificationDao();
                try {
                    var11_12 = Calendar.getInstance();
                    var12_13 = var11_12.getTimeInMillis();
                    var11_12 = TimeUnit.DAYS;
                    var14_14 = 24;
                    var14_14 = var11_12.toMillis(var14_14);
                }
                catch (Exception var1_2) {
                    break block12;
                }
                var2_3.deleteOldRecords(var12_13 -= var14_14);
                var11_12 = var4_5.getOrderId();
                if (var11_12 != null) {
                    var11_12 = var4_5.getOrderId();
                    var16_15 = "getOrderId(...)";
                    Intrinsics.checkNotNullExpressionValue(var11_12, var16_15);
                    var11_12 = var2_3.getRecord((String)var11_12);
                    var12_13 = var2_3.insertNotification((Notifications)var4_5);
                    var4_5 = var11_12.getId();
                    if (var4_5 != null) {
                        var4_5 = var11_12.getId();
                        var11_12 = "getId(...)";
                        Intrinsics.checkNotNullExpressionValue(var4_5, (String)var11_12);
                        var2_3.deleteByID((String)var4_5);
                    }
                } else {
                    var12_13 = var2_3.insertNotification((Notifications)var4_5);
                }
                var17_16 = var2_3.getUnReadCount();
                var11_12 = this.c;
                var11_12 = var11_12.a;
                var11_12.y(var17_16);
                var11_12 = na_1.Companion;
                var11_12.getClass();
                na$a.b(var17_16);
                var14_14 = 0L;
                var17_16 = (int)(var12_13 == var14_14 ? 0 : (var12_13 < var14_14 ? -1 : 1));
                if (var17_16 <= 0) break block13;
                var4_5 = var3_4;
                var4_5 = var3_4;
                var17_16 = var4_5.isEmpty() ^ var9_10;
                if (var17_16 == 0) break block13;
                {
                    var4_5 = var3_4.iterator();
                    while ((var8_9 = (int)var4_5.hasNext()) != 0) {
                        var11_12 = var4_5.next();
                        var11_12 = (NotificationActions)var11_12;
                        var11_12 = var11_12.getParentId();
                        var16_15 = "getParentId(...)";
                        Intrinsics.checkNotNullExpressionValue(var11_12, var16_15);
                        var8_9 = var2_3.getNotification((String)var11_12);
                        if (var8_9 > 0) continue;
                        break block13;
                    }
                    var1_1 = var1_1.notificationActionDao();
                    var1_1.insertAllNotificationActins(var3_4);
                    break block13;
                }
            }
            var2_3 = yn3_0.a;
            var2_3.e(var1_2);
        }
        var1_1 = Unit.a;
        var6_7.b = var9_10;
        var2_3 = this.a;
        if ((var1_1 = var2_3.emit(var1_1, var6_7)) != var10_11) return Unit.a;
        return var10_11;
    }
}

