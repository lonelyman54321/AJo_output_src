/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import android.content.Context;
import android.util.Log;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.ota.ApplicationManager$Companion;
import in.juspay.hypersdk.ota.ApplicationManager$tryUpdate$1;
import in.juspay.hypersdk.ota.Constants;
import in.juspay.hypersdk.ota.Mode;
import in.juspay.hypersdk.ota.Mode$Beta;
import in.juspay.hypersdk.ota.Mode$CUG;
import in.juspay.hypersdk.ota.Mode$DevQa;
import in.juspay.hypersdk.ota.Mode$Release;
import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.ReleaseConfig$Companion;
import in.juspay.hypersdk.ota.ReleaseConfig$Config;
import in.juspay.hypersdk.ota.ReleaseConfig$PackageManifest;
import in.juspay.hypersdk.ota.ReleaseConfig$Resource;
import in.juspay.hypersdk.ota.ReleaseConfig$ResourceManifest;
import in.juspay.hypersdk.ota.ReleaseConfig$Split;
import in.juspay.hypersdk.ota.UpdateResult;
import in.juspay.hypersdk.ota.UpdateResult$Error$RCFetchError;
import in.juspay.hypersdk.ota.UpdateResult$Error$Unknown;
import in.juspay.hypersdk.ota.UpdateResult$NA;
import in.juspay.hypersdk.ota.UpdateResult$Ok;
import in.juspay.hypersdk.ota.UpdateResult$PackageUpdateTimeout;
import in.juspay.hypersdk.ota.UpdateResult$ReleaseConfigFetchTimeout;
import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.ota.WaitTask;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

