/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.ota.ApplicationManager$StateKey;
import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.ReleaseConfig$Companion;
import in.juspay.hypersdk.ota.ReleaseConfig$Resource;
import in.juspay.hypersdk.ota.ReleaseConfig$ResourceManifest;
import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.ota.UpdateTask$Companion;
import in.juspay.hypersdk.ota.UpdateTask$Result;
import in.juspay.hypersdk.ota.UpdateTask$Result$Error;
import in.juspay.hypersdk.ota.UpdateTask$Result$Ok;
import in.juspay.hypersdk.ota.a;
import in.juspay.hypersdk.ota.b;
import in.juspay.hypersdk.ota.c;
import in.juspay.hypersdk.ota.d;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.FileProviderService$TempWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

final class UpdateTask$ResourceUpdateTask {
    private final Set commonResources;
    private final ReleaseConfig$ResourceManifest currentResourceManifest;
    public List futures;
    private final ReleaseConfig$ResourceManifest newResourceManifest;
    private final List newResources;
    private final Pair savedResourcesInfo;
    private final FileProviderService$TempWriter tempWriter;
    final /* synthetic */ UpdateTask this$0;

    public UpdateTask$ResourceUpdateTask(UpdateTask object, ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest, ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest2) {
        Intrinsics.checkNotNullParameter(releaseConfig$ResourceManifest2, "newResourceManifest");
        this.this$0 = object;
        this.currentResourceManifest = releaseConfig$ResourceManifest;
        this.newResourceManifest = releaseConfig$ResourceManifest2;
        object = UpdateTask.access$getFileProviderService$p((UpdateTask)object).newTempWriter("resources");
        String string2 = "fileProviderService.newT\u2026riter(RESOURCES_DIR_NAME)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.tempWriter = object;
        if (releaseConfig$ResourceManifest != null) {
            object = CollectionsKt.o0(releaseConfig$ResourceManifest2);
            object = CollectionsKt.P(releaseConfig$ResourceManifest, (Iterable)object);
        } else {
            object = vz0_2.a;
        }
        this.commonResources = object;
        this.newResources = object = CollectionsKt.V(releaseConfig$ResourceManifest2, (Iterable)object);
        this.savedResourcesInfo = object = this.findSavedResources();
    }

    public static /* synthetic */ ReleaseConfig$Resource a(FileProviderService$TempWriter fileProviderService$TempWriter, ReleaseConfig$Resource releaseConfig$Resource) {
        return UpdateTask$ResourceUpdateTask.copyResource$lambda$17(fileProviderService$TempWriter, releaseConfig$Resource);
    }

    public static /* synthetic */ void b(UpdateTask updateTask) {
        UpdateTask$ResourceUpdateTask.stopAndInstall$lambda$10(updateTask);
    }

    public static /* synthetic */ Unit c(UpdateTask$ResourceUpdateTask updateTask$ResourceUpdateTask) {
        return UpdateTask$ResourceUpdateTask.stopAndInstall$lambda$9(updateTask$ResourceUpdateTask);
    }

    private final Future copyResource(ReleaseConfig$Resource releaseConfig$Resource, FileProviderService$TempWriter fileProviderService$TempWriter) {
        UpdateTask$Companion updateTask$Companion = UpdateTask.Companion;
        b b2 = new b(fileProviderService$TempWriter, releaseConfig$Resource);
        return UpdateTask$Companion.access$doAsync(updateTask$Companion, b2);
    }

    private static final ReleaseConfig$Resource copyResource$lambda$17(FileProviderService$TempWriter object, ReleaseConfig$Resource object2) {
        Intrinsics.checkNotNullParameter(object, "$tempWriter");
        Intrinsics.checkNotNullParameter(object2, "$resource");
        String string2 = ((ReleaseConfig$Resource)object2).getFileName();
        String string3 = "app/resources";
        boolean bl2 = ((FileProviderService$TempWriter)object).moveToMain(string2, string3);
        if (!bl2) {
            string2 = "Failed to copy resource: ";
            object = new StringBuilder(string2);
            object2 = ((ReleaseConfig$Resource)object2).getFileName();
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            JuspayLogger.e("UpdateTask", (String)object);
            object2 = null;
        }
        return object2;
    }

