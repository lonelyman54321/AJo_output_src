/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.bc;
import com.google.android.play.core.assetpacks.bf;
import com.google.android.play.core.assetpacks.bt;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dy;
import com.google.android.play.core.assetpacks.dz;
import com.google.android.play.core.assetpacks.ea;
import com.google.android.play.core.assetpacks.eb;
import com.google.android.play.core.assetpacks.ec;
import com.google.android.play.core.assetpacks.ef;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.et;
import com.google.android.play.core.assetpacks.h;
import com.google.android.play.core.assetpacks.internal.ak;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.l;
import com.google.android.play.core.assetpacks.model.b;
import com.google.android.play.core.assetpacks.z;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

final class ed
implements z {
    public static final /* synthetic */ int a;
    private static final o b;
    private static final AtomicInteger c;
    private final String d;
    private final bc e;
    private final dd f;
    private final Context g;
    private final et h;
    private final er i;
    private final Handler j;
    private final aq k;

    static {
        Object object = new o("FakeAssetPackService");
        b = object;
        c = object = new AtomicInteger(1);
    }

    public ed(File object, bc bc2, dd dd2, Context context, et et2, aq aq2, er er2) {
        Handler handler;
        Looper looper = Looper.getMainLooper();
        this.j = handler = new Handler(looper);
        this.d = object = ((File)object).getAbsolutePath();
        this.e = bc2;
        this.f = dd2;
        this.g = context;
        this.h = et2;
        this.k = aq2;
        this.i = er2;
    }

    public static long k(int n3, long l2) {
        int n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4 && n3 != (n4 = 4)) {
                return 0L;
            }
            return l2;
        }
        return l2 / (long)2;
    }

    public static /* synthetic */ void l(ed ed2, int n3, String string2) {
        ed2.t(n3, string2);
    }

    public static /* synthetic */ void m(ed ed2, Intent intent) {
        bc bc2 = ed2.e;
        ed2 = ed2.g;
        bc2.c((Context)ed2, intent);
    }

    public static /* synthetic */ void n(ed ed2, List list, TaskCompletionSource taskCompletionSource) {
        ed2.u(list, taskCompletionSource);
    }

    public static /* synthetic */ void o(ed ed2, List list, bf bf2, TaskCompletionSource taskCompletionSource) {
        ed2.s(list, bf2, taskCompletionSource);
    }

    private final Bundle p(int n3, String object, int n4) {
        Bundle bundle = new Bundle();
        Object object2 = this.h;
        ArrayList arrayList = "app_version_code";
        int n7 = ((et)object2).a();
        bundle.putInt((String)((Object)arrayList), n7);
        bundle.putInt("session_id", n3);
        Intent intent = this.v((String)object);
        object2 = new ArrayList();
        int n8 = ((File[])intent).length;
        long l2 = 0L;
        for (int i3 = 0; i3 < n8; ++i3) {
            Object object3;
            Object object4;
            File file = intent[i3];
            long l3 = file.length();
            l2 += l3;
            Object object5 = new ArrayList();
            int n10 = 3;
            if (n4 == n10) {
                object4 = new Intent();
                object3 = Uri.EMPTY;
                object4 = object4.setData(object3);
            } else {
                n10 = 0;
                object4 = null;
            }
            ((ArrayList)object5).add(object4);
            object4 = ak.a(file);
            object3 = com.google.android.play.core.assetpacks.model.b.b("chunk_intents", (String)object, (String)object4);
            bundle.putParcelableArrayList((String)object3, object5);
            object5 = com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", (String)object, (String)object4);
            object3 = ed.r(file);
            bundle.putString((String)object5, (String)object3);
            object5 = com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", (String)object, (String)object4);
            long l4 = file.length();
            bundle.putLong((String)object5, l4);
            ((ArrayList)object2).add(object4);
        }
        intent = com.google.android.play.core.assetpacks.model.b.a("slice_ids", (String)object);
        bundle.putStringArrayList((String)intent, object2);
        intent = com.google.android.play.core.assetpacks.model.b.a("pack_version", (String)object);
        long l7 = this.h.a();
        bundle.putLong((String)intent, l7);
        intent = com.google.android.play.core.assetpacks.model.b.a("status", (String)object);
        bundle.putInt((String)intent, n4);
        intent = com.google.android.play.core.assetpacks.model.b.a("error_code", (String)object);
        bundle.putInt((String)intent, 0);
        intent = "bytes_downloaded";
        object2 = com.google.android.play.core.assetpacks.model.b.a((String)intent, (String)object);
        long l8 = ed.k(n4, l2);
        bundle.putLong((String)object2, l8);
        object2 = "total_bytes_to_download";
        arrayList = com.google.android.play.core.assetpacks.model.b.a((String)object2, (String)object);
        bundle.putLong((String)((Object)arrayList), l2);
        object = Arrays.asList(object);
        arrayList = new ArrayList(object);
        bundle.putStringArrayList("pack_names", arrayList);
        long l12 = ed.k(n4, l2);
        bundle.putLong((String)intent, l12);
        bundle.putLong((String)object2, l2);
        intent = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE");
        intent = intent.putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        object = this.j;
        ec ec2 = new ec(this, intent);
        object.post((Runnable)ec2);
        return bundle;
    }

    private final AssetPackState q(String string2, int n3) {
        long l2;
        int n4;
        long l3;
        ed ed2 = this;
        String string3 = string2;
        File[] fileArray = this.v(string2);
        int n7 = fileArray.length;
        long l4 = l3 = 0L;
        for (n4 = 0; n4 < n7; ++n4) {
            File file = fileArray[n4];
            l2 = file.length();
            l4 += l2;
        }
        n4 = n3;
        l2 = ed.k(n3, l4);
        double d2 = ed2.f.a(string3);
        String string4 = String.valueOf(ed2.h.a());
        String string5 = ed2.i.a(string3);
        string3 = string2;
        int n8 = 1;
        String string6 = string4;
        string4 = string5;
        return AssetPackState.a(string2, n3, 0, l2, l4, d2, n8, string6, string5);
    }

    private static String r(File object) {
        NoSuchAlgorithmException noSuchAlgorithmException2;
        LocalTestingException localTestingException;
        block6: {
            localTestingException = null;
            int n3 = 1;
            Object object2 = new File[n3];
            object2[0] = object;
            object2 = Arrays.asList(object2);
            try {
                return ef.a((List)object2);
            }
            catch (IOException iOException) {
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                break block6;
            }
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = String.format("Could not digest file: %s.", objectArray);
            LocalTestingException localTestingException2 = new LocalTestingException((String)object, (Throwable)iOException);
            throw localTestingException2;
        }
        localTestingException = new LocalTestingException("SHA256 algorithm not supported.", (Throwable)noSuchAlgorithmException2);
        throw localTestingException;
    }

    private final /* synthetic */ void s(List object, bf bf2, TaskCompletionSource taskCompletionSource) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object = object.iterator();
        long l2 = 0L;
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = bf2;
            object2 = ((h)bf2).a;
            int n3 = 8;
            int n4 = ((l)object2).a(n3, string2);
            try {
                object2 = this.q(string2, n4);
                long l3 = ((AssetPackState)object2).totalBytesToDownload();
                l2 += l3;
                hashMap.put(string2, object2);
            }
            catch (LocalTestingException localTestingException) {
                taskCompletionSource.setException(localTestingException);
                return;
            }
        }
        object = new bt(l2, hashMap);
        taskCompletionSource.setResult(object);
    }

    private final /* synthetic */ void t(int n3, String object) {
        int n4 = 4;
        try {
            this.p(n3, (String)object, n4);
            return;
        }
        catch (LocalTestingException localTestingException) {
            object = b;
            Object[] objectArray = new Object[]{localTestingException};
            ((o)object).e("notifyModuleCompleted failed", objectArray);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final /* synthetic */ void u(List object, TaskCompletionSource taskCompletionSource) {
        Object object2;
        int n3;
        int n4;
        HashMap<Object, AssetPackState> hashMap = new HashMap<Object, AssetPackState>();
        Object object3 = object.iterator();
        long l2 = 0L;
        while (true) {
            n4 = object3.hasNext();
            n3 = 1;
            if (n4 == 0) break;
            object2 = (String)object3.next();
            try {
                AssetPackState assetPackState = this.q((String)object2, n3);
                long l3 = assetPackState.totalBytesToDownload();
                l2 += l3;
                hashMap.put(object2, assetPackState);
            }
            catch (LocalTestingException localTestingException) {
                taskCompletionSource.setException(localTestingException);
                return;
            }
        }
        object = object.iterator();
        while (true) {
            boolean bl2;
            if (!(bl2 = object.hasNext())) {
                object = new bt(l2, hashMap);
                taskCompletionSource.setResult(object);
                return;
            }
            object3 = (String)object.next();
            try {
                object2 = c;
                n4 = ((AtomicInteger)object2).getAndIncrement();
                this.p(n4, (String)object3, n3);
                int n7 = 2;
                this.p(n4, (String)object3, n7);
                n7 = 3;
                this.p(n4, (String)object3, n7);
            }
            catch (LocalTestingException localTestingException) {
                taskCompletionSource.setException(localTestingException);
                return;
            }
        }
    }

    private final File[] v(String object) {
        int n3 = 1;
        Object object2 = this.d;
        File[] fileArray = new File((String)object2);
        boolean bl2 = fileArray.isDirectory();
        if (bl2) {
            object2 = new dy((String)object);
            fileArray = fileArray.listFiles((FilenameFilter)object2);
            object2 = "'.";
            if (fileArray != null) {
                int n4 = fileArray.length;
                if (n4 != 0) {
                    for (int i3 = 0; i3 < n4; i3 += n3) {
                        String string2 = ak.a(fileArray[i3]);
                        boolean bl3 = string2.equals(object);
                        if (!bl3) continue;
                        return fileArray;
                    }
                    object = cP.a("No main slice available for pack '", (String)object, (String)object2);
                    LocalTestingException localTestingException = new LocalTestingException((String)object);
                    throw localTestingException;
                }
                object = cP.a("No APKs available for pack '", (String)object, (String)object2);
                LocalTestingException localTestingException = new LocalTestingException((String)object);
                throw localTestingException;
            }
            object = cP.a("Failed fetching APKs for pack '", (String)object, (String)object2);
            LocalTestingException localTestingException = new LocalTestingException((String)object);
            throw localTestingException;
        }
        Object object3 = new Object[n3];
        object3[0] = fileArray;
        object3 = String.format("Local testing directory '%s' not found.", object3);
        object = new LocalTestingException((String)object3);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Task a(int n3, String parcelFileDescriptor, String object, int n4) {
        int n7;
        Object object2;
        int n8;
        Object object3;
        Object object4;
        block6: {
            FileNotFoundException fileNotFoundException2;
            Object object5;
            String string2;
            block7: {
                string2 = "getChunkFileDescriptor failed";
                object4 = b;
                object5 = Integer.valueOf(n3);
                object3 = n4;
                n8 = 4;
                object2 = new Object[n8];
                object2[0] = object5;
                n3 = 1;
                object2[n3] = parcelFileDescriptor;
                object2[2] = object;
                int n10 = 3;
                object2[n10] = object3;
                ((o)object4).d("getChunkFileDescriptor(session=%d, %s, %s, %d)", object2);
                object3 = new TaskCompletionSource();
                try {
                    parcelFileDescriptor = this.v((String)parcelFileDescriptor);
                    n7 = ((File[])parcelFileDescriptor).length;
                    n8 = 0;
                    object2 = null;
                    break block6;
                }
                catch (LocalTestingException localTestingException) {
                }
                catch (FileNotFoundException fileNotFoundException2) {
                    break block7;
                }
                object = b;
                object5 = new Object[n3];
                object5[0] = localTestingException;
                ((o)object).e(string2, object5);
                ((TaskCompletionSource)object3).setException(localTestingException);
                return ((TaskCompletionSource)object3).getTask();
            }
            object = b;
            object5 = new Object[n3];
            object5[0] = fileNotFoundException2;
            ((o)object).e(string2, object5);
            object = "Asset Slice file not found.";
            object5 = new LocalTestingException((String)object, (Throwable)fileNotFoundException2);
            ((TaskCompletionSource)object3).setException((Exception)object5);
            return ((TaskCompletionSource)object3).getTask();
        }
        while (true) {
            if (n8 >= n7) {
                object4 = new StringBuilder();
                object2 = "Local testing slice for '";
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append((String)object);
                object = "' not found.";
                ((StringBuilder)object4).append((String)object);
                object = ((StringBuilder)object4).toString();
                parcelFileDescriptor = new LocalTestingException((String)object);
                throw parcelFileDescriptor;
            }
            File file = parcelFileDescriptor[n8];
            String string3 = ak.a(file);
            boolean bl2 = string3.equals(object);
            if (bl2) {
                int n14 = 0x10000000;
                parcelFileDescriptor = ParcelFileDescriptor.open((File)file, (int)n14);
                ((TaskCompletionSource)object3).setResult(parcelFileDescriptor);
                return ((TaskCompletionSource)object3).getTask();
            }
            n8 += n3;
        }
    }

    public final Task b(List list, bf bf2, Map object) {
        object = b;
        Object object2 = new Object[]{list};
        ((o)object).d("getPackStates(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = (Executor)this.k.a();
        eb eb2 = new eb(this, list, bf2, (TaskCompletionSource)object);
        object2.execute(eb2);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task c(List list, Map object) {
        object = b;
        Object object2 = new Object[]{list};
        ((o)object).d("startDownload(%s)", (Object[])object2);
        object = new TaskCompletionSource();
        object2 = (Executor)this.k.a();
        ea ea3 = new ea(this, list, (TaskCompletionSource)object);
        object2.execute(ea3);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task d(Map arrayList) {
        arrayList = b;
        Object[] objectArray = new Object[]{};
        ((o)((Object)arrayList)).d("syncPacks()", objectArray);
        arrayList = new ArrayList();
        return Tasks.forResult(arrayList);
    }

    public final void e(List list) {
        o o3 = b;
        Object[] objectArray = new Object[]{list};
        o3.d("cancelDownload(%s)", objectArray);
    }

    public final void f() {
        o o3 = b;
        Object[] objectArray = new Object[]{};
        o3.d("keepAlive", objectArray);
    }

    public final void g(int n3, String objectArray, String string2, int n4) {
        o o3 = b;
        objectArray = new Object[]{};
        o3.d("notifyChunkTransferred", objectArray);
    }

    public final void h(int n3, String string2) {
        Object object = b;
        Object object2 = new Object[]{};
        ((o)object).d("notifyModuleCompleted", object2);
        object = (Executor)this.k.a();
        object2 = new dz(this, n3, string2);
        object.execute((Runnable)object2);
    }

    public final void i(int n3) {
        o o3 = b;
        Object[] objectArray = new Object[]{};
        o3.d("notifySessionFailed", objectArray);
    }

    public final void j(String string2) {
        o o3 = b;
        Object[] objectArray = new Object[]{string2};
        o3.d("removePack(%s)", objectArray);
    }
}

