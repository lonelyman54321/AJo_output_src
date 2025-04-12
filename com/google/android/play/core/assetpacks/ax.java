/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.assetpacks.aa;
import com.google.android.play.core.assetpacks.ab;
import com.google.android.play.core.assetpacks.ac;
import com.google.android.play.core.assetpacks.ad;
import com.google.android.play.core.assetpacks.ae;
import com.google.android.play.core.assetpacks.af;
import com.google.android.play.core.assetpacks.ah;
import com.google.android.play.core.assetpacks.aj;
import com.google.android.play.core.assetpacks.ak;
import com.google.android.play.core.assetpacks.al;
import com.google.android.play.core.assetpacks.bf;
import com.google.android.play.core.assetpacks.bl;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.internal.ag;
import com.google.android.play.core.assetpacks.internal.ai;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

final class ax
implements com.google.android.play.core.assetpacks.z {
    private static final o a;
    private static final Intent b;
    private final String c;
    private final dd d;
    private final er e;
    private z f;
    private z g;
    private final AtomicBoolean h;

    static {
        o o3;
        a = o3 = new o("AssetPackServiceImpl");
        o3 = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE");
        b = o3.setPackage("com.android.vending");
    }

    public ax(Context object, dd object2, er object3) {
        Object[] objectArray = new AtomicBoolean();
        this.h = objectArray;
        objectArray = object.getPackageName();
        this.c = objectArray;
        this.d = object2;
        this.e = object3;
        boolean bl2 = ai.b((Context)object);
        if (bl2) {
            Context context = ag.a((Context)object);
            object3 = a;
            Object object4 = b;
            Object object5 = new ab();
            objectArray = object2;
            super(context, (o)object3, "AssetPackService", (Intent)object4, (ab)object5, null);
            this.f = object2;
            Context context2 = ag.a((Context)object);
            object = new ab();
            object5 = "AssetPackService-keepAlive";
            Intent intent = object4;
            object4 = object;
            super(context2, (o)object3, (String)object5, intent, (ab)object, null);
            this.g = object2;
        }
        object = a;
        object2 = new Object[]{};
        ((o)object).a("AssetPackService initiated.", object2);
    }

    private static Bundle A() {
        Bundle bundle = dk0.a(20300, "playcore_version_code");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Integer n3 = 0;
        arrayList.add(n3);
        n3 = 1;
        arrayList.add(n3);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        arrayList = new ArrayList<Integer>();
        arrayList.add(n3);
        n3 = 2;
        arrayList.add(n3);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList);
        return bundle;
    }

    private static Bundle B(int n3) {
        return dk0.a(n3, "session_id");
    }

    private static Task C() {
        Object object = a;
        int n3 = -11;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4};
        ((o)object).b("onError(%d)", objectArray);
        object = new AssetPackException(n3);
        return Tasks.forException((Exception)object);
    }

    private final void D(int n3, String object, int n4) {
        Object object2 = this.f;
        if (object2 != null) {
            object2 = a;
            Object object3 = new Object[]{};
            ((o)object2).d("notifyModuleCompleted", (Object[])object3);
            object2 = new TaskCompletionSource();
            object3 = this.f;
            com.google.android.play.core.assetpacks.ai ai2 = new com.google.android.play.core.assetpacks.ai(this, (TaskCompletionSource)object2, n3, (String)object, (TaskCompletionSource)object2, n4);
            ((z)object3).t(ai2, (TaskCompletionSource)object2);
            return;
        }
        object = new cz("The Play Store app is not installed or is an unofficial version.", n3);
        throw object;
    }

    public static /* bridge */ /* synthetic */ Bundle k(int n3, String string2, String string3, int n4) {
        Bundle bundle = ax.z(n3, string2);
        bundle.putString("slice_id", string3);
        bundle.putInt("chunk_number", n4);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle l(int n3, String string2) {
        return ax.z(n3, string2);
    }

    public static /* bridge */ /* synthetic */ Bundle m() {
        return ax.A();
    }

    public static /* bridge */ /* synthetic */ Bundle n(Map object) {
        boolean bl2;
        Bundle bundle = ax.A();
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Bundle bundle2 = new Bundle();
            String string2 = (String)object2.getKey();
            String string3 = "installed_asset_module_name";
            bundle2.putString(string3, string2);
            long l2 = (Long)object2.getValue();
            object2 = "installed_asset_module_version";
            bundle2.putLong((String)object2, l2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("installed_asset_module", arrayList);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle o(int n3) {
        return ax.B(n3);
    }

    public static /* bridge */ /* synthetic */ dd p(ax ax2) {
        return ax2.d;
    }

    public static /* bridge */ /* synthetic */ er q(ax ax2) {
        return ax2.e;
    }

    public static /* bridge */ /* synthetic */ o r() {
        return a;
    }

    public static /* bridge */ /* synthetic */ z s(ax ax2) {
        return ax2.f;
    }

    public static /* bridge */ /* synthetic */ z t(ax ax2) {
        return ax2.g;
    }

    public static /* bridge */ /* synthetic */ String u(ax ax2) {
        return ax2.c;
    }

    public static /* bridge */ /* synthetic */ ArrayList v(Collection object) {
        int n3 = object.size();
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string2 = (String)object.next();
            Bundle bundle = new Bundle();
            String string3 = "module_name";
            bundle.putString(string3, string2);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List w(ax ax2, List object) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            Object object2 = (Bundle)object.next();
            Object object3 = ax2.d;
            Object[] objectArray = ax2.e;
            if ((object2 = (AssetPackState)AssetPackStates.a((Bundle)object2, (dd)object3, (er)objectArray).packStates().values().iterator().next()) == null) {
                object3 = a;
                objectArray = new Object[]{};
                String string2 = "onGetSessionStates: Bundle contained no pack.";
                ((o)object3).b(string2, objectArray);
            }
            if (!(bl3 = bl.a(((AssetPackState)object2).status()))) continue;
            object2 = ((AssetPackState)object2).name();
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ AtomicBoolean x(ax ax2) {
        return ax2.h;
    }

    public static /* bridge */ /* synthetic */ void y(ax ax2, int n3, String string2, int n4) {
        ax2.D(n3, string2, n4);
    }

    private static Bundle z(int n3, String string2) {
        Bundle bundle = ax.B(n3);
        bundle.putString("module_name", string2);
        return bundle;
    }

    public final Task a(int n3, String string2, String string3, int n4) {
        ak ak2;
        Object object = this.f;
        if (object == null) {
            return ax.C();
        }
        object = a;
        Object object2 = n4;
        Object object3 = n3;
        Object[] objectArray = new Object[]{string2, string3, object2, object3};
        ((o)object).d("getChunkFileDescriptor(%s, %s, %d, session=%d)", objectArray);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        z z5 = this.f;
        object = ak2;
        object2 = this;
        object3 = taskCompletionSource;
        ak2 = new ak(this, taskCompletionSource, n3, string2, string3, n4, taskCompletionSource);
        z5.t(ak2, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task b(List list, bf bf2, Map map2) {
        Object object = this.f;
        if (object == null) {
            return ax.C();
        }
        object = a;
        Object object2 = new Object[]{list};
        ((o)object).d("getPackStates(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.f;
        com.google.android.play.core.assetpacks.ag ag2 = new com.google.android.play.core.assetpacks.ag(this, (TaskCompletionSource)object, list, map2, (TaskCompletionSource)object, bf2);
        ((z)object2).t(ag2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task c(List object, Map object2) {
        Object object3 = this.f;
        if (object3 == null) {
            return ax.C();
        }
        object3 = a;
        Object object4 = new Object[]{object};
        ((o)object3).d("startDownload(%s)", (Object[])object4);
        object3 = new TaskCompletionSource();
        object4 = this.f;
        ad ad2 = new ad(this, (TaskCompletionSource)object3, (List)object, (Map)object2, (TaskCompletionSource)object3);
        ((z)object4).t(ad2, (TaskCompletionSource)object3);
        object = ((TaskCompletionSource)object3).getTask();
        object2 = new aa(this);
        ((Task)object).addOnSuccessListener((OnSuccessListener)object2);
        return ((TaskCompletionSource)object3).getTask();
    }

    public final Task d(Map map2) {
        Object object = this.f;
        if (object == null) {
            return ax.C();
        }
        object = a;
        Object object2 = new Object[]{};
        ((o)object).d("syncPacks", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.f;
        af af2 = new af(this, (TaskCompletionSource)object, map2, (TaskCompletionSource)object);
        ((z)object2).t(af2, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }

    public final void e(List list) {
        Object object = this.f;
        if (object == null) {
            return;
        }
        object = a;
        Object object2 = new Object[]{list};
        ((o)object).d("cancelDownloads(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.f;
        ae ae2 = new ae(this, (TaskCompletionSource)object, list, (TaskCompletionSource)object);
        ((z)object2).t(ae2, (TaskCompletionSource)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object[] objectArray;
                Object object;
                try {
                    object = this.g;
                    objectArray = null;
                    if (object == null) {
                        object = a;
                        objectArray = new Object[]{};
                        String string2 = "Keep alive connection manager is not initialized.";
                        ((o)object).e(string2, objectArray);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = a;
                Object object2 = new Object[]{};
                String string3 = "keepAlive";
                ((o)object).d(string3, (Object[])object2);
                object2 = this.h;
                boolean bl2 = true;
                boolean bl3 = ((AtomicBoolean)object2).compareAndSet(false, bl2);
                if (!bl3) {
                    objectArray = new Object[]{};
                    object2 = "Service is already kept alive.";
                    ((o)object).d((String)object2, objectArray);
                    return;
                }
                object = new TaskCompletionSource();
                objectArray = this.g;
                object2 = new al(this, (TaskCompletionSource)object, (TaskCompletionSource)object);
                objectArray.t((p)object2, (TaskCompletionSource)object);
                return;
            }
            throw throwable2;
        }
    }

    public final void g(int n3, String object, String string2, int n4) {
        Object object2 = this.f;
        if (object2 != null) {
            object2 = a;
            Object object3 = new Object[]{};
            ((o)object2).d("notifyChunkTransferred", (Object[])object3);
            object2 = new TaskCompletionSource();
            object3 = this.f;
            ah ah2 = new ah(this, (TaskCompletionSource)object2, n3, (String)object, string2, n4, (TaskCompletionSource)object2);
            ((z)object3).t(ah2, (TaskCompletionSource)object2);
            return;
        }
        object = new cz("The Play Store app is not installed or is an unofficial version.", n3);
        throw object;
    }

    public final void h(int n3, String string2) {
        this.D(n3, string2, 10);
    }

    public final void i(int n3) {
        Object object = this.f;
        if (object != null) {
            object = a;
            Object object2 = new Object[]{};
            ((o)object).d("notifySessionFailed", (Object[])object2);
            object = new TaskCompletionSource();
            object2 = this.f;
            aj aj2 = new aj(this, (TaskCompletionSource)object, n3, (TaskCompletionSource)object);
            ((z)object2).t(aj2, (TaskCompletionSource)object);
            return;
        }
        object = new cz("The Play Store app is not installed or is an unofficial version.", n3);
        throw object;
    }

    public final void j(String string2) {
        Object object = this.f;
        if (object == null) {
            return;
        }
        object = a;
        Object object2 = new Object[]{string2};
        ((o)object).d("removePack(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = this.f;
        ac ac2 = new ac(this, (TaskCompletionSource)object, string2, (TaskCompletionSource)object);
        ((z)object2).t(ac2, (TaskCompletionSource)object);
    }
}

