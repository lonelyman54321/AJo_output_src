/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import android.util.Log;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.ota.ApplicationManager$StateKey;
import in.juspay.hypersdk.ota.Constants;
import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.ReleaseConfig$Companion;
import in.juspay.hypersdk.ota.ReleaseConfig$Config;
import in.juspay.hypersdk.ota.ReleaseConfig$PackageManifest;
import in.juspay.hypersdk.ota.ReleaseConfig$ResourceManifest;
import in.juspay.hypersdk.ota.ReleaseConfig$Split;
import in.juspay.hypersdk.ota.UpdateResult;
import in.juspay.hypersdk.ota.UpdateResult$Error$RCFetchError;
import in.juspay.hypersdk.ota.UpdateResult$Error$Unknown;
import in.juspay.hypersdk.ota.UpdateResult$NA;
import in.juspay.hypersdk.ota.UpdateResult$Ok;
import in.juspay.hypersdk.ota.UpdateResult$PackageUpdateTimeout;
import in.juspay.hypersdk.ota.UpdateResult$ReleaseConfigFetchTimeout;
import in.juspay.hypersdk.ota.UpdateTask$Companion;
import in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask;
import in.juspay.hypersdk.ota.UpdateTask$Result;
import in.juspay.hypersdk.ota.UpdateTask$Result$Error;
import in.juspay.hypersdk.ota.UpdateTask$Result$Error$HttpError;
import in.juspay.hypersdk.ota.UpdateTask$Result$Error$HttpNoBody;
import in.juspay.hypersdk.ota.UpdateTask$Result$Error$ParseError;
import in.juspay.hypersdk.ota.UpdateTask$Result$Ok;
import in.juspay.hypersdk.ota.UpdateTask$Stage;
import in.juspay.hypersdk.ota.UpdateTask$Update$Package;
import in.juspay.hypersdk.ota.UpdateTask$Update$Package$Failed;
import in.juspay.hypersdk.ota.UpdateTask$Update$Package$Finished;
import in.juspay.hypersdk.ota.UpdateTask$Update$Package$NA;
import in.juspay.hypersdk.ota.UpdateTask$WhenMappings;
import in.juspay.hypersdk.ota.WaitTask;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.FileProviderService$TempWriter;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class UpdateTask {
    public static final UpdateTask$Companion Companion;
    public static final int RETRY_LIMIT = 1;
    public static final String TAG = "UpdateTask";
    private volatile UpdateResult currentResult;
    private volatile UpdateTask$Stage currentStage;
    private long currentStageStartTime;
    private Map defaultHeaders;
    private final Object fileLock;
    private final FileProviderService fileProviderService;
    private long initTime;
    private final ReleaseConfig localReleaseConfig;
    private final NetUtils netUtils;
    private Function2 onFinish;
    private final WaitTask onFinishWaitTask;
    private volatile long packageTimeout;
    private long releaseConfigTimeout;
    private final String releaseConfigUrl;
    private Future resourceSaveFuture;
    private final SdkTracker tracker;
    private final List trackers;
    private final String updateUUID;
    private final Queue waitQueue;

    static {
        UpdateTask$Companion updateTask$Companion;
        Companion = updateTask$Companion = new UpdateTask$Companion(null);
    }

    public UpdateTask(String copyOnWriteArrayList, FileProviderService object, ReleaseConfig object2, Object object3, SdkTracker sdkTracker, NetUtils object4, SessionInfo object5) {
        long l2;
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "releaseConfigUrl");
        Intrinsics.checkNotNullParameter(object, "fileProviderService");
        Intrinsics.checkNotNullParameter(object3, "fileLock");
        Intrinsics.checkNotNullParameter(sdkTracker, "tracker");
        Intrinsics.checkNotNullParameter(object4, "netUtils");
        Object object6 = "sessionInfo";
        Intrinsics.checkNotNullParameter(object5, (String)object6);
        this.releaseConfigUrl = copyOnWriteArrayList;
        this.fileProviderService = object;
        this.localReleaseConfig = object2;
        this.fileLock = object3;
        this.tracker = sdkTracker;
        this.netUtils = object4;
        copyOnWriteArrayList = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(copyOnWriteArrayList, "randomUUID().toString()");
        this.updateUUID = copyOnWriteArrayList;
        this.trackers = copyOnWriteArrayList = new CopyOnWriteArrayList<SdkTracker>();
        int n3 = 256;
        object = new ArrayBlockingQueue(n3);
        this.waitQueue = object;
        object = UpdateTask$Stage.INITIALIZING;
        this.currentStage = object;
        this.currentStageStartTime = l2 = System.currentTimeMillis();
        if (object2 == null || (object = ((ReleaseConfig)object2).getConfig()) == null) {
            object = Constants.INSTANCE.getDEFAULT_CONFIG();
        }
        this.releaseConfigTimeout = l2 = ((ReleaseConfig$Config)object).getReleaseConfigTimeout();
        this.initTime = l2 = System.currentTimeMillis();
        if (object2 == null || (object = ((ReleaseConfig)object2).getConfig()) == null) {
            object = Constants.INSTANCE.getDEFAULT_CONFIG();
        }
        this.packageTimeout = l2 = ((ReleaseConfig$Config)object).getPackageTimeout();
        this.currentResult = object = UpdateResult$NA.INSTANCE;
        this.onFinishWaitTask = object = new WaitTask();
        object = ((SessionInfo)object5).getNetworkName();
        object3 = new Pair("x-network-type", object);
        object = ((SessionInfo)object5).getSessionData().optString("os_version");
        object4 = new Pair("x-os-version", object);
        object = ((SessionInfo)object5).getBundleParams().optString("sdkVersion");
        object6 = "x-hyper-sdk-version";
        object5 = new Pair(object6, object);
        object = null;
        object6 = object2 != null && (object6 = ((ReleaseConfig)object2).getPkg()) != null ? ((ReleaseConfig$PackageManifest)object6).getVersion() : null;
        String string2 = "x-package-version";
        Pair pair = new Pair(string2, object6);
        if (object2 != null && (object2 = ((ReleaseConfig)object2).getConfig()) != null) {
            object = ((ReleaseConfig$Config)object2).getVersion();
        }
        object2 = new Pair("x-config-version", object);
        object = new Pair[]{object3, object4, object5, pair, object2};
        this.defaultHeaders = object = fh1_2.i((Pair[])object);
        copyOnWriteArrayList.add(sdkTracker);
    }

    public static /* synthetic */ UpdateTask$Result a(UpdateTask updateTask, FileProviderService$TempWriter fileProviderService$TempWriter, ReleaseConfig$Split releaseConfig$Split) {
        return UpdateTask.downloadPackageUpdate$lambda$7$lambda$6(updateTask, fileProviderService$TempWriter, releaseConfig$Split);
    }

    public static final /* synthetic */ UpdateTask$Result access$downloadFile(UpdateTask updateTask, FileProviderService$TempWriter fileProviderService$TempWriter, URL uRL, String string2) {
        return updateTask.downloadFile(fileProviderService$TempWriter, uRL, string2);
    }

    public static final /* synthetic */ FileProviderService access$getFileProviderService$p(UpdateTask updateTask) {
        return updateTask.fileProviderService;
    }

    public static final /* synthetic */ JSONObject access$readPersistentState(UpdateTask updateTask, ApplicationManager$StateKey applicationManager$StateKey) {
        return updateTask.readPersistentState(applicationManager$StateKey);
    }

    public static final /* synthetic */ void access$removeFromPersistentState(UpdateTask updateTask, ApplicationManager$StateKey applicationManager$StateKey) {
        updateTask.removeFromPersistentState(applicationManager$StateKey);
    }

    public static final /* synthetic */ void access$setInPersistentState(UpdateTask updateTask, ApplicationManager$StateKey applicationManager$StateKey, JSONObject jSONObject) {
        updateTask.setInPersistentState(applicationManager$StateKey, jSONObject);
    }

    public static final /* synthetic */ void access$setResourceSaveFuture$p(UpdateTask updateTask, Future future) {
        updateTask.resourceSaveFuture = future;
    }

    public static final /* synthetic */ void access$trackInfo(UpdateTask updateTask, String string2, JSONObject jSONObject) {
        updateTask.trackInfo(string2, jSONObject);
    }

    public static final /* synthetic */ boolean access$writeManifest(UpdateTask updateTask, String string2, String string3) {
        return updateTask.writeManifest(string2, string3);
    }

    private final void awaitCompletion(UpdateTask$Stage object, long l2) {
        int n3;
        int n4;
        Object object2;
        long l3 = System.currentTimeMillis();
        Object object3 = new StringBuilder("awaitCompletion: awaiting ");
        Object object4 = object.name();
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append(" for ");
        ((StringBuilder)object3).append(l2);
        ((StringBuilder)object3).append("ms");
        object3 = ((StringBuilder)object3).toString();
        object4 = TAG;
        JuspayLogger.d(object4, (String)object3);
        object3 = new WaitTask();
        Pair pair = new Pair(object3, object);
        Queue queue = this.waitQueue;
        boolean bl2 = queue.offer(pair);
        if (!bl2) {
            object2 = "Failed to enqueue!";
            JuspayLogger.e(object4, object2);
        }
        if ((n4 = ((Enum)(object4 = this.currentStage)).ordinal()) > (n3 = object.ordinal()) || (object4 = this.currentStage) == (object2 = UpdateTask$Stage.FINISHED)) {
            if (bl2) {
                object4 = this.waitQueue;
                object4.remove(pair);
            }
            ((WaitTask)object3).complete();
        }
        object4 = TimeUnit.MILLISECONDS;
        ((FutureTask)object3).get(l2, (TimeUnit)((Object)object4));
        StringBuilder stringBuilder = new StringBuilder("awaitCompletion: ");
        object = object.name();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        this.logTimeTaken(l3, (String)object);
    }

    private final void awaitUpdates(Future object, UpdateTask$ResourceUpdateTask updateTask$ResourceUpdateTask, long l2) {
        long l3;
        block2: {
            long l4;
            long l7;
            long l8;
            l3 = System.currentTimeMillis();
            long l12 = System.nanoTime();
            l2 = TimeUnit.MILLISECONDS.toNanos(l2) + l12;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long l14 = 1L;
            l12 = timeUnit.toNanos(l14);
            String string2 = "awaitDownloads: Starting wait.";
            String string3 = TAG;
            JuspayLogger.d(string3, string2);
            while ((l8 = (l7 = (l4 = System.nanoTime()) - l2) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
                l8 = (long)object.isDone();
                if (l8 == false || (l8 = (long)updateTask$ResourceUpdateTask.isDone()) == false) {
                    LockSupport.parkNanos(l12);
                    continue;
                }
                break block2;
            }
            object = "awaitDownloads: Timeout.";
            JuspayLogger.d(string3, (String)object);
        }
        this.logTimeTaken(l3, "awaitDownloads: Wait ended.");
    }

    public static /* synthetic */ Boolean b(FileProviderService$TempWriter fileProviderService$TempWriter, String string2, String string3) {
        return UpdateTask.copyFilesAsync$lambda$11$lambda$10(fileProviderService$TempWriter, string2, string3);
    }

    public static /* synthetic */ Unit c(UpdateTask updateTask) {
        return UpdateTask.run$lambda$0(updateTask);
    }

    private final boolean copyFilesAsync(FileProviderService$TempWriter object, String object2) {
        Object object3 = ((FileProviderService$TempWriter)object).list();
        boolean bl2 = false;
        if (object3 != null) {
            boolean bl3;
            int n3 = ((String[])object3).length;
            ArrayList<Object> arrayList = new ArrayList<Object>(n3);
            n3 = ((String[])object3).length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object4 = object3[i3];
                UpdateTask$Companion updateTask$Companion = Companion;
                lw3_0 lw3_02 = new lw3_0((FileProviderService$TempWriter)object, (String)object4, (String)object2);
                object4 = UpdateTask$Companion.access$doAsync(updateTask$Companion, lw3_02);
                arrayList.add(object4);
            }
            int n4 = yx_2.o(arrayList, 10);
            object = new ArrayList(n4);
            object2 = arrayList.iterator();
            while (bl3 = object2.hasNext()) {
                object3 = (Boolean)((Future)object2.next()).get();
                ((ArrayList)object).add(object3);
            }
            n4 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
            if (n4 == 0) {
                object = ((ArrayList)object).iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object2 = (Boolean)object.next();
                    n4 = (int)(Intrinsics.areEqual(object2, object3 = Boolean.TRUE) ? 1 : 0);
                    if (n4 != 0) continue;
                    break;
                }
            } else {
                bl2 = true;
            }
        }
        return bl2;
    }

    private static final Boolean copyFilesAsync$lambda$11$lambda$10(FileProviderService$TempWriter fileProviderService$TempWriter, String string2, String string3) {
        Intrinsics.checkNotNullParameter(fileProviderService$TempWriter, "$tempWriter");
        Intrinsics.checkNotNullParameter(string3, "$dest");
        return fileProviderService$TempWriter.moveToMain(string2, string3);
    }

    public static /* synthetic */ UpdateTask$Update$Package d(UpdateTask updateTask, ReleaseConfig releaseConfig) {
        return UpdateTask.runInternal$lambda$1(updateTask, releaseConfig);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final UpdateTask$Result downloadFile(FileProviderService$TempWriter fileProviderService$TempWriter, URL uRL, String string2) {
        long l2;
        String string3;
        Object object;
        UpdateTask updateTask;
        block9: {
            block10: {
                IOException iOException2;
                Object object2;
                Object object3;
                String string4;
                block8: {
                    Object object4;
                    boolean bl2;
                    updateTask = this;
                    object = uRL;
                    string4 = string2;
                    String string5 = ".zip";
                    String string6 = "Write to disk failed while downloading: ";
                    String string7 = "Un-zipping file ";
                    String string8 = "Cancelled before writing: ";
                    object3 = new StringBuilder("downloadFile ");
                    ((StringBuilder)object3).append(uRL);
                    object3 = ((StringBuilder)object3).toString();
                    String string9 = TAG;
                    JuspayLogger.d(string9, (String)object3);
                    string3 = Companion.fileName(uRL);
                    long l3 = System.currentTimeMillis();
                    object2 = uRL.toString();
                    object = "url.toString()";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    Object object5 = null;
                    boolean bl3 = true;
                    object3 = this;
                    l2 = l3;
                    int n3 = 12;
                    object3 = UpdateTask.fetch$default(this, (String)object2, bl3, false, 0, n3, null);
                    boolean bl4 = object3 instanceof UpdateTask$Result$Ok;
                    if (!bl4) break block10;
                    object = object3;
                    try {
                        object = (UpdateTask$Result$Ok)object3;
                        object = ((UpdateTask$Result$Ok)object).getV();
                        object = (Pair)object;
                        object = ((Pair)object).b;
                        object = (il2_2)object;
                        bl2 = Thread.interrupted();
                        if (bl2) {
                            object = new StringBuilder(string8);
                            ((StringBuilder)object).append(string3);
                            object = ((StringBuilder)object).toString();
                            JuspayLogger.d(string9, (String)object);
                            return new UpdateTask$Result$Error();
                        }
                    }
                    catch (IOException iOException2) {
                        break block8;
                    }
                    object = ((il2_2)object).b();
                    bl2 = false;
                    object2 = null;
                    bl3 = b.h(string3, string5, false);
                    if (bl3) {
                        object4 = string7.concat(string3);
                        JuspayLogger.d(string9, (String)object4);
                        object4 = this.fileProviderService;
                        object5 = "remoteAssetPublicKey";
                        object4 = ((FileProviderService)object4).getAssetFileAsByte((String)object5);
                        object5 = this.tracker;
                        object4 = RemoteAssetService.unZipAndVerify((byte[])object, string3, (byte[])object4, (SdkTracker)object5);
                    } else {
                        bl3 = false;
                        object4 = null;
                    }
                    object5 = ".jsa";
                    object2 = b.n(string4, string5, (String)object5, false);
                    if (object4 != null) {
                        object = object4;
                    }
                    object4 = fileProviderService$TempWriter;
                    bl4 = fileProviderService$TempWriter.write((String)object2, (byte[])object);
                    if (bl4) {
                        object2 = Unit.a;
                        object = new UpdateTask$Result$Ok(object2);
                        break block9;
                    } else {
                        object = string6.concat(string3);
                        JuspayLogger.e(string9, (String)object);
                        object = new UpdateTask$Result$Error();
                    }
                    break block9;
                }
                object2 = Companion;
                object3 = (Closeable)((Pair)((UpdateTask$Result$Ok)object3).getV()).a;
                ((UpdateTask$Companion)object2).closeQuietly((Closeable)object3);
                updateTask.trackFileWriteError(string4, iOException2);
                object = new UpdateTask$Result$Error();
                break block9;
            }
            object = new UpdateTask$Result$Error();
        }
        updateTask.logTimeTaken(l2, string3);
        return object;
    }

    /*
     * Exception decompiling
     */
    private final UpdateTask$Update$Package downloadPackageUpdate(ReleaseConfig$PackageManifest var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 170->173)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static final UpdateTask$Result downloadPackageUpdate$lambda$7$lambda$6(UpdateTask updateTask, FileProviderService$TempWriter fileProviderService$TempWriter, ReleaseConfig$Split object) {
        Intrinsics.checkNotNullParameter(updateTask, "this$0");
        Intrinsics.checkNotNullParameter(object, "$it");
        Intrinsics.checkNotNullExpressionValue(fileProviderService$TempWriter, "tw");
        URL uRL = ((ReleaseConfig$Split)object).getUrl();
        object = ((ReleaseConfig$Split)object).getFileName();
        return updateTask.downloadFile(fileProviderService$TempWriter, uRL, (String)object);
    }

    public static /* synthetic */ Boolean e(UpdateTask updateTask, UpdateTask$Update$Package updateTask$Update$Package, ReleaseConfig releaseConfig, long l2) {
        return UpdateTask.runInternal$lambda$2(updateTask, updateTask$Update$Package, releaseConfig, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final UpdateTask$Result fetch(String string2, boolean bl2, boolean bl3, int n3) {
        IOException iOException2;
        block7: {
            Object object;
            Object object2;
            Object object3;
            block6: {
                if (bl3) {
                    try {
                        object3 = this.defaultHeaders;
                        object3 = fh1_2.q((Map)object3);
                        object2 = "cache-control";
                        object = "no-cache";
                        object3.put(object2, object);
                        break block6;
                    }
                    catch (IOException iOException2) {
                        break block7;
                    }
                }
                object3 = this.defaultHeaders;
            }
            Object object4 = object3;
            object2 = this.netUtils;
            String string3 = null;
            object = string2;
            object3 = ((NetUtils)object2).doGet(string2, (Map)object3, null, null, null);
            int n4 = ((cl2_2)object3).d;
            object = ((cl2_2)object3).g;
            int n7 = 200;
            string3 = "resp";
            if (n4 != n7) {
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                this.trackFetchHttpError((cl2_2)object3);
                ((cl2_2)object3).close();
                return new UpdateTask$Result$Error$HttpError((cl2_2)object3);
            }
            if (object == null) {
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                this.trackFetchHttpError((cl2_2)object3);
                ((cl2_2)object3).close();
                return new UpdateTask$Result$Error$HttpNoBody((cl2_2)object3);
            }
            object4 = new Pair(object3, object);
            return new UpdateTask$Result$Ok(object4);
        }
        boolean bl4 = iOException2 instanceof InterruptedIOException;
        if (bl4) {
            return new UpdateTask$Result$Error();
        }
        this.trackFetchIOError(string2, iOException2);
        int n8 = 1;
        if (n3 >= n8) return new UpdateTask$Result$Error();
        if (!bl2) return new UpdateTask$Result$Error();
        return this.fetch(string2, n8 != 0, bl3, n3 += n8);
    }

    public static /* synthetic */ UpdateTask$Result fetch$default(UpdateTask updateTask, String string2, boolean bl2, boolean bl3, int n3, int n4, Object object) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            bl2 = true;
        }
        if ((n7 = n4 & 4) != 0) {
            bl3 = false;
        }
        if ((n4 &= 8) != 0) {
            n3 = 0;
        }
        return updateTask.fetch(string2, bl2, bl3, n3);
    }

    private final ReleaseConfig fetchReleaseConfig() {
        block9: {
            Object object;
            block8: {
                Object object2;
                block7: {
                    long l2 = System.currentTimeMillis();
                    Object object3 = this.releaseConfigUrl;
                    int n3 = 10;
                    boolean bl2 = true;
                    String string2 = null;
                    object2 = this;
                    object2 = UpdateTask.fetch$default(this, (String)object3, false, bl2, 0, n3, null);
                    boolean bl3 = object2 instanceof UpdateTask$Result$Ok;
                    object = null;
                    if (!bl3) break block7;
                    object3 = object2;
                    object3 = ((il2_2)((Pair)((UpdateTask$Result$Ok)object2).getV()).b).b();
                    Intrinsics.checkNotNullExpressionValue(object3, "body.bytes()");
                    Object object4 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(object4, "UTF_8");
                    string2 = new String((byte[])object3, (Charset)object4);
                    object3 = ReleaseConfig.Companion;
                    object3 = ((ReleaseConfig$Companion)object3).deSerialize-IoAF18A(string2);
                    vl2_2.b(object3);
                    object3 = (ReleaseConfig)object3;
                    try {
                        this.trackReleaseConfigFetchResult((UpdateTask$Result)object2, l2);
                        object = object3;
                    }
                    catch (Exception exception) {
                        object3 = new StringBuilder("Failed to parse release config ");
                        object4 = Log.getStackTraceString((Throwable)exception);
                        ((StringBuilder)object3).append((String)object4);
                        object3 = ((StringBuilder)object3).toString();
                        object4 = TAG;
                        JuspayLogger.e((String)object4, (String)object3);
                        object3 = new UpdateTask$Result$Error$ParseError(exception);
                        this.trackReleaseConfigFetchResult((UpdateTask$Result)object3, l2);
                    }
                    break block8;
                }
                boolean bl4 = object2 instanceof UpdateTask$Result$Error;
                if (!bl4) break block9;
            }
            return object;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    private final boolean installPackageUpdate(UpdateTask$Update$Package object, ReleaseConfig$PackageManifest object2, long l2) {
        block14: {
            boolean bl2;
            block12: {
                boolean bl3;
                String string2;
                String string3;
                boolean bl4;
                Object object3;
                block13: {
                    block11: {
                        object3 = UpdateTask$Update$Package$Failed.INSTANCE;
                        bl4 = Intrinsics.areEqual(object, object3);
                        bl2 = false;
                        if (!bl4) break block11;
                        object = new UpdateTask$Result$Error();
                        this.trackPackageUpdateResult((UpdateTask$Result)object, l2);
                        break block12;
                    }
                    object3 = UpdateTask$Update$Package$NA.INSTANCE;
                    bl4 = Intrinsics.areEqual(object, object3);
                    string3 = TAG;
                    if (!bl4) break block13;
                    object = "Application is up to-date!";
                    JuspayLogger.d(string3, (String)object);
                    break block12;
                }
                bl4 = object instanceof UpdateTask$Update$Package$Finished;
                if (!bl4) break block14;
                object3 = ((UpdateTask$Update$Package$Finished)(object = (UpdateTask$Update$Package$Finished)object)).getTempWriter();
                bl4 = this.copyFilesAsync((FileProviderService$TempWriter)object3, string2 = "app/package");
                if (bl4) {
                    string2 = "Copied splits.";
                    JuspayLogger.d(string3, string2);
                }
                if (bl4) {
                    bl3 = this.writePackageManifest((ReleaseConfig$PackageManifest)object2);
                } else {
                    bl3 = false;
                    string2 = null;
                }
                if (bl3) {
                    String string4 = "Wrote package manifest.";
                    JuspayLogger.d(string3, string4);
                }
                if (bl4 && bl3) {
                    bl2 = true;
                }
                if (bl2) {
                    boolean bl5 = ((UpdateTask$Update$Package$Finished)object).getSaved();
                    if (bl5) {
                        object = ApplicationManager$StateKey.SAVED_PACKAGE_UPDATE;
                        this.removeFromPersistentState((ApplicationManager$StateKey)((Object)object));
                    }
                    object = new StringBuilder("Installed new package version: ");
                    object3 = ((ReleaseConfig$PackageManifest)object2).getVersion();
                    ((StringBuilder)object).append((String)object3);
                    object = ((StringBuilder)object).toString();
                    JuspayLogger.d(string3, (String)object);
                    object2 = ((ReleaseConfig$PackageManifest)object2).getVersion();
                    object = new UpdateTask$Result$Ok(object2);
                    this.trackPackageUpdateResult((UpdateTask$Result)object, l2);
                } else {
                    JuspayLogger.e(string3, "An error occurred while installing the package.");
                    object = new UpdateTask$Result$Error();
                    this.trackPackageUpdateResult((UpdateTask$Result)object, l2);
                }
            }
            return bl2;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    private final JSONObject loadPersistentState() {
        Object object = this.fileProviderService;
        Object object2 = "app/state.json";
        object = ((FileProviderService)object).readFromFile((String)object2);
        try {
            object2 = new JSONObject((String)object);
        }
        catch (JSONException jSONException) {
            int n3 = 4;
            String string2 = "persistent_state_load_failed";
            object2 = this;
            UpdateTask.trackException$default(this, string2, (Exception)((Object)jSONException), null, n3, null);
            JSONObject jSONObject = new JSONObject();
            this.savePersistentState(jSONObject);
            object2 = new JSONObject();
        }
        return object2;
    }

    private final void logTimeTaken(long l2, String string2) {
    }

    public static /* synthetic */ void logTimeTaken$default(UpdateTask updateTask, long l2, String string2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        updateTask.logTimeTaken(l2, string2);
    }

    private final void onComplete(UpdateTask$Stage object) {
        Object object2;
        Object object3 = object.ordinal();
        Object object4 = this.currentStage;
        Object object5 = object4.ordinal();
        Object object6 = TAG;
        if (object3 >= object5 && (object2 = this.currentStage) != (object4 = UpdateTask$Stage.FINISHED)) {
            long l2 = System.currentTimeMillis();
            long l3 = this.currentStageStartTime;
            l2 -= l3;
            this.currentStageStartTime = l3 = System.currentTimeMillis();
            object2 = new StringBuilder("Ended stage: ");
            String string2 = object.name();
            object2.append(string2);
            char c2 = ' ';
            object2.append(c2);
            object2.append(l2);
            Object object7 = "ms";
            object2.append((String)object7);
            object2 = object2.toString();
            JuspayLogger.d((String)object6, (String)object2);
            object2 = UpdateTask$WhenMappings.$EnumSwitchMapping$0;
            int n3 = object.ordinal();
            object3 = object2[n3];
            n3 = 1;
            if (object3 != n3) {
                n3 = 2;
                if (object3 != n3) {
                    n3 = 3;
                    if (object3 != n3) {
                        n3 = 4;
                        if (object3 != n3 && object3 != (n3 = 5)) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                    } else {
                        object4 = UpdateTask$Stage.INSTALLING;
                    }
                } else {
                    object4 = UpdateTask$Stage.DOWNLOADING_UPDATES;
                }
            } else {
                object4 = UpdateTask$Stage.FETCHING_RC;
            }
            this.currentStage = object4;
            object2 = new StringBuilder("Reached stage: ");
            object4 = this.currentStage.name();
            object2.append((String)object4);
            object2 = object2.toString();
            JuspayLogger.d((String)object6, (String)object2);
            object2 = this.waitQueue;
            object3 = object2.size();
            while (true) {
                object5 = object3 + -1;
                if (object3 <= 0) break;
                object2 = (Pair)this.waitQueue.poll();
                if (object2 != null) {
                    int n4;
                    object6 = (WaitTask)((Pair)object2).a;
                    object7 = (UpdateTask$Stage)((Object)((Pair)object2).b);
                    n3 = ((Enum)object7).ordinal();
                    if (n3 <= (n4 = object.ordinal())) {
                        ((WaitTask)object6).complete();
                    } else {
                        object6 = this.waitQueue;
                        object6.offer(object2);
                    }
                }
                object3 = object5;
            }
            object = this.currentStage;
            object2 = UpdateTask$Stage.FINISHED;
            if (object == object2) {
                boolean bl2;
                while (!(bl2 = (object = this.waitQueue).isEmpty())) {
                    object = (Pair)this.waitQueue.poll();
                    if (object == null) continue;
                    object = (WaitTask)((Pair)object).a;
                    ((WaitTask)object).complete();
                }
                object = this.resourceSaveFuture;
                if (object != null) {
                    object = (Unit)object.get();
                }
                this.trackEnd();
                object = this.loadPersistentState();
                object2 = this.onFinish;
                if (object2 != null) {
                    object4 = this.currentResult;
                    object2.invoke(object4, object);
                }
                object = this.onFinishWaitTask;
                ((WaitTask)object).complete();
            }
            return;
        }
        object2 = new StringBuilder("Received completion of stage ");
        object = object.name();
        object2.append((String)object);
        object2.append(" even though current stage is");
        object = this.currentStage.name();
        object2.append((String)object);
        object2.append('.');
        object = object2.toString();
        JuspayLogger.d((String)object6, (String)object);
    }

    private final JSONObject readPersistentState(ApplicationManager$StateKey object) {
        CharSequence charSequence = new StringBuilder("readPersistentState: ");
        String string2 = object.name();
        charSequence.append(string2);
        charSequence = charSequence.toString();
        string2 = TAG;
        JuspayLogger.d(string2, (String)charSequence);
        charSequence = this.loadPersistentState();
        object = object.name();
        object = charSequence.optJSONObject((String)object);
        JuspayLogger.d(string2, "readPersistentState exit");
        return object;
    }

    private final void removeFromPersistentState(ApplicationManager$StateKey object) {
        JSONObject jSONObject = this.loadPersistentState();
        object = object.name();
        jSONObject.remove((String)object);
        this.savePersistentState(jSONObject);
    }

    private static final Unit run$lambda$0(UpdateTask updateTask) {
        Intrinsics.checkNotNullParameter(updateTask, "this$0");
        updateTask.runInternal();
        return Unit.a;
    }

    private final void runInternal() {
        Object object;
        ReleaseConfig$Config releaseConfig$Config;
        boolean bl2;
        ReleaseConfig releaseConfig = this.fetchReleaseConfig();
        if (releaseConfig == null) {
            Object object2 = UpdateResult$Error$RCFetchError.INSTANCE;
            this.currentResult = object2;
            object2 = UpdateTask$Stage.FINISHED;
            this.onComplete((UpdateTask$Stage)((Object)object2));
            return;
        }
        this.updateTimeouts(releaseConfig);
        Object object3 = UpdateTask$Stage.FETCHING_RC;
        this.onComplete((UpdateTask$Stage)((Object)object3));
        long l2 = System.currentTimeMillis();
        UpdateTask$Companion updateTask$Companion = Companion;
        object3 = new jw3_0(this, releaseConfig);
        Object object4 = UpdateTask$Companion.access$doAsync(updateTask$Companion, (Callable)object3);
        object3 = this.localReleaseConfig;
        ReleaseConfig$PackageManifest releaseConfig$PackageManifest = null;
        if (object3 != null) {
            object3 = ((ReleaseConfig)object3).getResources();
        } else {
            bl2 = false;
            object3 = null;
        }
        Object object5 = releaseConfig.getResources();
        UpdateTask$ResourceUpdateTask updateTask$ResourceUpdateTask = new UpdateTask$ResourceUpdateTask(this, (ReleaseConfig$ResourceManifest)object3, (ReleaseConfig$ResourceManifest)object5);
        updateTask$ResourceUpdateTask.start();
        object3 = releaseConfig.getConfig().getVersion();
        object5 = this.localReleaseConfig;
        object5 = object5 != null && (object5 = ((ReleaseConfig)object5).getConfig()) != null ? ((ReleaseConfig$Config)object5).getVersion() : null;
        bl2 = Intrinsics.areEqual(object3, object5);
        if (!bl2 && (bl2 = this.writeConfig((ReleaseConfig$Config)(object3 = releaseConfig.getConfig())))) {
            releaseConfig$Config = releaseConfig.getConfig();
            int n3 = 6;
            object3 = this;
            object5 = releaseConfig$Config;
            UpdateTask.setCurrentResult$default(this, releaseConfig$Config, null, null, n3, null);
            object3 = new JSONObject();
            object5 = releaseConfig.getConfig().getVersion();
            object = "new_config_version";
            object3 = object3.put((String)object, object5);
            Intrinsics.checkNotNullExpressionValue(object3, "JSONObject().put(\"new_co\u2026, fetched.config.version)");
            this.trackInfo("config_updated", (JSONObject)object3);
            object3 = TAG;
            object5 = "Config updated.";
            JuspayLogger.d((String)object3, (String)object5);
        } else {
            releaseConfig$Config = null;
        }
        long l3 = this.packageTimeout;
        this.awaitUpdates((Future)object4, updateTask$ResourceUpdateTask, l3);
        object = object3 = object4.get();
        object = (UpdateTask$Update$Package)object3;
        object3 = UpdateTask$Stage.DOWNLOADING_UPDATES;
        this.onComplete((UpdateTask$Stage)((Object)object3));
        object3 = object4;
        object5 = this;
        object4 = new kw3_0(this, (UpdateTask$Update$Package)object, releaseConfig, l2);
        object3 = UpdateTask$Companion.access$doAsync(updateTask$Companion, (Callable)object4);
        object5 = updateTask$ResourceUpdateTask.stopAndInstall();
        object3 = object3.get();
        object = "packageInstallFuture.get()";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object);
        object3 = (Boolean)object3;
        bl2 = (Boolean)object3;
        if (bl2) {
            releaseConfig$PackageManifest = releaseConfig.getPkg();
        }
        this.setCurrentResult(releaseConfig$Config, releaseConfig$PackageManifest, (ReleaseConfig$ResourceManifest)object5);
        object3 = UpdateTask$Stage.INSTALLING;
        this.onComplete((UpdateTask$Stage)((Object)object3));
    }

    private static final UpdateTask$Update$Package runInternal$lambda$1(UpdateTask updateTask, ReleaseConfig object) {
        Intrinsics.checkNotNullParameter(updateTask, "this$0");
        object = ((ReleaseConfig)object).getPkg();
        return updateTask.downloadPackageUpdate((ReleaseConfig$PackageManifest)object);
    }

    private static final Boolean runInternal$lambda$2(UpdateTask updateTask, UpdateTask$Update$Package updateTask$Update$Package, ReleaseConfig object, long l2) {
        Intrinsics.checkNotNullParameter(updateTask, "this$0");
        Intrinsics.checkNotNullExpressionValue(updateTask$Update$Package, "presult");
        object = ((ReleaseConfig)object).getPkg();
        return updateTask.installPackageUpdate(updateTask$Update$Package, (ReleaseConfig$PackageManifest)object, l2);
    }

    private final void savePersistentState(JSONObject jSONObject) {
        FileProviderService fileProviderService = this.fileProviderService;
        Object object = "app/state.json";
        Object object2 = jSONObject.toString();
        Object object3 = "state.toString()";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object3 = Charsets.UTF_8;
        object2 = ((String)object2).getBytes((Charset)object3);
        object3 = "this as java.lang.String).getBytes(charset)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        try {
            fileProviderService.updateFile((String)object, (byte[])object2);
        }
        catch (Exception exception) {
            object = new JSONObject();
            object2 = "state";
            jSONObject = object.put((String)object2, (Object)jSONObject);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().put(\"state\", state)");
            object = "persistent_state_save_failed";
            this.trackException((String)object, exception, jSONObject);
        }
    }

    private final void setCurrentResult(ReleaseConfig$Config object, ReleaseConfig$PackageManifest object2, ReleaseConfig$ResourceManifest object3) {
        if (object != null || object2 != null || object3 != null) {
            block25: {
                block21: {
                    if (object == null) {
                        block20: {
                            object = this.localReleaseConfig;
                            if (object == null) break block20;
                            object = ((ReleaseConfig)object).getConfig();
                            if (object != null) break block21;
                        }
                        object = Constants.INSTANCE;
                        object = ((Constants)object).getDEFAULT_CONFIG();
                    }
                }
                if (object2 == null) {
                    block23: {
                        block22: {
                            object2 = this.localReleaseConfig;
                            if (object2 == null) break block22;
                            object2 = ((ReleaseConfig)object2).getPkg();
                            break block23;
                        }
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                }
                if (object3 == null) {
                    block24: {
                        object3 = this.localReleaseConfig;
                        if (object3 == null) break block24;
                        object3 = ((ReleaseConfig)object3).getResources();
                        if (object3 != null) break block25;
                    }
                    object3 = Constants.INSTANCE;
                    object3 = ((Constants)object3).getDEFAULT_RESOURCES();
                }
            }
            ReleaseConfig releaseConfig = new ReleaseConfig((ReleaseConfig$Config)object, (ReleaseConfig$PackageManifest)object2, (ReleaseConfig$ResourceManifest)object3);
            object = new UpdateResult$Ok(releaseConfig);
            try {
                this.currentResult = object;
            }
            catch (NullPointerException nullPointerException) {
                this.currentResult = object = UpdateResult$Error$Unknown.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void setCurrentResult$default(UpdateTask updateTask, ReleaseConfig$Config releaseConfig$Config, ReleaseConfig$PackageManifest releaseConfig$PackageManifest, ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            releaseConfig$Config = null;
        }
        if ((n4 = n3 & 2) != 0) {
            releaseConfig$PackageManifest = null;
        }
        if ((n3 &= 4) != 0) {
            releaseConfig$ResourceManifest = null;
        }
        updateTask.setCurrentResult(releaseConfig$Config, releaseConfig$PackageManifest, releaseConfig$ResourceManifest);
    }

    private final void setInPersistentState(ApplicationManager$StateKey applicationManager$StateKey, JSONObject object) {
        JSONObject jSONObject = this.loadPersistentState();
        String string2 = applicationManager$StateKey.name();
        jSONObject.put(string2, object);
        try {
            this.savePersistentState(jSONObject);
        }
        catch (JSONException jSONException) {
            string2 = new JSONObject();
            String string3 = "key";
            applicationManager$StateKey = string2.put(string3, (Object)applicationManager$StateKey);
            string2 = "value";
            applicationManager$StateKey = applicationManager$StateKey.put(string2, object);
            Intrinsics.checkNotNullExpressionValue((Object)applicationManager$StateKey, "JSONObject()\n           \u2026     .put(\"value\", value)");
            object = "persistent_state_set_failed";
            this.trackException((String)object, (Exception)((Object)jSONException), (JSONObject)applicationManager$StateKey);
        }
    }

    private final void trackEnd() {
        JSONObject jSONObject = new JSONObject();
        long l2 = System.currentTimeMillis();
        long l3 = this.initTime;
        jSONObject = jSONObject.put("time_taken", l2 -= l3);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().put(\"time_t\u2026tTimeMillis() - initTime)");
        this.trackInfo("end", jSONObject);
    }

    private final void trackError(String string2, JSONObject jSONObject) {
        this.trackGeneric("error", string2, jSONObject);
    }

    private final void trackException(String string2, Exception object, JSONObject jSONObject) {
        String string3 = ((Throwable)object).getMessage();
        jSONObject = jSONObject.put("error", (Object)string3);
        object = Log.getStackTraceString((Throwable)object);
        object = jSONObject.put("stack_trace", object);
        Intrinsics.checkNotNullExpressionValue(object, "value\n                .p\u2026g.getStackTraceString(e))");
        this.trackError(string2, (JSONObject)object);
    }

    public static /* synthetic */ void trackException$default(UpdateTask updateTask, String string2, Exception exception, JSONObject jSONObject, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            jSONObject = new JSONObject();
        }
        updateTask.trackException(string2, exception, jSONObject);
    }

    private final void trackFetchHttpError(cl2_2 cl2_22) {
        Object object;
        Object object2 = cl2_22.g;
        if (object2 == null || (object2 = ((il2_2)object2).a()) == null || (object2 = ((UpdateTask$Companion)(object = Companion)).utf8((InputStream)object2)) == null) {
            object2 = "null";
        }
        object = new JSONObject();
        String string2 = cl2_22.a.a.i;
        object = object.put("url", (Object)string2);
        int n3 = cl2_22.d;
        cl2_22 = object.put("status", n3).put("body", object2);
        Intrinsics.checkNotNullExpressionValue(cl2_22, "JSONObject()\n           \u2026       .put(\"body\", body)");
        this.trackError("fetch_failed", (JSONObject)cl2_22);
    }

    private final void trackFetchIOError(String string2, IOException iOException) {
        JSONObject jSONObject = new JSONObject();
        string2 = jSONObject.put("url", (Object)string2);
        Intrinsics.checkNotNullExpressionValue(string2, "JSONObject().put(\"url\", url)");
        this.trackException("fetch_failed", iOException, (JSONObject)string2);
    }

    private final void trackFileWriteError(String string2, Exception exception) {
        JSONObject jSONObject = new JSONObject();
        string2 = jSONObject.put("file_name", (Object)string2);
        Intrinsics.checkNotNullExpressionValue(string2, "JSONObject().put(\"file_name\", fileName)");
        this.trackException("file_write_failed", exception, (JSONObject)string2);
    }

    private final void trackGeneric(String string2, String string3, JSONObject jSONObject) {
        boolean bl2;
        Iterator iterator = this.trackers.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = object;
            object2 = (SdkTracker)object;
            object = this.updateUUID;
            JSONObject jSONObject2 = jSONObject.put("app_update_id", object);
            String string4 = "system";
            String string5 = TAG;
            ((SdkTracker)object2).trackAction(string4, string2, string5, string3, jSONObject2);
        }
    }

    private final void trackInfo(String string2, JSONObject jSONObject) {
        this.trackGeneric("info", string2, jSONObject);
    }

    private final void trackInit() {
        JSONObject jSONObject = new JSONObject();
        Object object = this.localReleaseConfig;
        if (object != null) {
            object = ((ReleaseConfig)object).getConfig().getVersion();
            object = jSONObject.put("config_version", object);
            String string2 = this.localReleaseConfig.getPkg().getVersion();
            String string3 = "package_version";
            object.put(string3, (Object)string2);
        }
        this.trackInfo("init", jSONObject);
    }

    private final void trackPackageUpdateResult(UpdateTask$Result object, long l2) {
        boolean bl2 = object instanceof UpdateTask$Result$Ok;
        object = bl2 ? (String)((UpdateTask$Result$Ok)object).getV() : null;
        JSONObject jSONObject = new JSONObject();
        String string2 = "result";
        if (object != null) {
            string2 = jSONObject.put(string2, (Object)"SUCCESS");
            String string3 = "package_version";
            string2.put(string3, object);
        } else {
            object = "FAILED";
            jSONObject.put(string2, object);
        }
        long l3 = System.currentTimeMillis() - l2;
        object = jSONObject.put("time_taken", l3);
        Intrinsics.checkNotNullExpressionValue(object, "value.put(\"time_taken\", \u2026TimeMillis() - startTime)");
        this.trackInfo("package_update_result", (JSONObject)object);
    }

    private final void trackReleaseConfigFetchResult(UpdateTask$Result object, long l2) {
        boolean bl2;
        String string2;
        Object object2;
        Object object3;
        int n3 = object instanceof UpdateTask$Result$Ok;
        if (n3 != 0) {
            object3 = object;
            n3 = ((cl2_2)((Pair)((UpdateTask$Result$Ok)object).getV()).a).d;
            object3 = n3;
        } else {
            n3 = object instanceof UpdateTask$Result$Error$HttpError;
            if (n3 != 0) {
                object3 = object;
                n3 = ((UpdateTask$Result$Error$HttpError)object).getResponse().d;
                object3 = n3;
            } else {
                n3 = object instanceof UpdateTask$Result$Error$HttpNoBody;
                if (n3 != 0) {
                    object3 = object;
                    n3 = ((UpdateTask$Result$Error$HttpNoBody)object).getResponse().d;
                    object3 = n3;
                } else {
                    object3 = "-1";
                }
            }
        }
        boolean bl3 = object instanceof UpdateTask$Result$Error$HttpError;
        if (bl3) {
            object2 = object;
            object2 = ((UpdateTask$Result$Error$HttpError)object).getResponse().c;
        } else {
            bl3 = object instanceof UpdateTask$Result$Error$HttpNoBody;
            if (bl3) {
                object2 = "HTTP_NO_BODY";
            } else {
                bl3 = object instanceof UpdateTask$Result$Error$ParseError;
                if (bl3) {
                    object2 = object;
                    object2 = ((UpdateTask$Result$Error$ParseError)object).getE().getMessage();
                } else {
                    bl3 = false;
                    object2 = null;
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        String string3 = this.releaseConfigUrl;
        String string4 = "release_config_url";
        jSONObject = jSONObject.put(string4, (Object)string3);
        string3 = "status";
        object3 = jSONObject.put(string3, object3);
        long l3 = System.currentTimeMillis() - l2;
        JSONObject jSONObject2 = object3.put("time_taken", l3);
        if (object2 != null) {
            string2 = "error";
            jSONObject2.put(string2, object2);
        }
        if (bl2 = object instanceof UpdateTask$Result$Error$ParseError) {
            object = Log.getStackTraceString((Throwable)((UpdateTask$Result$Error$ParseError)object).getE());
            string2 = "stack_trace";
            jSONObject2.put(string2, object);
        }
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "value");
        this.trackInfo("release_config_fetch", jSONObject2);
    }

    private final void updateTimeouts(ReleaseConfig releaseConfig) {
        long l2;
        this.releaseConfigTimeout = l2 = releaseConfig.getConfig().getReleaseConfigTimeout();
        this.packageTimeout = l2 = releaseConfig.getConfig().getPackageTimeout();
    }

    private final boolean writeConfig(ReleaseConfig$Config object) {
        object = ((ReleaseConfig$Config)object).toJSON().toString();
        Intrinsics.checkNotNullExpressionValue(object, "config.toJSON().toString()");
        return this.writeManifest("config.json", (String)object);
    }

    private final boolean writeManifest(String string2, String object) {
        String string3 = "app/";
        CharSequence charSequence = new StringBuilder("writing manifest ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        String string4 = TAG;
        JuspayLogger.d(string4, (String)charSequence);
        long l2 = System.currentTimeMillis();
        Object object2 = this.fileLock;
        synchronized (object2) {
            FileProviderService fileProviderService = this.fileProviderService;
            Object object3 = new StringBuilder(string3);
            ((StringBuilder)object3).append(string2);
            string3 = ((StringBuilder)object3).toString();
            object3 = Charsets.UTF_8;
            object = ((String)object).getBytes((Charset)object3);
            object3 = "this as java.lang.String).getBytes(charset)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            boolean bl2 = fileProviderService.updateFile(string3, (byte[])object);
            string2 = kp1_0.c("writeManifest ", string2);
            this.logTimeTaken(l2, string2);
            return bl2;
        }
    }

    private final boolean writePackageManifest(ReleaseConfig$PackageManifest object) {
        object = ((ReleaseConfig$PackageManifest)object).toJSON().toString();
        Intrinsics.checkNotNullExpressionValue(object, "packageManifest.toJSON().toString()");
        return this.writeManifest("pkg.json", (String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final UpdateResult await(SdkTracker object) {
        long l2;
        String object2 = TAG;
        Intrinsics.checkNotNullParameter(object, "tracker");
        List list = this.trackers;
        boolean bl2 = list.contains(object);
        if (!bl2) {
            list = this.trackers;
            list.add(object);
        }
        try {
            object = UpdateTask$Stage.FETCHING_RC;
            l2 = this.releaseConfigTimeout;
            this.awaitCompletion((UpdateTask$Stage)((Object)object), l2);
        }
        catch (TimeoutException timeoutException) {
            JuspayLogger.d(object2, "Timeout waiting for release config fetch.");
            return UpdateResult$ReleaseConfigFetchTimeout.INSTANCE;
        }
        try {
            object = UpdateTask$Stage.DOWNLOADING_UPDATES;
            l2 = this.packageTimeout;
            this.awaitCompletion((UpdateTask$Stage)((Object)object), l2);
        }
        catch (TimeoutException timeoutException) {
            JuspayLogger.d(object2, "Timeout waiting for package update.");
            object = this.currentResult;
            boolean bl3 = object instanceof UpdateResult$Ok;
            object = bl3 ? ((UpdateResult$Ok)object).getReleaseConfig() : null;
            return new UpdateResult$PackageUpdateTimeout((ReleaseConfig)object);
        }
        try {
            object = UpdateTask$Stage.INSTALLING;
            l2 = 10000L;
            this.awaitCompletion((UpdateTask$Stage)((Object)object), l2);
            return this.currentResult;
        }
        catch (TimeoutException timeoutException) {
            JuspayLogger.e(object2, "TIMEOUT WAITING for INSTALLING!");
            return UpdateResult$Error$Unknown.INSTANCE;
        }
    }

    public final void awaitOnFinish$hyper_sdk_release() {
        this.onFinishWaitTask.get();
    }

    public final String getUpdateUUID() {
        return this.updateUUID;
    }

    public final void run(Function2 object) {
        Intrinsics.checkNotNullParameter(object, "onFinish");
        this.trackInit();
        Object object2 = this.currentStage;
        UpdateTask$Stage updateTask$Stage = UpdateTask$Stage.INITIALIZING;
        if (object2 == updateTask$Stage) {
            long l2;
            this.onFinish = object;
            this.initTime = l2 = System.currentTimeMillis();
            this.onComplete(updateTask$Stage);
            object = Companion;
            object2 = new Mw3(this);
            UpdateTask$Companion.access$doAsync((UpdateTask$Companion)object, (Callable)object2);
        }
    }
}