    public static /* synthetic */ UpdateTask$Result d(UpdateTask$ResourceUpdateTask updateTask$ResourceUpdateTask, ReleaseConfig$Resource releaseConfig$Resource, UpdateTask updateTask) {
        return UpdateTask$ResourceUpdateTask.start$lambda$2$lambda$1(updateTask$ResourceUpdateTask, releaseConfig$Resource, updateTask);
    }

    private final Pair findSavedResources() {
        Object object;
        block12: {
            Object object2 = this.this$0;
            object = ApplicationManager$StateKey.SAVED_RESOURCE_UPDATE;
            object2 = UpdateTask.access$readPersistentState((UpdateTask)object2, object);
            object = null;
            if (object2 != null) {
                UpdateTask updateTask = this.this$0;
                Object object3 = new StringBuilder("Found saved resources ");
                ((StringBuilder)object3).append(object2);
                char c2 = '.';
                ((StringBuilder)object3).append(c2);
                object3 = ((StringBuilder)object3).toString();
                Object object4 = "UpdateTask";
                JuspayLogger.d((String)object4, (String)object3);
                object3 = UpdateTask.access$getFileProviderService$p(updateTask);
                object4 = "dir";
                object4 = object2.getString((String)object4);
                object3 = ((FileProviderService)object3).reOpenTempWriter((String)object4);
                object4 = ReleaseConfig.Companion;
                String string2 = "resource_manifest";
                object2 = object2.getJSONObject(string2);
                string2 = "it.getJSONObject(\"resource_manifest\")";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                object2 = ((ReleaseConfig$Companion)object4).resourcesFromJSON((JSONObject)object2);
                c2 = (char)(object2.isEmpty() ? 1 : 0);
                if (c2 != '\u0000') break block12;
                try {
                    object4 = new Pair(object3, object2);
                    object = object4;
                }
                catch (Exception exception) {
                    object2 = ApplicationManager$StateKey.SAVED_RESOURCE_UPDATE;
                    UpdateTask.access$removeFromPersistentState(updateTask, (ApplicationManager$StateKey)((Object)object2));
                    int n3 = 4;
                    object3 = "saved_resources_corrupted";
                    string2 = null;
                    UpdateTask.trackException$default(updateTask, (String)object3, exception, null, n3, null);
                }
            }
        }
        return object;
    }

    private static final UpdateTask$Result start$lambda$2$lambda$1(UpdateTask$ResourceUpdateTask object, ReleaseConfig$Resource releaseConfig$Resource, UpdateTask object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(releaseConfig$Resource, "$resource");
        Intrinsics.checkNotNullParameter(object2, "this$1");
        Object object3 = ((UpdateTask$ResourceUpdateTask)object).savedResourcesInfo;
        Object object4 = "UpdateTask";
        if (object3 != null && (bl2 = ((ReleaseConfig$ResourceManifest)(object3 = (ReleaseConfig$ResourceManifest)((Pair)object3).b)).contains((Object)releaseConfig$Resource))) {
            object2 = new StringBuilder("Skipping download of saved resource: ");
            object3 = releaseConfig$Resource.getFileName();
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            JuspayLogger.d((String)object4, (String)object2);
            object = ((UpdateTask$ResourceUpdateTask)object).savedResourcesInfo.a;
            object3 = new Pair(releaseConfig$Resource, object);
            object2 = new UpdateTask$Result$Ok(object3);
        } else {
            object3 = new StringBuilder("Downloading resource: ");
            String string2 = releaseConfig$Resource.getFileName();
            ((StringBuilder)object3).append(string2);
            object3 = ((StringBuilder)object3).toString();
            JuspayLogger.d((String)object4, (String)object3);
            object3 = ((UpdateTask$ResourceUpdateTask)object).tempWriter;
            object4 = releaseConfig$Resource.getUrl();
            string2 = releaseConfig$Resource.getFileName();
            object2 = UpdateTask.access$downloadFile((UpdateTask)object2, (FileProviderService$TempWriter)object3, (URL)object4, string2);
            boolean bl3 = object2 instanceof UpdateTask$Result$Ok;
            if (bl3) {
                object = ((UpdateTask$ResourceUpdateTask)object).tempWriter;
                object3 = new Pair(releaseConfig$Resource, object);
                object2 = new UpdateTask$Result$Ok(object3);
            } else {
                object2 = new UpdateTask$Result$Error();
            }
        }
        return object2;
    }

