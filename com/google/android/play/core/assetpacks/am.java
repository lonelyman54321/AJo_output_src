/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.internal.g;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.List;

class am
extends g {
    final TaskCompletionSource a;
    final /* synthetic */ ax b;

    public am(ax ax2, TaskCompletionSource taskCompletionSource) {
        this.b = ax2;
        this.a = taskCompletionSource;
    }

    public final void b(int n3, Bundle object) {
        object = ax.s(this.b);
        Object[] objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        Integer n4 = n3;
        objectArray = new Object[]{n4};
        ((o)object).d("onCancelDownload(%d)", objectArray);
    }

    public final void c(Bundle object) {
        object = ax.s(this.b);
        Object[] objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        objectArray = new Object[]{};
        ((o)object).d("onCancelDownloads()", objectArray);
    }

    public void d(Bundle bundle) {
        Object object = ax.s(this.b);
        Object object2 = this.a;
        ((z)object).u((TaskCompletionSource)object2);
        int n3 = bundle.getInt("error_code");
        object = ax.r();
        object2 = n3;
        Object[] objectArray = new Object[]{object2};
        ((o)object).b("onError(%d)", objectArray);
        object = new AssetPackException(n3);
        this.a.trySetException((Exception)object);
    }

    public void e(Bundle object, Bundle objectArray) {
        object = ax.s(this.b);
        objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        objectArray = new Object[]{};
        ((o)object).d("onGetChunkFileDescriptor", objectArray);
    }

    public final void f(int n3, Bundle object) {
        object = ax.s(this.b);
        Object[] objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        Integer n4 = n3;
        objectArray = new Object[]{n4};
        ((o)object).d("onGetSession(%d)", objectArray);
    }

    public void g(List object) {
        object = ax.s(this.b);
        Object[] objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        objectArray = new Object[]{};
        ((o)object).d("onGetSessionStates", objectArray);
    }

    public void h(Bundle object, Bundle object2) {
        object2 = ax.t(this.b);
        Object[] objectArray = this.a;
        ((z)object2).u((TaskCompletionSource)objectArray);
        object2 = ax.r();
        object = object.getBoolean("keep_alive");
        objectArray = new Object[]{object};
        ((o)object2).d("onKeepAlive(%b)", objectArray);
    }

    public final void i(Bundle object, Bundle object2) {
        object2 = ax.s(this.b);
        Object object3 = this.a;
        ((z)object2).u((TaskCompletionSource)object3);
        object2 = ax.r();
        object3 = object.getString("module_name");
        String string2 = object.getString("slice_id");
        Integer n3 = object.getInt("chunk_number");
        object = object.getInt("session_id");
        Object[] objectArray = new Object[]{object3, string2, n3, object};
        ((o)object2).d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", objectArray);
    }

    public final void j(Bundle object, Bundle object2) {
        object2 = ax.s(this.b);
        Object object3 = this.a;
        ((z)object2).u((TaskCompletionSource)object3);
        object2 = ax.r();
        object3 = object.getString("module_name");
        object = object.getInt("session_id");
        Object[] objectArray = new Object[]{object3, object};
        ((o)object2).d("onNotifyModuleCompleted(%s, sessionId=%d)", objectArray);
    }

    public final void k(Bundle object, Bundle object2) {
        object2 = ax.s(this.b);
        Object[] objectArray = this.a;
        ((z)object2).u((TaskCompletionSource)objectArray);
        object2 = ax.r();
        object = object.getInt("session_id");
        objectArray = new Object[]{object};
        ((o)object2).d("onNotifySessionFailed(%d)", objectArray);
    }

    public final void l(Bundle object, Bundle objectArray) {
        object = ax.s(this.b);
        objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        objectArray = new Object[]{};
        ((o)object).d("onRemoveModule()", objectArray);
    }

    public void m(Bundle object, Bundle objectArray) {
        object = ax.s(this.b);
        objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        objectArray = new Object[]{};
        ((o)object).d("onRequestDownloadInfo()", objectArray);
    }

    public void n(int n3, Bundle object) {
        object = ax.s(this.b);
        Object[] objectArray = this.a;
        ((z)object).u((TaskCompletionSource)objectArray);
        object = ax.r();
        Integer n4 = n3;
        objectArray = new Object[]{n4};
        ((o)object).d("onStartDownload(%d)", objectArray);
    }
}