public final class ApplicationManager {
    private static final ConcurrentMap CONTEXT_MAP;
    public static final ApplicationManager$Companion Companion;
    private static final ConcurrentMap RUNNING_UPDATE_TASKS;
    public static final String TAG = "ApplicationManager";
    private String applicationContent;
    private final Context ctx;
    private final FileProviderService fileProviderService;
    private WaitTask loadWaitTask;
    private final String metricsEndPoint;
    private Mode mode;
    private final NetUtils netUtils;
    private ReleaseConfig releaseConfig;
    private final String releaseConfigTemplateUrl;
    private final SessionInfo sessionInfo;
    private boolean shouldUpdate;
    private final SdkTracker tracker;
    private final Workspace workspace;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(null);
        Companion = concurrentHashMap;
        CONTEXT_MAP = concurrentHashMap = new ConcurrentHashMap();
        RUNNING_UPDATE_TASKS = concurrentHashMap = new ConcurrentHashMap();
    }

    public ApplicationManager(Context context, String object, Workspace object2, SdkTracker sdkTracker, SessionInfo sessionInfo, FileProviderService fileProviderService, String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(object, "releaseConfigTemplateUrl");
        Intrinsics.checkNotNullParameter(object2, "workspace");
        Intrinsics.checkNotNullParameter(sdkTracker, "tracker");
        Intrinsics.checkNotNullParameter(sessionInfo, "sessionInfo");
        String string3 = "fileProviderService";
        Intrinsics.checkNotNullParameter(fileProviderService, string3);
        this.ctx = context;
        this.releaseConfigTemplateUrl = object;
        this.workspace = object2;
        this.tracker = sdkTracker;
        this.sessionInfo = sessionInfo;
        this.fileProviderService = fileProviderService;
        this.metricsEndPoint = string2;
        this.shouldUpdate = bl2 = true;
        int n3 = 10000;
        this.netUtils = object = new NetUtils(n3, n3);
        this.mode = object2 = Mode$Release.INSTANCE;
        this.applicationContent = "";
        this.loadWaitTask = object2 = new WaitTask();
        if (string2 == null) {
            bl2 = false;
            context = null;
        }
        ((NetUtils)object).setTrackMetrics(bl2);
    }

    public static /* synthetic */ Pair a(ApplicationManager applicationManager, String string2) {
        return ApplicationManager.readSplits$lambda$15$lambda$14(string2, applicationManager);
    }

    public static final /* synthetic */ ConcurrentMap access$getRUNNING_UPDATE_TASKS$cp() {
        return RUNNING_UPDATE_TASKS;
    }

    public static final /* synthetic */ ReleaseConfig access$getReleaseConfig$p(ApplicationManager applicationManager) {
        return applicationManager.releaseConfig;
    }

    public static final /* synthetic */ void access$logTimeTaken(ApplicationManager applicationManager, long l2, String string2) {
        applicationManager.logTimeTaken(l2, string2);
    }

    public static final /* synthetic */ Unit access$postMetrics(ApplicationManager applicationManager, String string2, boolean bl2) {
        return applicationManager.postMetrics(string2, bl2);
    }

    public static final /* synthetic */ void access$runCleanUp(ApplicationManager applicationManager, JSONObject jSONObject, UpdateResult updateResult) {
        applicationManager.runCleanUp(jSONObject, updateResult);
    }

    public static /* synthetic */ String b(ApplicationManager applicationManager, String string2) {
        return ApplicationManager.readFileAsync$lambda$12(applicationManager, string2);
    }

    private final void cleanUpDir(String string2, List object) {
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3 = new StringBuilder("requiredFiles for ");
        ((StringBuilder)object3).append(string2);
        char c2 = ' ';
        ((StringBuilder)object3).append(c2);
        ((StringBuilder)object3).append(object);
        object3 = ((StringBuilder)object3).toString();
        String string3 = TAG;
        JuspayLogger.d(string3, (String)object3);
        object3 = this.fileProviderService.listFiles(string2);
        if (object3 == null || (object3 = tp_2.M((Object[])object3)) == null) {
            object3 = mz0_2.a;
        }
        if (bl3 = (object = ApplicationManager$Companion.access$setDifference((ApplicationManager$Companion)(object2 = Companion), (List)(object3 = ApplicationManager$Companion.access$setDifference((ApplicationManager$Companion)object2, (List)object3, (List)object)), (List)object)).isEmpty()) {
            object = new StringBuilder("No clean-up required for dir: ");
            ((StringBuilder)object).append(string2);
            string2 = ((StringBuilder)object).toString();
            JuspayLogger.d(string3, string2);
            return;
        }
        long l2 = System.currentTimeMillis();
        object3 = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            Object object4 = this.fileProviderService;
            Object object5 = this.ctx;
            CharSequence charSequence = new StringBuilder();
            charSequence.append(string2);
            char c3 = '/';
            charSequence.append(c3);
            charSequence.append((String)object2);
            charSequence = charSequence.toString();
            boolean bl4 = ((FileProviderService)object4).deleteFileFromInternalStorage((Context)object5, (String)charSequence);
            if (bl4) {
                object5 = "Deleted file ";
                object4 = new StringBuilder((String)object5);
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(" from ");
                ((StringBuilder)object4).append(string2);
                object2 = ((StringBuilder)object4).toString();
                JuspayLogger.d(string3, (String)object2);
                bl2 = false;
                object2 = null;
            }
            if (object2 == null) continue;
            ((ArrayList)object3).add(object2);
        }
        boolean bl5 = ((ArrayList)object3).isEmpty();
        if (!bl5) {
            string2 = new JSONObject();
            string3 = "Failed to delete some files during clean up.";
            string2 = string2.put("message", (Object)string3).put("failures", object3);
            Intrinsics.checkNotNullExpressionValue(string2, "JSONObject()\n           \u2026put(\"failures\", failures)");
            object = "clean_up_error";
            this.trackError((String)object, (JSONObject)string2);
        }
        object2 = this;
        ApplicationManager.logTimeTaken$default(this, l2, null, 2, null);
    }

    private final int generateNewToss(long l2) {
        cd2_2.a.getClass();
        int n3 = cd2_2.b.d(0, 99);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ts", l2);
        jSONObject.put("toss", n3);
        Workspace workspace = this.workspace;
        String string2 = jSONObject.toString();
        workspace.writeToSharedPreference("patch_toss", string2);
        return n3;
    }

    private final String getReleaseConfigUrl(String object) {
        block6: {
            block3: {
                int n3;
                String string2;
                String string3;
                boolean bl2;
                Object object2;
                int n4;
                block5: {
                    block4: {
                        block2: {
                            int n7 = 3;
                            int n8 = 2;
                            int n10 = 1;
                            n4 = this.getTimedToss();
                            object2 = this.mode;
                            bl2 = object2 instanceof Mode$Release;
                            string3 = "";
                            string2 = "format(format, *args)";
                            n3 = 4;
                            if (!bl2) break block2;
                            object2 = StringCompanionObject.INSTANCE;
                            object2 = this.releaseConfigTemplateUrl;
                            Integer n14 = n4;
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = string3;
                            objectArray[n10] = object;
                            objectArray[n8] = "release";
                            objectArray[n7] = n14;
                            object = xh2_0.a(objectArray, n3, (String)object2, string2);
                            break block3;
                        }
                        bl2 = object2 instanceof Mode.CUG;
                        if (!bl2) break block4;
                        object2 = StringCompanionObject.INSTANCE;
                        object2 = this.releaseConfigTemplateUrl;
                        Integer n15 = n4;
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = string3;
                        objectArray[n10] = object;
                        objectArray[n8] = "cug";
                        objectArray[n7] = n15;
                        object = xh2_0.a(objectArray, n3, (String)object2, string2);
                        break block3;
                    }
                    bl2 = object2 instanceof Mode.Beta;
                    string3 = "sandbox.";
                    if (!bl2) break block5;
                    object2 = StringCompanionObject.INSTANCE;
                    object2 = this.releaseConfigTemplateUrl;
                    Integer n16 = n4;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string3;
                    objectArray[n10] = object;
                    objectArray[n8] = "beta";
                    objectArray[n7] = n16;
                    object = xh2_0.a(objectArray, n3, (String)object2, string2);
                    break block3;
                }
                bl2 = object2 instanceof Mode$DevQa;
                if (!bl2) break block6;
                Object object3 = StringCompanionObject.INSTANCE;
                object3 = this.releaseConfigTemplateUrl;
                String string4 = "devqa-";
                Object[] objectArray = new StringBuilder(string4);
                object2 = ((Mode$DevQa)object2).getTicket();
                objectArray.append((String)object2);
                object2 = objectArray.toString();
                Integer n17 = n4;
                objectArray = new Object[n3];
                objectArray[0] = string3;
                objectArray[n10] = object;
                objectArray[n8] = object2;
                objectArray[n7] = n17;
                object = xh2_0.a(objectArray, n3, (String)object3, string2);
            }
            return object;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int getTimedToss() {
        Exception exception2;
        JSONObject jSONObject;
        long l2;
        block4: {
            long l3;
            Object object = this.workspace;
            String string2 = "patch_toss";
            object = ((Workspace)object).getFromSharedPreference(string2, null);
            l2 = System.currentTimeMillis();
            if (object == null) return this.generateNewToss(l2);
            try {
                jSONObject = new JSONObject((String)object);
                object = "ts";
                l3 = jSONObject.optLong((String)object);
                l3 = l2 - l3;
            }
            catch (Exception exception2) {
                break block4;
            }
            long l4 = 604800;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 > 0) {
                return (int)((long)this.generateNewToss(l2));
            }
            object = "toss";
            return (int)((long)jSONObject.optInt((String)object));
        }
        jSONObject = new JSONObject();
        String string3 = exception2.getMessage();
        string3 = jSONObject.put("message", (Object)string3);
        Intrinsics.checkNotNullExpressionValue(string3, "JSONObject().put(\"message\", e.message)");
        this.trackError("toss_generation_error", (JSONObject)string3);
        return this.generateNewToss(l2);
    }

    private final void logTimeTaken(long l2, String string2) {
        long l3 = System.currentTimeMillis() - l2;
        String string3 = Ov2.a(l3, "Time ", "ms");
        String string4 = TAG;
        if (string2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            char c2 = ' ';
            stringBuilder.append(c2);
            stringBuilder.append(string3);
            string3 = stringBuilder.toString();
            JuspayLogger.d(string4, string3);
        } else {
            JuspayLogger.d(string4, string3);
        }
    }

    public static /* synthetic */ void logTimeTaken$default(ApplicationManager applicationManager, long l2, String string2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        applicationManager.logTimeTaken(l2, string2);
    }

    private final Unit postMetrics(String object, boolean bl2) {
        String string2 = this.metricsEndPoint;
        if (string2 != null) {
            NetUtils netUtils = this.netUtils;
            String string3 = this.sessionInfo.getSessionId();
            if (string3 == null) {
                string3 = "";
            }
            netUtils.postMetrics(string2, string3, (String)object, bl2);
            object = Unit.a;
        } else {
            object = null;
        }
        return object;
    }

    private final String readFile(String string2) {
        FileProviderService fileProviderService = this.fileProviderService;
        Context context = this.ctx;
        StringBuilder stringBuilder = new StringBuilder("app/");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        string2 = fileProviderService.readFromFile(context, string2);
        Intrinsics.checkNotNullExpressionValue(string2, "fileProviderService.read\u2026ile(ctx, \"app/$filePath\")");
        return string2;
    }

    private final Future readFileAsync(String string2) {
        ApplicationManager$Companion applicationManager$Companion = Companion;
        jp_2 jp_22 = new jp_2(this, string2);
        return ApplicationManager$Companion.access$doAsync(applicationManager$Companion, jp_22);
    }

    private static final String readFileAsync$lambda$12(ApplicationManager applicationManager, String string2) {
        Intrinsics.checkNotNullParameter(applicationManager, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$filePath");
        return applicationManager.readFile(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final ReleaseConfig readReleaseConfig(Object object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        try {
            synchronized (object) {
                object5 = "config.json";
                object5 = this.readFileAsync((String)object5);
                object4 = "pkg.json";
                object4 = this.readFileAsync((String)object4);
                object3 = "resources.json";
                object3 = this.readFileAsync((String)object3);
                object2 = ReleaseConfig.Companion;
            }
        }
        catch (Exception exception) {
            object5 = new StringBuilder("Failed to read local release config. ");
            ((StringBuilder)object5).append(exception);
            object5 = ((StringBuilder)object5).toString();
            object4 = TAG;
            JuspayLogger.e((String)object4, (String)object5);
            this.trackReadReleaseConfigError(exception);
            return null;
        }
        {
            object5 = object5.get();
            Object object6 = "configFuture.get()";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
            object5 = (String)object5;
            object5 = ((ReleaseConfig$Companion)object2).deSerializeConfig-IoAF18A((String)object5);
            object6 = tl2_2.a(object5);
            if (object6 != null) {
                this.trackReadReleaseConfigError((Throwable)object6);
                object5 = Constants.INSTANCE;
                object5 = ((Constants)object5).getDEFAULT_CONFIG();
            }
            object5 = (ReleaseConfig$Config)object5;
            object4 = object4.get();
            object6 = "pkgFuture.get()";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
            object4 = (String)object4;
            object4 = ((ReleaseConfig$Companion)object2).deSerializePackage-IoAF18A((String)object4);
            vl2_2.b(object4);
            object4 = (ReleaseConfig$PackageManifest)object4;
            object3 = object3.get();
            object6 = "resFuture.get()";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
            object3 = (String)object3;
            object3 = ((ReleaseConfig$Companion)object2).deSerializeResources-IoAF18A((String)object3);
            object2 = tl2_2.a(object3);
            if (object2 != null) {
                this.trackReadReleaseConfigError((Throwable)object2);
                object3 = Constants.INSTANCE;
                object3 = ((Constants)object3).getDEFAULT_RESOURCES();
            }
            object3 = (ReleaseConfig$ResourceManifest)object3;
            object2 = TAG;
            object6 = "Local release config loaded.";
            JuspayLogger.d((String)object2, (String)object6);
            return new ReleaseConfig((ReleaseConfig$Config)object5, (ReleaseConfig$PackageManifest)object4, (ReleaseConfig$ResourceManifest)object3);
        }
    }

    private final String readResourceByFileName(String string2) {
        string2 = kp1_0.c("resources/", string2);
        return this.readFile(string2);
    }

    private final JSONObject readSplits(List iterator) {
        boolean bl2;
        Object object;
        JSONObject jSONObject = new JSONObject();
        int n3 = yx_2.o((Iterable)((Object)iterator), 10);
        Object object2 = new ArrayList(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (String)iterator.next();
            ApplicationManager$Companion applicationManager$Companion = Companion;
            kp_2 kp_22 = new kp_2(this, (String)object);
            object = ApplicationManager$Companion.access$doAsync(applicationManager$Companion, kp_22);
            ((ArrayList)object2).add(object);
        }
        iterator = ((ArrayList)object2).iterator();
        while (bl2 = iterator.hasNext()) {
            object2 = (Pair)((Future)iterator.next()).get();
            object = (String)((Pair)object2).a;
            object2 = (String)((Pair)object2).b;
            jSONObject.put((String)object, object2);
        }
        return jSONObject;
    }

    private static final Pair readSplits$lambda$15$lambda$14(String string2, ApplicationManager object) {
        Intrinsics.checkNotNullParameter(string2, "$it");
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((ApplicationManager)object).readSplit(string2);
        Pair pair = new Pair(string2, object);
        return pair;
    }

    private final void runCleanUp(JSONObject object, UpdateResult object2) {
        Object object3;
        boolean bl2;
        Object object4 = new StringBuilder("runCleanUp: updateResult: ");
        ((StringBuilder)object4).append(object2);
        object4 = ((StringBuilder)object4).toString();
        String string2 = TAG;
        JuspayLogger.d(string2, (String)object4);
        boolean bl3 = object2 instanceof UpdateResult$Ok;
        if (bl3) {
            object2 = ((UpdateResult$Ok)object2).getReleaseConfig();
        } else {
            bl2 = false;
            object2 = null;
        }
        object4 = this.releaseConfig;
        if (object4 == null || (object4 = ((ReleaseConfig)object4).getPkg()) == null || (object4 = ((ReleaseConfig$PackageManifest)object4).getFileNames()) == null) {
            object4 = mz0_2.a;
        }
        Object object5 = "runCleanUp: Current splits: ";
        Object object6 = new StringBuilder((String)object5);
        ((StringBuilder)object6).append(object4);
        object6 = ((StringBuilder)object6).toString();
        JuspayLogger.d(string2, (String)object6);
        if (object2 == null || (object6 = object2.getPkg()) == null || (object6 = ((ReleaseConfig$PackageManifest)object6).getFileNames()) == null) {
            object6 = mz0_2.a;
        }
        Object object7 = "runCleanUp: New splits: ";
        object5 = new StringBuilder((String)object7);
        ((StringBuilder)object5).append(object6);
        object5 = ((StringBuilder)object5).toString();
        JuspayLogger.d(string2, (String)object5);
        object4 = CollectionsKt.W((Iterable)object6, (Collection)object4);
        int n3 = 10;
        int n4 = yx_2.o((Iterable)object4, n3);
        object6 = new ArrayList(n4);
        object4 = object4.iterator();
        while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            object7 = (String)object4.next();
            object3 = Companion;
            object7 = ApplicationManager$Companion.access$toUnzippedName((ApplicationManager$Companion)object3, (String)object7);
            ((ArrayList)object6).add(object7);
        }
        this.cleanUpDir("app/package", (List)object6);
        object4 = this.releaseConfig;
        if (object4 != null && (object4 = ((ReleaseConfig)object4).getResources()) != null) {
            n4 = yx_2.o((Iterable)object4, n3);
            object6 = new ArrayList(n4);
            object4 = object4.iterator();
            while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object7 = ((ReleaseConfig$Resource)object4.next()).getFileName();
                ((ArrayList)object6).add(object7);
            }
        } else {
            object6 = mz0_2.a;
        }
        if (object2 != null && (object2 = object2.getResources()) != null) {
            n4 = yx_2.o((Iterable)object2, n3);
            object4 = new ArrayList(n4);
            object2 = object2.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object7 = ((ReleaseConfig$Resource)object2.next()).getFileName();
                ((ArrayList)object4).add(object7);
            }
        } else {
            object4 = mz0_2.a;
        }
        object2 = CollectionsKt.W((Iterable)object4, (Collection)object6);
        this.cleanUpDir("app/resources", (List)object2);
        object2 = object.optJSONObject("SAVED_PACKAGE_UPDATE");
        object4 = "dir";
        if (object2 != null) {
            object2 = object2.optString((String)object4);
        } else {
            bl2 = false;
            object2 = null;
        }
        object6 = "SAVED_RESOURCE_UPDATE";
        object = object.optJSONObject((String)object6);
        object = object != null ? object.optString((String)object4) : null;
        object4 = this.workspace.getCacheRoot().list();
        if (object4 == null || (object4 = tp_2.M((Object[])object4)) == null) {
            object4 = new ArrayList();
        }
        n3 = yx_2.o((Iterable)object4, n3);
        object6 = new ArrayList(n3);
        object4 = object4.iterator();
        while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            object5 = (String)object4.next();
            object7 = this.workspace;
            object3 = "it";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
            object5 = ((Workspace)object7).openInCache((String)object5);
            ((ArrayList)object6).add(object5);
        }
        object4 = new Regex("temp-.*-\\d+");
        object5 = new ArrayList();
        object6 = ((ArrayList)object6).iterator();
        while ((n4 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
            String string3;
            object3 = object7 = object6.next();
            object3 = (File)object7;
            boolean bl4 = ((File)object3).isDirectory();
            if (!bl4 || (bl4 = Intrinsics.areEqual(string3 = ((File)object3).getName(), object2)) || (bl4 = Intrinsics.areEqual(string3 = ((File)object3).getName(), object))) continue;
            object3 = ((File)object3).getName();
            string3 = "it.name";
            Intrinsics.checkNotNullExpressionValue(object3, string3);
            boolean bl5 = ((Regex)object4).c((CharSequence)object3);
            if (!bl5) continue;
            ((ArrayList)object5).add(object7);
        }
        object = new ArrayList();
        object2 = ((ArrayList)object5).iterator();
        while (bl3 = object2.hasNext()) {
            object4 = (File)object2.next();
            object6 = new StringBuilder("Deleting temp directory ");
            object5 = ((File)object4).getName();
            ((StringBuilder)object6).append((String)object5);
            object6 = ((StringBuilder)object6).toString();
            JuspayLogger.d(string2, (String)object6);
            boolean bl6 = qm0_1.d((File)object4);
            if (!bl6) {
                object4 = ((File)object4).getName();
            } else {
                bl3 = false;
                object4 = null;
            }
            if (object4 == null) continue;
            ((ArrayList)object).add(object4);
        }
        bl2 = ((ArrayList)object).isEmpty();
        if (!bl2) {
            object2 = new JSONObject();
            string2 = "Failed to delete some temporary directories during clean-up.";
            object2 = object2.put("message", (Object)string2);
            object4 = "failures";
            object = object2.put((String)object4, object);
            Intrinsics.checkNotNullExpressionValue(object, "JSONObject().put(\"messag\u2026put(\"failures\", failures)");
            object2 = "clean_up_error";
            this.trackError((String)object2, (JSONObject)object);
        }
    }

    private final void trackBoot(ReleaseConfig jSONObject, long l2) {
        boolean bl2;
        Object object = jSONObject.component1();
        ReleaseConfig$PackageManifest releaseConfig$PackageManifest = jSONObject.component2();
        jSONObject = jSONObject.component3();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject = jSONObject.iterator();
        while (bl2 = jSONObject.hasNext()) {
            Object object2 = (ReleaseConfig$Resource)jSONObject.next();
            String string2 = ((ReleaseConfig$Resource)object2).getName();
            object2 = ((ReleaseConfig$Resource)object2).getVersion();
            jSONObject2.put(string2, object2);
        }
        jSONObject = new JSONObject();
        object = ((ReleaseConfig$Config)object).getVersion();
        jSONObject = jSONObject.put("config_version", object);
        object = releaseConfig$PackageManifest.getVersion();
        jSONObject = jSONObject.put("package_version", object).put("resource_versions", (Object)jSONObject2);
        long l3 = System.currentTimeMillis() - l2;
        jSONObject = jSONObject.put("time_taken", l3);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           \u2026TimeMillis() - startTime)");
        this.trackInfo("boot", jSONObject);
    }

    private final void trackError(String string2, String string3, Exception object) {
        Object object2 = new JSONObject();
        String string4 = "message";
        string3 = object2.put(string4, (Object)string3);
        if (object != null) {
            object = Log.getStackTraceString((Throwable)object);
            object2 = "stack_trace";
            string3.put((String)object2, object);
        }
        Intrinsics.checkNotNullExpressionValue(string3, "value");
        this.trackError(string2, (JSONObject)string3);
    }

    private final void trackError(String string2, JSONObject jSONObject) {
        this.trackGeneric(string2, jSONObject, "error");
    }

    public static /* synthetic */ void trackError$default(ApplicationManager applicationManager, String string2, String string3, Exception exception, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            exception = null;
        }
        applicationManager.trackError(string2, string3, exception);
    }

    private final void trackGeneric(String string2, JSONObject jSONObject, String string3) {
        this.tracker.trackLifecycle("hypersdk", string3, TAG, string2, jSONObject);
    }

    private final void trackInfo(String string2, JSONObject jSONObject) {
        this.trackGeneric(string2, jSONObject, "info");
    }

    private final void trackReadReleaseConfigError(Throwable object) {
        boolean bl2 = object instanceof Exception;
        if (bl2) {
            Object object2 = new JSONObject();
            String string2 = ((Throwable)object).getMessage();
            String string3 = "error";
            object2 = object2.put(string3, (Object)string2);
            object = Log.getStackTraceString((Throwable)object);
            string2 = "stack_trace";
            object = object2.put(string2, object);
            Intrinsics.checkNotNullExpressionValue(object, "value");
            object2 = "read_release_config_error";
            this.trackError((String)object2, (JSONObject)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void trackUpdateResult(UpdateResult object) {
        boolean bl2 = object instanceof UpdateResult$Ok;
        if (bl2) {
            object = "OK";
        } else {
            bl2 = object instanceof UpdateResult$PackageUpdateTimeout;
            if (bl2) {
                object = "PACKAGE_TIMEOUT";
            } else {
                UpdateResult$ReleaseConfigFetchTimeout updateResult$ReleaseConfigFetchTimeout = UpdateResult$ReleaseConfigFetchTimeout.INSTANCE;
                bl2 = Intrinsics.areEqual(object, updateResult$ReleaseConfigFetchTimeout);
                if (bl2) {
                    object = "RELEASE_CONFIG_TIMEOUT";
                } else {
                    UpdateResult$Error$Unknown updateResult$Error$Unknown;
                    UpdateResult$Error$RCFetchError updateResult$Error$RCFetchError = UpdateResult$Error$RCFetchError.INSTANCE;
                    bl2 = Intrinsics.areEqual(object, updateResult$Error$RCFetchError);
                    String string2 = "ERROR";
                    if (bl2 || (bl2 = Intrinsics.areEqual(object, updateResult$Error$Unknown = UpdateResult$Error$Unknown.INSTANCE))) {
                        object = string2;
                    } else {
                        UpdateResult$NA updateResult$NA = UpdateResult$NA.INSTANCE;
                        boolean bl3 = Intrinsics.areEqual(object, updateResult$NA);
                        if (!bl3) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        object = "NA";
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        object = jSONObject.put("result", object);
        Intrinsics.checkNotNullExpressionValue(object, "JSONObject().put(\"result\", result)");
        this.trackInfo("update_result", (JSONObject)object);
    }

    private final ReleaseConfig tryUpdate(String string2, boolean bl2, Object object) {
        UpdateTask updateTask;
        ApplicationManager applicationManager = this;
        String string3 = string2;
        long l2 = System.currentTimeMillis();
        String string4 = this.getReleaseConfigUrl(string2);
        Object object2 = this.fileProviderService;
        Object object3 = this.releaseConfig;
        Object object4 = this.tracker;
        Object object5 = this.netUtils;
        SessionInfo sessionInfo = this.sessionInfo;
        Object object6 = updateTask;
        updateTask = new UpdateTask(string4, (FileProviderService)object2, (ReleaseConfig)object3, object, (SdkTracker)object4, (NetUtils)object5, sessionInfo);
        if ((object4 = RUNNING_UPDATE_TASKS.putIfAbsent(string2, updateTask)) != null) {
            object6 = object4;
        }
        boolean bl3 = Intrinsics.areEqual(object6, updateTask);
        string4 = TAG;
        if (bl3) {
            object4 = new StringBuilder("No running update tasks for '");
            ((StringBuilder)object4).append(string3);
            ((StringBuilder)object4).append("', starting new task.");
            object4 = ((StringBuilder)object4).toString();
            JuspayLogger.d(string4, (String)object4);
            object4 = object2;
            object5 = string2;
            object3 = updateTask;
            object2 = new ApplicationManager$tryUpdate$1(string2, bl2, this, l2, updateTask);
            updateTask.run((Function2)object2);
        } else {
            object4 = new StringBuilder("Update task already running for '");
            ((StringBuilder)object4).append(string3);
            object5 = "'.";
            ((StringBuilder)object4).append((String)object5);
            object4 = ((StringBuilder)object4).toString();
            JuspayLogger.d(string4, (String)object4);
        }
        object4 = applicationManager.tracker;
        object4 = ((UpdateTask)object6).await((SdkTracker)object4);
        applicationManager.trackUpdateResult((UpdateResult)object4);
        boolean bl4 = object4 instanceof UpdateResult$Ok;
        if (bl4) {
            object4 = ((UpdateResult$Ok)object4).getReleaseConfig();
        } else {
            bl4 = object4 instanceof UpdateResult$PackageUpdateTimeout;
            if (bl4) {
                if ((object4 = ((UpdateResult$PackageUpdateTimeout)object4).getReleaseConfig()) == null) {
                    object4 = applicationManager.releaseConfig;
                }
            } else {
                object5 = UpdateResult$Error$RCFetchError.INSTANCE;
                bl3 = Intrinsics.areEqual(object4, object5);
                if (bl3) {
                    object4 = applicationManager.mode;
                    object5 = Mode$Release.INSTANCE;
                    bl3 = Intrinsics.areEqual(object4, object5);
                    if (!bl3) {
                        JuspayLogger.d(string4, "Failed to fetch release config, re-trying in release mode.");
                        ((UpdateTask)object6).awaitOnFinish$hyper_sdk_release();
                        applicationManager.mode = object5;
                        bl3 = true;
                        object5 = object;
                        object4 = applicationManager.tryUpdate(string3, bl3, object);
                    } else {
                        object4 = applicationManager.releaseConfig;
                    }
                } else {
                    object4 = applicationManager.releaseConfig;
                }
            }
        }
        applicationManager.logTimeTaken(l2, "tryUpdate");
        return object4;
    }

    public final void clearContextMap() {
        boolean bl2;
        Iterator iterator = CONTEXT_MAP.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            ConcurrentMap concurrentMap = CONTEXT_MAP;
            concurrentMap.remove(string2);
        }
    }

    public final String getApplicationContent() {
        this.loadWaitTask.get();
        return this.applicationContent;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final boolean getShouldUpdate() {
        return this.shouldUpdate;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final void loadApplication(String object) {
        Throwable throwable2;
        long l2;
        String string2;
        block8: {
            block10: {
                Exception exception2;
                Object object2;
                String string3;
                String string4;
                block9: {
                    int n3;
                    Object object3;
                    Object object4;
                    Object object5;
                    block11: {
                        boolean bl2;
                        block14: {
                            block13: {
                                Object object6;
                                block12: {
                                    Object t3;
                                    string2 = "loadApplication";
                                    string4 = TAG;
                                    string3 = "Critical exception while loading app! ";
                                    object2 = "\n                window.document.title=\"";
                                    object5 = "Loading package version: ";
                                    Intrinsics.checkNotNullParameter(object, "unSanitizedClientId");
                                    object = ApplicationManager$Companion.access$sanitizeClientId(Companion, (String)object);
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject = jSONObject.put("client_id", object);
                                    Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().put(\"client_id\", clientId)");
                                    String string5 = "init";
                                    this.trackInfo(string5, jSONObject);
                                    l2 = System.currentTimeMillis();
                                    object4 = this.releaseConfig;
                                    if (object4 != null) break block11;
                                    object3 = this.ctx;
                                    object4 = new WeakReference(object3);
                                    object3 = CONTEXT_MAP;
                                    object6 = object3.get(object);
                                    if (!((object6 = (WeakReference)object6) == null ? (object6 = object3.putIfAbsent(object, object4)) != null : (t3 = ((Reference)object6).get()) != null || !(bl2 = object3.replace(object, object6, object4)))) break block12;
                                    break block13;
                                    catch (Throwable throwable2) {
                                        break block8;
                                    }
                                    catch (Exception exception2) {
                                        break block9;
                                    }
                                }
                                bl2 = false;
                                object6 = null;
                                break block14;
                            }
                            bl2 = true;
                        }
                        object3 = object3.get(object);
                        object3 = (WeakReference)object3;
                        if (object3 != null) {
                            object4 = object3;
                        }
                        object3 = this.readReleaseConfig(object4);
                        this.releaseConfig = object3;
                        n3 = (int)(this.shouldUpdate ? 1 : 0);
                        if (n3 != 0) {
                            this.releaseConfig = object = this.tryUpdate((String)object, bl2, object4);
                        } else {
                            object = "Updates disabled, running w/o updating.";
                            JuspayLogger.d(string4, (String)object);
                        }
                    }
                    object = this.releaseConfig;
                    Intrinsics.checkNotNull(object);
                    object4 = ((ReleaseConfig)object).getPkg();
                    object4 = ((ReleaseConfig$PackageManifest)object4).getIndex();
                    object4 = ((ReleaseConfig$Split)object4).getFileName();
                    object4 = this.readSplit((String)object4);
                    n3 = ((String)object4).length();
                    if (n3 != 0) {
                        this.trackBoot((ReleaseConfig)object, l2);
                        object3 = new StringBuilder((String)object5);
                        object5 = ((ReleaseConfig)object).getPkg();
                        object5 = ((ReleaseConfig$PackageManifest)object5).getVersion();
                        ((StringBuilder)object3).append((String)object5);
                        object5 = ((StringBuilder)object3).toString();
                        JuspayLogger.d(string4, (String)object5);
                        object5 = new StringBuilder((String)object2);
                        object2 = ((ReleaseConfig)object).getPkg();
                        object2 = ((ReleaseConfig$PackageManifest)object2).getName();
                        ((StringBuilder)object5).append((String)object2);
                        object2 = "\";\n                window.RELEASE_CONFIG=";
                        ((StringBuilder)object5).append((String)object2);
                        object = ((ReleaseConfig)object).serialize();
                        ((StringBuilder)object5).append((String)object);
                        object = ";\n            ";
                        ((StringBuilder)object5).append((String)object);
                        object = ((StringBuilder)object5).toString();
                        object = ee3_2.b((String)object);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append((String)object4);
                        this.applicationContent = object = ((StringBuilder)object2).toString();
                        break block10;
                    }
                    object2 = "index split is empty.";
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
                object2 = new StringBuilder(string3);
                ((StringBuilder)object2).append(exception2);
                string3 = ((StringBuilder)object2).toString();
                JuspayLogger.e(string4, string3);
                string4 = "app_load_exception";
                string3 = "Exception raised while loading application.";
                this.trackError(string4, string3, exception2);
            }
            this.loadWaitTask.complete();
            this.logTimeTaken(l2, string2);
            return;
        }
        this.loadWaitTask.complete();
        this.logTimeTaken(l2, string2);
        throw throwable2;
    }

    public final String readResourceByName(String object) {
        Intrinsics.checkNotNullParameter(object, "name");
        Object object2 = this.releaseConfig;
        object = object2 != null && (object2 = ((ReleaseConfig)object2).getResources()) != null && (object = ((ReleaseConfig$ResourceManifest)object2).getResource((String)object)) != null ? ((ReleaseConfig$Resource)object).getFileName() : null;
        if (object == null || (object = this.readResourceByFileName((String)object)) == null) {
            object = "";
        }
        return object;
    }

    public final String readSplit(String string2) {
        Intrinsics.checkNotNullParameter(string2, "fileName");
        string2 = ApplicationManager$Companion.access$toUnzippedName(Companion, string2);
        string2 = kp1_0.c("package/", string2);
        return this.readFile(string2);
    }

    public final String readSplits(String object) {
        Intrinsics.checkNotNullParameter(object, "fileNames");
        object = b.n((String)object, " ", "", false);
        String[] stringArray = new String[]{","};
        object = StringsKt.a0((CharSequence)object, stringArray, false, 0, 6);
        object = this.readSplits((List)object).toString();
        Intrinsics.checkNotNullExpressionValue(object, "readSplits(fileNames.rep\u2026\").split(\",\")).toString()");
        return object;
    }

    public final void setMode(Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "<set-?>");
        this.mode = mode;
    }

    public final void setShouldUpdate(boolean bl2) {
        this.shouldUpdate = bl2;
    }
}

