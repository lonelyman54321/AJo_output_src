/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.ota.ApplicationManager;
import in.juspay.hypersdk.ota.UpdateResult;
import in.juspay.hypersdk.ota.UpdateResult$Ok;
import in.juspay.hypersdk.ota.UpdateTask;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

final class ApplicationManager$tryUpdate$1
extends Lambda
implements Function2 {
    final /* synthetic */ String $clientId;
    final /* synthetic */ boolean $initialized;
    final /* synthetic */ UpdateTask $newTask;
    final /* synthetic */ long $startTime;
    final /* synthetic */ ApplicationManager this$0;

    public ApplicationManager$tryUpdate$1(String string2, boolean bl2, ApplicationManager applicationManager, long l2, UpdateTask updateTask) {
        this.$clientId = string2;
        this.$initialized = bl2;
        this.this$0 = applicationManager;
        this.$startTime = l2;
        this.$newTask = updateTask;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void invoke(UpdateResult var1_1, JSONObject var2_2) {
        Intrinsics.checkNotNullParameter(var1_1, "updateResult");
        Intrinsics.checkNotNullParameter(var2_2, "persistentState");
        var3_3 = new StringBuilder("Running onFinish for '");
        var4_4 = this.$clientId;
        var3_3.append(var4_4);
        var5_5 = '\'';
        var3_3.append(var5_5);
        var3_3 = var3_3.toString();
        var4_4 = "ApplicationManager";
        JuspayLogger.d(var4_4, (String)var3_3);
        var6_6 = this.$initialized;
        if (!var6_6) {
            var3_3 = this.this$0;
            ApplicationManager.access$runCleanUp((ApplicationManager)var3_3, (JSONObject)var2_2, (UpdateResult)var1_1);
        }
        if (!(var7_7 = var1_1 instanceof UpdateResult$Ok)) ** GOTO lbl-1000
        var1_1 = ((UpdateResult$Ok)var1_1).getReleaseConfig().getPkg().getVersion();
        var2_2 = ApplicationManager.access$getReleaseConfig$p(this.this$0);
        if (var2_2 != null && (var2_2 = var2_2.getPkg()) != null) {
            var2_2 = var2_2.getVersion();
        } else {
            var7_7 = false;
            var2_2 = null;
        }
        var8_8 = Intrinsics.areEqual(var1_1, var2_2);
        if (!var8_8) {
            var8_8 = true;
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = false;
            var1_1 = null;
        }
        var2_2 = ApplicationManager.access$getRUNNING_UPDATE_TASKS$cp();
        var3_3 = this.$clientId;
        var2_2.remove(var3_3);
        var2_2 = this.this$0;
        var9_9 = this.$startTime;
        var11_10 /* !! */  = new StringBuilder("Update task finished for '");
        var12_11 = this.$clientId;
        var11_10 /* !! */  = h30_0.a(var11_10 /* !! */ , var12_11, "'.");
        ApplicationManager.access$logTimeTaken((ApplicationManager)var2_2, var9_9, (String)var11_10 /* !! */ );
        var2_2 = this.this$0;
        var3_3 = this.$newTask.getUpdateUUID();
        ApplicationManager.access$postMetrics((ApplicationManager)var2_2, (String)var3_3, var8_8);
    }
}

