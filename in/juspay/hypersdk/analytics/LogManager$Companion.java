/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.analytics.LogManager$LogMode;
import in.juspay.hypersdk.services.SdkConfigService;
import in.juspay.hypersdk.services.Workspace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class LogManager$Companion {
    private LogManager$Companion() {
    }

    public /* synthetic */ LogManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void a(Context context) {
        LogManager$Companion.registerSavedWorkspaces$lambda$1(context);
    }

    public static final /* synthetic */ LogManager$LogMode access$getLogMode(LogManager$Companion logManager$Companion, JSONObject jSONObject) {
        return logManager$Companion.getLogMode(jSONObject);
    }

    public static /* synthetic */ void b(Context context, String string2) {
        LogManager$Companion.registerWorkspace$lambda$3(context, string2);
    }

    private final SharedPreferences getAnalyticsSharedPreferences(Context context) {
        context = context.getSharedPreferences("hyper_analytics", 0);
        Intrinsics.checkNotNullExpressionValue(context, "ctx.getSharedPreferences\u2026ODE_PRIVATE\n            )");
        return context;
    }

    private final LogManager$LogMode getLogMode(JSONObject object) {
        String string2 = "logsConfig";
        if ((object = object.optJSONObject(string2)) != null) {
            String string3 = "json-array";
            boolean bl2 = Intrinsics.areEqual(object = object.optString("workingLogger", string3), string2 = "byte-d-json");
            if (bl2) {
                return LogManager$LogMode.BYTE_D_JSON;
            }
            string2 = "both";
            boolean bl3 = Intrinsics.areEqual(object, string2);
            if (bl3) {
                return LogManager$LogMode.BOTH;
            }
        }
        return LogManager$LogMode.JSON_ARRAY;
    }

    private final List loadSavedWorkspaces(Context context) {
        int n3;
        Object object = this.getAnalyticsSharedPreferences(context);
        Object object2 = "saved_workspaces";
        ArrayList<Workspace> arrayList = null;
        if ((object = object.getString((String)object2, null)) != null && (object = StringsKt.a0((CharSequence)object, object2 = new String[]{","}, false, 0, n3 = 6)) != null) {
            int n4 = yx_2.o((Iterable)object, 10);
            arrayList = new ArrayList<Workspace>(n4);
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object.next();
                Workspace workspace = new Workspace(context, (String)object2);
                arrayList.add(workspace);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList<Workspace>();
        }
        return arrayList;
    }

    private final void registerSavedWorkspaces(Context context) {
        kw1_2 kw1_22 = new kw1_2(context, 0);
        ExecutorManager.runOnLogsPool(kw1_22);
    }

    private static final void registerSavedWorkspaces$lambda$1(Context context) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(context, "$ctx");
        long l2 = Thread.currentThread().getId();
        ExecutorManager.setLogsThreadId(l2);
        Iterator iterator = LogManager.Companion.loadSavedWorkspaces(context).iterator();
        while (bl2 = iterator.hasNext()) {
            Workspace workspace = (Workspace)iterator.next();
            JSONObject jSONObject = SdkConfigService.getCachedSdkConfig(workspace);
            if (jSONObject == null) continue;
            LogManager$Companion logManager$Companion = LogManager.Companion;
            logManager$Companion.registerWorkspace(context, workspace, jSONObject, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final LogManager registerWorkspace(Context object, Workspace workspace, JSONObject jSONObject, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                block3: {
                    String string2;
                    block4: {
                        try {
                            string2 = workspace.getPath();
                            object2 = LogManager.access$getGLOBAL_LOG_MANAGER_MAP$cp();
                            object2 = object2.get(string2);
                            object2 = (LogManager)object2;
                            if (object2 != null) break block3;
                            if (!bl2) break block4;
                            jw1_2 jw1_22 = new jw1_2((Context)object, string2);
                            ExecutorManager.runOnBackgroundThread(jw1_22);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = null;
                    object2 = new LogManager(workspace, jSONObject, null);
                    object = LogManager.access$getGLOBAL_LOG_MANAGER_MAP$cp();
                    object.put(string2, object2);
                }
                return object2;
            }
            throw throwable2;
        }
    }

    private static final void registerWorkspace$lambda$3(Context context, String string2) {
        Intrinsics.checkNotNullParameter(context, "$ctx");
        Intrinsics.checkNotNullParameter(string2, "$workspacePath");
        LogManager.Companion.saveWorkspace(context, string2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void saveWorkspace(Context var1_1, String var2_2) {
        block9: {
            block7: {
                block8: {
                    block6: {
                        var1_1 /* !! */  = this.getAnalyticsSharedPreferences(var1_1 /* !! */ );
                        var3_3 = "saved_workspaces";
                        var4_4 = false;
                        var5_5 = null;
                        var6_6 = var1_1 /* !! */ .getString(var3_3, null);
                        if (var6_6 == null) ** GOTO lbl-1000
                        var7_7 = new String[]{","};
                        var8_8 = 6;
                        if ((var7_7 = StringsKt.a0(var6_6, (String[])var7_7, false, 0, var8_8)) != null) {
                            var9_9 = var7_7.contains(var2_2);
                            var7_7 = var9_9;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_10 = false;
                            var7_7 = null;
                        }
                        var10_11 = Boolean.TRUE;
                        var8_8 = (int)Intrinsics.areEqual(var7_7, var10_11);
                        if (var8_8 == 0) break block6;
                        var2_2 = null;
                        break block7;
                    }
                    var5_5 = Boolean.FALSE;
                    var4_4 = Intrinsics.areEqual(var7_7, var5_5);
                    if (!var4_4) break block8;
                    var5_5 = new Comparable<Boolean>();
                    var5_5.append(var6_6);
                    var11_12 = ',';
                    var5_5.append(var11_12);
                    var5_5.append(var2_2);
                    var2_2 = var5_5.toString();
                    break block7;
                }
                if (var7_7 != null) break block9;
            }
            if (var2_2 != null) {
                var1_1 /* !! */  = var1_1 /* !! */ .edit().putString(var3_3, var2_2);
                var1_1 /* !! */ .apply();
            }
            return;
        }
        var1_1 /* !! */  = new NoWhenBranchMatchedException();
        throw var1_1 /* !! */ ;
    }

    public final LogManager registerWorkspace(Context context, Workspace object, JSONObject object2) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(object, "workspace");
        String string2 = "sdkConfig";
        Intrinsics.checkNotNullParameter(object2, string2);
        boolean bl2 = true;
        object = this.registerWorkspace(context, (Workspace)object, (JSONObject)object2, bl2);
        object2 = LogManager.access$getINIT_STATE$cp();
        boolean bl3 = ((AtomicBoolean)object2).getAndSet(bl2);
        if (!bl3) {
            this.registerSavedWorkspaces(context);
        }
        return object;
    }
}