    private static final void stopAndInstall$lambda$10(UpdateTask updateTask) {
        Intrinsics.checkNotNullParameter(updateTask, "this$0");
        ApplicationManager$StateKey applicationManager$StateKey = ApplicationManager$StateKey.SAVED_RESOURCE_UPDATE;
        UpdateTask.access$removeFromPersistentState(updateTask, applicationManager$StateKey);
    }

    private static final Unit stopAndInstall$lambda$9(UpdateTask$ResourceUpdateTask updateTask$ResourceUpdateTask) {
        Intrinsics.checkNotNullParameter(updateTask$ResourceUpdateTask, "this$0");
        updateTask$ResourceUpdateTask.saveDownloadedResources();
        return Unit.a;
    }

    private final boolean writeResourceManifest(ReleaseConfig$ResourceManifest object) {
        object = ((ReleaseConfig$ResourceManifest)object).toJSON();
        UpdateTask updateTask = this.this$0;
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "json.toString()");
        return UpdateTask.access$writeManifest(updateTask, "resources.json", (String)object);
    }

    public final Set getCommonResources() {
        return this.commonResources;
    }

    public final ReleaseConfig$ResourceManifest getCurrentResourceManifest() {
        return this.currentResourceManifest;
    }

    public final List getFutures() {
        List list = this.futures;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("futures");
        return null;
    }

    public final ReleaseConfig$ResourceManifest getNewResourceManifest() {
        return this.newResourceManifest;
    }

    public final List getNewResources() {
        return this.newResources;
    }

    public final Pair getSavedResourcesInfo() {
        return this.savedResourcesInfo;
    }

    public final FileProviderService$TempWriter getTempWriter() {
        return this.tempWriter;
    }

    public final boolean isDone() {
        boolean bl2;
        Object object = this.getFutures();
        boolean bl3 = object instanceof Collection;
        if (!bl3 || !(bl3 = ((Collection)object).isEmpty())) {
            object = ((Iterable)object).iterator();
            while (bl3 = object.hasNext()) {
                Future future = (Future)object.next();
                bl3 = future.isDone();
                if (bl3) continue;
                bl2 = false;
                object = null;
                break;
            }
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void saveDownloadedResources() {
        Object object;
        Object object2;
        boolean bl2;
        boolean bl3;
        Object object3;
        JSONObject jSONObject = this.getFutures();
        int n3 = 10;
        int n4 = yx_2.o((Iterable)jSONObject, n3);
        Object object4 = new ArrayList(n4);
        jSONObject = jSONObject.iterator();
        while ((n4 = (int)(jSONObject.hasNext() ? 1 : 0)) != 0) {
            object3 = (UpdateTask$Result)((Future)jSONObject.next()).get();
            ((ArrayList)object4).add(object3);
        }
        boolean bl4 = ((ArrayList)object4).isEmpty();
        object3 = "UpdateTask";
        if (bl4) {
            JuspayLogger.d((String)object3, "No resources to save.");
            return;
        }
        Object object5 = "Download results: ";
        jSONObject = new StringBuilder((String)object5);
        jSONObject.append(object4);
        jSONObject = jSONObject.toString();
        JuspayLogger.d((String)object3, (String)jSONObject);
        jSONObject = new ArrayList();
        object4 = ((ArrayList)object4).iterator();
        while (bl3 = object4.hasNext()) {
            object5 = object4.next();
            bl2 = object5 instanceof UpdateTask$Result$Ok;
            if (!bl2) continue;
            jSONObject.add(object5);
        }
        object4 = new ArrayList();
        jSONObject = jSONObject.iterator();
        while (bl3 = jSONObject.hasNext()) {
            String string2;
            object2 = object5 = jSONObject.next();
            object2 = ((FileProviderService$TempWriter)((Pair)((UpdateTask$Result$Ok)object5).getV()).b).getDirName();
            bl2 = Intrinsics.areEqual(object2, string2 = this.tempWriter.getDirName());
            if (!bl2) continue;
            ((ArrayList)object4).add(object5);
        }
        n3 = yx_2.o(object4, n3);
        jSONObject = new ArrayList(n3);
        object4 = ((ArrayList)object4).iterator();
        while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            object = (ReleaseConfig$Resource)((Pair)((UpdateTask$Result$Ok)object4.next()).getV()).a;
            jSONObject.add(object);
        }
        object4 = this.newResourceManifest;
        object = new ArrayList();
        object4 = object4.iterator();
        while (bl3 = object4.hasNext()) {
            object2 = object5 = object4.next();
            object2 = (ReleaseConfig$Resource)object5;
            bl2 = jSONObject.contains(object2);
            if (!bl2) continue;
            ((ArrayList)object).add(object5);
        }
        object4 = this.tempWriter.getDirName();
        object5 = new Pair("dir", object4);
        object4 = new ReleaseConfig$ResourceManifest((List)object);
        object4 = ((ReleaseConfig$ResourceManifest)object4).toJSON();
        object2 = new Pair("resource_manifest", object4);
        object4 = new Pair[]{object5, object2};
        object4 = fh1_2.i((Pair[])object4);
        jSONObject = new JSONObject((Map)object4);
        object4 = new StringBuilder("Saved resources ");
        ((StringBuilder)object4).append(object);
        object4 = ((StringBuilder)object4).toString();
        JuspayLogger.d((String)object3, (String)object4);
        object4 = this.this$0;
        object = ApplicationManager$StateKey.SAVED_RESOURCE_UPDATE;
        UpdateTask.access$setInPersistentState((UpdateTask)object4, (ApplicationManager$StateKey)((Object)object), jSONObject);
    }

    public final void setFutures(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.futures = list;
    }

    public final void start() {
        JuspayLogger.d("UpdateTask", "Starting resource update task.");
        Object object = this.newResources;
        UpdateTask updateTask = this.this$0;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (ReleaseConfig$Resource)object.next();
            UpdateTask$Companion updateTask$Companion = UpdateTask.Companion;
            a a2 = new a(this, (ReleaseConfig$Resource)object2, updateTask);
            object2 = UpdateTask$Companion.access$doAsync(updateTask$Companion, a2);
            arrayList.add(object2);
        }
        this.setFutures(arrayList);
    }

    public final ReleaseConfig$ResourceManifest stopAndInstall() {
        boolean bl2;
        Object object;
        boolean bl3;
        Object object2;
        Object object3;
        boolean bl4;
        int n3;
        Object object4;
        Object object5;
        int n4;
        Object object6 = this.getFutures();
        ArrayList arrayList = new ArrayList();
        object6 = object6.iterator();
        while ((n4 = object6.hasNext()) != 0) {
            object4 = object5 = object6.next();
            object4 = (Future)object5;
            n3 = (int)(object4.isDone() ? 1 : 0);
            if (n3 == 0) continue;
            arrayList.add(object5);
        }
        n4 = 10;
        n3 = yx_2.o(arrayList, n4);
        object6 = new ArrayList(n3);
        arrayList = arrayList.iterator();
        while ((n3 = (int)(arrayList.hasNext() ? 1 : 0)) != 0) {
            object4 = (UpdateTask$Result)((Future)arrayList.next()).get();
            ((ArrayList)object6).add(object4);
        }
        arrayList = new ArrayList();
        object6 = ((ArrayList)object6).iterator();
        while ((n3 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
            object4 = object6.next();
            bl4 = object4 instanceof UpdateTask$Result$Ok;
            if (!bl4) continue;
            arrayList.add(object4);
        }
        n3 = yx_2.o(arrayList, n4);
        object6 = new ArrayList(n3);
        arrayList = arrayList.iterator();
        while ((n3 = (int)(arrayList.hasNext() ? 1 : 0)) != 0) {
            object4 = (UpdateTask$Result$Ok)arrayList.next();
            object3 = (ReleaseConfig$Resource)((Pair)((UpdateTask$Result$Ok)object4).getV()).a;
            object4 = (FileProviderService$TempWriter)((Pair)((UpdateTask$Result$Ok)object4).getV()).b;
            object4 = this.copyResource((ReleaseConfig$Resource)object3, (FileProviderService$TempWriter)object4);
            ((ArrayList)object6).add(object4);
        }
        arrayList = new ArrayList();
        object6 = ((ArrayList)object6).iterator();
        while ((n3 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
            object4 = (ReleaseConfig$Resource)((Future)object6.next()).get();
            if (object4 == null) continue;
            arrayList.add(object4);
        }
        object6 = this.newResources;
        object4 = new ArrayList();
        object6 = object6.iterator();
        while (bl4 = object6.hasNext()) {
            object2 = object3 = object6.next();
            object2 = (ReleaseConfig$Resource)object3;
            bl3 = arrayList.contains(object2);
            if (bl3) continue;
            ((ArrayList)object4).add(object3);
        }
        boolean bl5 = ((ArrayList)object4).isEmpty();
        object3 = "UpdateTask";
        if (!bl5) {
            boolean bl6;
            object6 = new StringBuilder("Skipped resources ");
            ((StringBuilder)object6).append(object4);
            object6 = ((StringBuilder)object6).toString();
            JuspayLogger.d((String)object3, (String)object6);
            object6 = this.this$0;
            object2 = new JSONObject();
            n4 = yx_2.o((Iterable)object4, n4);
            object = new ArrayList(n4);
            object5 = ((ArrayList)object4).iterator();
            while (bl6 = object5.hasNext()) {
                JSONObject jSONObject = ((ReleaseConfig$Resource)object5.next()).toJSON();
                ((ArrayList)object).add(jSONObject);
            }
            object5 = object2.put("resources", object);
            Intrinsics.checkNotNullExpressionValue(object5, "JSONObject().put(\"resour\u2026pped.map { it.toJSON() })");
            UpdateTask.access$trackInfo(object6, "skipped_resources", (JSONObject)object5);
            object6 = this.this$0;
            object5 = UpdateTask.Companion;
            object2 = new c(this);
            object5 = UpdateTask$Companion.access$doAsync((UpdateTask$Companion)object5, (Callable)object2);
            UpdateTask.access$setResourceSaveFuture$p((UpdateTask)object6, (Future)object5);
        } else {
            object6 = this.savedResourcesInfo;
            if (object6 != null) {
                object6 = this.this$0;
                object5 = new d((UpdateTask)object6);
                ExecutorManager.runOnBackgroundThread(object5);
            }
            object6 = "No resources skipped!";
            JuspayLogger.d((String)object3, (String)object6);
        }
        bl5 = arrayList.isEmpty();
        if (bl5) {
            JuspayLogger.d((String)object3, "No new resources to install.");
            return null;
        }
        object6 = this.currentResourceManifest;
        if (object6 == null) {
            object6 = mz0_2.a;
        }
        object5 = new ArrayList();
        object6 = object6.iterator();
        while (bl3 = object6.hasNext()) {
            object = object2 = object6.next();
            object = object2;
            bl2 = ((ArrayList)object4).contains(object);
            if (!bl2) continue;
            ((ArrayList)object5).add(object2);
        }
        object6 = this.newResourceManifest;
        object4 = new ArrayList();
        object6 = object6.iterator();
        while (bl3 = object6.hasNext()) {
            object = object2 = object6.next();
            object = object2;
            bl2 = arrayList.contains(object);
            if (!bl2) continue;
            ((ArrayList)object4).add(object2);
        }
        object6 = new StringBuilder("Retaining outdated resources: ");
        ((StringBuilder)object6).append(object5);
        object6 = ((StringBuilder)object6).toString();
        JuspayLogger.d((String)object3, (String)object6);
        object6 = new StringBuilder("Retaining common resources: ");
        arrayList = this.commonResources;
        ((StringBuilder)object6).append(arrayList);
        object6 = ((StringBuilder)object6).toString();
        JuspayLogger.d((String)object3, (String)object6);
        object6 = new StringBuilder("Latest resources installed: ");
        ((StringBuilder)object6).append(object4);
        object6 = ((StringBuilder)object6).toString();
        JuspayLogger.d((String)object3, (String)object6);
        arrayList = CollectionsKt.W((Iterable)object4, (Collection)object5);
        arrayList = CollectionsKt.W(CollectionsKt.k0(this.commonResources), arrayList);
        object6 = new ReleaseConfig$ResourceManifest(arrayList);
        this.writeResourceManifest((ReleaseConfig$ResourceManifest)object6);
        return object6;
    }
}

