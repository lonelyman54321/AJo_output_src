/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.bl;
import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dg;
import com.google.android.play.core.assetpacks.dh;
import com.google.android.play.core.assetpacks.di;
import com.google.android.play.core.assetpacks.dj;
import com.google.android.play.core.assetpacks.dk;
import com.google.android.play.core.assetpacks.dl;
import com.google.android.play.core.assetpacks.dm;
import com.google.android.play.core.assetpacks.dn;
import com.google.android.play.core.assetpacks.do;
import com.google.android.play.core.assetpacks.dp;
import com.google.android.play.core.assetpacks.dq;
import com.google.android.play.core.assetpacks.dr;
import com.google.android.play.core.assetpacks.ds;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.model.b;
import com.google.android.play.core.assetpacks.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

final class dt {
    private static final o a;
    private final bm b;
    private final dd c;
    private final Map d;
    private final ReentrantLock e;
    private final aq f;
    private final aq g;

    static {
        o o3;
        a = o3 = new o("ExtractorSessionStoreView");
    }

    public dt(bm serializable, aq aq2, dd dd2, aq aq4) {
        this.b = serializable;
        this.f = aq2;
        this.c = dd2;
        this.g = aq4;
        this.d = serializable = new Serializable();
        this.e = serializable;
    }

    public static /* synthetic */ Boolean a(dt dt2, Bundle bundle) {
        Object object = dt2;
        Object object2 = bundle;
        int n3 = 0;
        Object object3 = null;
        int n4 = 1;
        Object object4 = "session_id";
        int n7 = bundle.getInt((String)object4);
        if (n7 == 0) {
            object = Boolean.FALSE;
        } else {
            Object object5 = dt2.d;
            Object object6 = n7;
            boolean bl2 = object5.containsKey(object6);
            Object object7 = "chunk_intents";
            Object object8 = "status";
            if (bl2) {
                object5 = dt2.q(n7);
                Object object9 = ((dq)object5).c.a;
                object8 = com.google.android.play.core.assetpacks.model.b.a((String)object8, (String)object9);
                int n8 = bundle.getInt((String)object8);
                object9 = ((dq)object5).c;
                int n10 = ((dp)object9).d;
                boolean bl3 = bl.c(n10, n8);
                if (bl3) {
                    object2 = a;
                    object7 = n10;
                    n8 = 2;
                    object8 = new Object[n8];
                    object8[0] = object6;
                    object8[n4] = object7;
                    object3 = "Found stale update for session %s with status %d.";
                    ((o)object2).a((String)object3, object8);
                    object2 = ((dq)object5).c;
                    n3 = ((dp)object2).d;
                    object2 = ((dp)object2).a;
                    n4 = 4;
                    if (n3 == n4) {
                        object = (z)dt2.f.a();
                        object.h(n7, (String)object2);
                    } else {
                        n4 = 5;
                        if (n3 == n4) {
                            object = (z)dt2.f.a();
                            object.i(n7);
                        } else {
                            n4 = 6;
                            if (n3 == n4) {
                                object = (z)dt2.f.a();
                                object2 = Arrays.asList(object2);
                                object.e((List)object2);
                            }
                        }
                    }
                } else {
                    ((dp)object9).d = n8;
                    boolean bl4 = bl.d(n8);
                    if (bl4) {
                        dt2.n(n7);
                        object = dt2.c;
                        object2 = ((dq)object5).c.a;
                        ((dd)object).c((String)object2);
                    } else {
                        object = ((dp)object9).f.iterator();
                        while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            int n14;
                            object4 = (dr)object.next();
                            object6 = ((dq)object5).c;
                            object8 = ((dr)object4).a;
                            object6 = ((dp)object6).a;
                            object6 = com.google.android.play.core.assetpacks.model.b.b((String)object7, (String)object6, (String)object8);
                            if ((object6 = object2.getParcelableArrayList((String)object6)) == null) continue;
                            object8 = null;
                            for (n8 = 0; n8 < (n14 = object6.size()); n8 += n4) {
                                object9 = object6.get(n8);
                                if (object9 == null || (object9 = ((Intent)object6.get(n8)).getData()) == null) continue;
                                object9 = (do)((dr)object4).d.get(n8);
                                ((do)object9).a = n4;
                            }
                        }
                    }
                }
            } else {
                ArrayList<Object> arrayList;
                Iterator iterator;
                boolean bl5;
                String string2 = dt.s(bundle);
                object5 = com.google.android.play.core.assetpacks.model.b.a("pack_version", string2);
                long l2 = bundle.getLong((String)object5);
                object5 = com.google.android.play.core.assetpacks.model.b.a("pack_version_tag", string2);
                String string3 = bundle.getString((String)object5, "");
                object5 = com.google.android.play.core.assetpacks.model.b.a((String)object8, string2);
                int n15 = bundle.getInt((String)object5);
                object5 = com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", string2);
                long l3 = bundle.getLong((String)object5);
                object5 = com.google.android.play.core.assetpacks.model.b.a("slice_ids", string2);
                object5 = bundle.getStringArrayList((String)object5);
                object6 = new ArrayList();
                object5 = dt.t((List)object5).iterator();
                while (bl5 = object5.hasNext()) {
                    int n16;
                    Object object10;
                    Object object11;
                    boolean bl6;
                    object8 = (String)object5.next();
                    iterator = com.google.android.play.core.assetpacks.model.b.b((String)object7, string2, (String)object8);
                    iterator = object2.getParcelableArrayList((String)((Object)iterator));
                    arrayList = new ArrayList<Object>();
                    iterator = dt.t((List)((Object)iterator)).iterator();
                    while (bl6 = iterator.hasNext()) {
                        object11 = (Intent)iterator.next();
                        if (object11 != null) {
                            object10 = object5;
                            n3 = 1;
                        } else {
                            object10 = object5;
                        }
                        object5 = new do(n3 != 0);
                        arrayList.add(object5);
                        object5 = object10;
                        n3 = 0;
                        object3 = null;
                    }
                    object10 = object5;
                    object3 = com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", string2, (String)object8);
                    String string4 = object2.getString((String)object3);
                    object3 = com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", string2, (String)object8);
                    long l4 = object2.getLong((String)object3);
                    object3 = com.google.android.play.core.assetpacks.model.b.b("patch_format", string2, (String)object8);
                    bl2 = false;
                    object5 = null;
                    int n17 = object2.getInt((String)object3, 0);
                    if (n17 != 0) {
                        n16 = 0;
                        object11 = object3;
                        object3 = new dr((String)object8, string4, l4, arrayList, 0, n17);
                        bl2 = false;
                        object5 = null;
                    } else {
                        object3 = com.google.android.play.core.assetpacks.model.b.b("compression_format", string2, (String)object8);
                        bl2 = false;
                        object5 = null;
                        n16 = object2.getInt((String)object3, 0);
                        n17 = 0;
                        object11 = object3;
                        object3 = new dr((String)object8, string4, l4, arrayList, n16, 0);
                    }
                    ((ArrayList)object6).add(object3);
                    object5 = object10;
                    n3 = 0;
                    object3 = null;
                    n4 = 1;
                }
                iterator = object3;
                object3 = new dp(string2, l2, n15, l3, (List)object6, string3);
                object5 = "app_version_code";
                int n18 = object2.getInt((String)object5);
                arrayList = new ArrayList<Object>(n7, n18, object3);
                object = ((dt)object).d;
                object2 = n7;
                object.put(object2, arrayList);
            }
            object = Boolean.TRUE;
        }
        return object;
    }

    public static /* synthetic */ Boolean b(dt object, Bundle bundle) {
        Object object2 = "session_id";
        int n3 = bundle.getInt((String)object2);
        if (n3 == 0) {
            object = Boolean.TRUE;
        } else {
            Object object3 = ((dt)object).d;
            object2 = n3;
            int n4 = object3.containsKey(object2);
            if (n4 == 0) {
                object = Boolean.TRUE;
            } else {
                object = (dq)((dt)object).d.get(object2);
                object2 = ((dq)object).c;
                n3 = ((dp)object2).d;
                n4 = 6;
                if (n3 == n4) {
                    object = Boolean.FALSE;
                } else {
                    object2 = dt.s(bundle);
                    object3 = "status";
                    object2 = com.google.android.play.core.assetpacks.model.b.a((String)object3, (String)object2);
                    int n7 = bundle.getInt((String)object2);
                    boolean bl2 = bl.c(((dq)object).c.d, n7) ^ true;
                    object = bl2;
                }
            }
        }
        return object;
    }

    public static /* synthetic */ Object c(dt dt2, String string2, int n3, long l2) {
        block3: {
            Object object;
            block2: {
                Object object2 = Arrays.asList(string2);
                if ((object2 = (dq)dt2.u((List)object2).get(string2)) == null) break block2;
                object = ((dq)object2).c;
                boolean bl2 = bl.d(((dp)object).d);
                if (!bl2) break block3;
            }
            object = a;
            String string3 = cP.a("Could not find pack ", string2, " while trying to complete it");
            Object[] objectArray = new Object[]{};
            ((o)object).b(string3, objectArray);
        }
        dt2.b.E(string2, n3, l2);
        ((dq)object2).c.d = 4;
        return null;
    }

    public static /* synthetic */ Object d(dt object, int n3) {
        Object object2 = ((dt)object).q(n3);
        Object object3 = ((dq)object2).c;
        int n4 = bl.d(object3.d);
        if (n4 != 0) {
            Object object4 = ((dt)object).b;
            String string2 = object3.a;
            int n7 = ((dq)object2).b;
            long l2 = object3.b;
            ((bm)object4).E(string2, n7, l2);
            object4 = ((dq)object2).c;
            int n8 = ((dp)object4).d;
            n4 = 5;
            if (n8 == n4 || n8 == (n4 = 6)) {
                object = ((dt)object).b;
                object3 = ((dp)object4).a;
                int n10 = ((dq)object2).b;
                long l3 = ((dp)object4).b;
                ((bm)object).F((String)object3, n10, l3);
            }
            return null;
        }
        object2 = n3;
        object3 = new Object[]{object2};
        object2 = String.format("Could not safely delete session %d because it is not in a terminal state.", object3);
        object = new cz((String)object2, n3);
        throw object;
    }

    public static /* synthetic */ Object e(dt dt2, int n3, int n4) {
        dt2.q((int)n3).c.d = 5;
        return null;
    }

    public static /* synthetic */ Map f(dt object, List list) {
        boolean bl2;
        HashMap<String, dq> hashMap = new HashMap<String, dq>();
        object = ((dt)object).d.values().iterator();
        while (bl2 = object.hasNext()) {
            int n3;
            dq dq2;
            dq dq4 = (dq)object.next();
            String string2 = dq4.c.a;
            int n4 = list.contains(string2);
            if (n4 == 0 || (n4 = (dq2 = (dq)hashMap.get(string2)) == null ? -1 : dq2.a) >= (n3 = dq4.a)) continue;
            hashMap.put(string2, dq4);
        }
        return hashMap;
    }

    public static /* synthetic */ Map g(dt dt2, List object) {
        boolean bl2;
        Map map2 = dt2.u((List)object);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            int n3;
            String string2 = (String)object.next();
            Object object2 = (dq)map2.get(string2);
            if (object2 == null) {
                n3 = 8;
                object2 = n3;
                hashMap.put(string2, object2);
                continue;
            }
            Object object3 = ((dq)object2).c;
            int n4 = bl.a(((dp)object3).d);
            if (n4 != 0) {
                n4 = 6;
                ((dp)object3).d = n4;
                object3 = dt2.g;
                object3 = ((aq)object3).a();
                object3 = (Executor)object3;
                Object object4 = new dm(dt2, (dq)object2);
                object3.execute((Runnable)object4);
                object3 = dt2.c;
                try {
                    ((dd)object3).c(string2);
                }
                catch (cz cz2) {
                    int n7 = ((dq)object2).a;
                    object4 = a;
                    object3 = n7;
                    int n8 = 2;
                    Object[] objectArray = new Object[n8];
                    objectArray[0] = object3;
                    n7 = 1;
                    objectArray[n7] = string2;
                    object3 = "Session %d with pack %s does not exist, no need to cancel.";
                    ((o)object4).d((String)object3, objectArray);
                }
            }
            n3 = ((dq)object2).c.d;
            object2 = n3;
            hashMap.put(string2, object2);
        }
        return hashMap;
    }

    private final dq q(int n3) {
        Object object = this.d;
        Object object2 = n3;
        if ((object = (dq)object.get(object2)) != null) {
            return object;
        }
        Object[] objectArray = new Object[]{object2};
        object2 = String.format("Could not find session %d while trying to get it", objectArray);
        object = new cz((String)object2, n3);
        throw object;
    }

    private final Object r(ds object) {
        try {
            ReentrantLock reentrantLock = this.e;
            reentrantLock.lock();
            object = object.a();
            return object;
        }
        finally {
            this.e.unlock();
        }
    }

    private static String s(Bundle object) {
        boolean bl2;
        String string2 = "pack_names";
        if ((object = object.getStringArrayList(string2)) != null && !(bl2 = object.isEmpty())) {
            return (String)object.get(0);
        }
        object = new cz("Session without pack received.");
        throw object;
    }

    private static List t(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return list;
    }

    private final Map u(List list) {
        dk dk2 = new dk(this, list);
        return (Map)this.r(dk2);
    }

    public final Map h(List list) {
        dj dj2 = new dj(this, list);
        return (Map)this.r(dj2);
    }

    public final Map i() {
        return this.d;
    }

    public final void j() {
        this.e.lock();
    }

    public final void k(String string2, int n3, long l2) {
        dh dh2 = new dh(this, string2, n3, l2);
        this.r(dh2);
    }

    public final void l() {
        this.e.unlock();
    }

    public final void m(int n3, int n4) {
        di di2 = new di(this, n3, 5);
        this.r(di2);
    }

    public final void n(int n3) {
        dg dg2 = new dg(this, n3);
        this.r(dg2);
    }

    public final boolean o(Bundle bundle) {
        dn dn3 = new dn(this, bundle);
        return (Boolean)this.r(dn3);
    }

    public final boolean p(Bundle bundle) {
        dl dl3 = new dl(this, bundle);
        return (Boolean)this.r(dl3);
    }
}

