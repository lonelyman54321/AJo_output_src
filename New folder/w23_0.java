/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.NewPDPRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.helper.SecurityHelper;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from W23
 */
public final class w23_0
extends Hj {
    public final p23_0 a;
    public final CartApiRepo b;
    public final WishListRepo c;
    public final bD2 d;
    public final t30_0 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;
    public final zr1_1 m;
    public final zr1_1 n;
    public ProductOptionItem o;
    public ArrayList p;
    public final zr1_1 q;
    public int r;
    public int s;
    public int t;

    public w23_0(Application application, BaseRepo baseRepo) {
        int n3;
        Object object = application;
        Object object2 = baseRepo;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(baseRepo, "repo");
        super(application);
        object2 = (p23_0)baseRepo;
        this.a = object2;
        super((Context)application);
        this.b = object2;
        super((Context)application);
        this.c = object2;
        new NewPDPRepo((Context)application);
        this.d = object2 = new bD2((Context)application);
        super();
        this.e = object;
        super();
        this.f = object;
        super();
        this.g = object;
        super();
        this.h = object;
        super();
        this.i = object;
        super();
        this.j = object;
        super();
        this.k = object;
        this.l = object;
        super();
        this.m = object;
        this.n = object;
        object2 = object;
        super(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, 0, false, 0x1FFFFFF, null);
        this.o = object;
        super();
        this.q = object;
        this.r = n3 = -1;
        this.s = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(SharedWithMe sharedWithMe) {
        Object object;
        Object object2;
        boolean bl2;
        int n3;
        Object object3;
        Object object4;
        block14: {
            boolean bl3;
            block16: {
                block17: {
                    Object[] objectArray;
                    CharSequence charSequence;
                    long l2;
                    block15: {
                        long l3;
                        long l4;
                        long l7;
                        long l8;
                        int n4;
                        block13: {
                            Object object5;
                            UnsupportedEncodingException unsupportedEncodingException2;
                            block12: {
                                block11: {
                                    block10: {
                                        n4 = 0;
                                        object4 = null;
                                        try {
                                            object3 = sharedWithMe.getShareProductExperience();
                                            if (object3 == null) break block10;
                                            object3 = ((ShareProductExperience)object3).getSender();
                                            break block11;
                                        }
                                        catch (UnsupportedEncodingException unsupportedEncodingException2) {
                                            break block12;
                                        }
                                    }
                                    n3 = 0;
                                    object3 = null;
                                }
                                object3 = SecurityHelper.decode((String)object3);
                                object5 = sharedWithMe.getShareProductExperience();
                                if (object5 != null) {
                                    object3 = SecurityHelper.decrypt((String)object3);
                                    ((ShareProductExperience)object5).setDSender((String)object3);
                                }
                                if ((object3 = sharedWithMe.getShareProductExperience()) != null) {
                                    object3 = ((ShareProductExperience)object3).getSenderId();
                                } else {
                                    n3 = 0;
                                    object3 = null;
                                }
                                object3 = SecurityHelper.decode((String)object3);
                                object5 = sharedWithMe.getShareProductExperience();
                                if (object5 != null) {
                                    object3 = SecurityHelper.decrypt((String)object3);
                                    ((ShareProductExperience)object5).setDSenderId((String)object3);
                                }
                                break block13;
                            }
                            object5 = yn3_0.a;
                            ((yn3$a)object5).e(unsupportedEncodingException2);
                        }
                        object3 = sharedWithMe.getShareProductExperience();
                        bl2 = true;
                        if (object3 == null) break block14;
                        object2 = sharedWithMe.getShareProductExperience();
                        if (object2 != null) {
                            long l12 = ((ShareProductExperience)object2).getReceivedMillis();
                            object4 = l12;
                        }
                        object2 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
                        l2 = ((Calendar)object2).getTimeInMillis();
                        charSequence = ". ReceivedMillis: ";
                        objectArray = "Current Millis: ";
                        bl3 = false;
                        if (object4 == null || (l8 = (l7 = (l4 = ((Long)object4).longValue()) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) <= 0) break block15;
                        l4 = (Long)object4;
                        ((Calendar)object2).setTimeInMillis(l4);
                        int n7 = 5;
                        int n8 = 30;
                        ((Calendar)object2).add(n7, n8);
                        l4 = ((Calendar)object2).getTimeInMillis();
                        object2 = yn3_0.a;
                        StringBuilder stringBuilder = new StringBuilder((String)objectArray);
                        stringBuilder.append(l2);
                        stringBuilder.append((String)charSequence);
                        stringBuilder.append(object4);
                        charSequence = stringBuilder.toString();
                        objectArray = new Object[]{};
                        ((yn3$a)object2).a((String)charSequence, objectArray);
                        charSequence = new StringBuilder("Expire Millis: ");
                        ((StringBuilder)charSequence).append(l4);
                        charSequence = ((StringBuilder)charSequence).toString();
                        objectArray = new Object[]{};
                        ((yn3$a)object2).a((String)charSequence, objectArray);
                        long l14 = (Long)object4;
                        n4 = l2 == l14 ? 0 : (l2 < l14 ? -1 : 1);
                        if (n4 >= 0 && (n4 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1))) <= 0) break block16;
                        break block17;
                    }
                    object2 = yn3_0.a;
                    StringBuilder stringBuilder = new StringBuilder((String)objectArray);
                    stringBuilder.append(l2);
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append(object4);
                    object4 = stringBuilder.toString();
                    object = new Object[]{};
                    ((yn3$a)object2).a((String)object4, object);
                }
                bl3 = true;
            }
            ((ShareProductExperience)object3).setLinkExpired(bl3);
        }
        if ((object4 = sharedWithMe.getShareProductExperience()) != null) {
            object3 = sharedWithMe.getProductsShared();
            n3 = object3.size();
            ((ShareProductExperience)object4).setActualSharedCount(n3);
        }
        object4 = sharedWithMe.getProductsShared();
        object3 = new ArrayList();
        object4 = object4.iterator();
        while (true) {
            boolean bl4;
            if (!(bl4 = object4.hasNext())) {
                sharedWithMe.setProductsShared((List)object3);
                return;
            }
            object2 = object4.next();
            object = object2;
            object = (ListShareProductExperience)object2;
            boolean bl5 = object.isDeleted() ^ bl2;
            if (!bl5) continue;
            ((ArrayList)object3).add(object2);
        }
    }

    public final void b(List list) {
        if (list != null) {
            Object object = list;
            object = list;
            boolean bl2 = object.isEmpty() ^ true;
            if (bl2) {
                object = md3_0.c(this);
                W23$a w23$a = new W23$a(this, list, null);
                int n3 = 3;
                Ae3.d((i90_0)object, null, null, w23$a, n3);
            }
        }
    }

    public final void c(long l2) {
        aW aW2 = md3_0.c(this);
        W23$b w23$b = new W23$b(this, l2, null);
        Ae3.d(aW2, null, null, w23$b, 3);
    }

    public final void onCleared() {
        super.onCleared();
        t30_0 t30_02 = this.e;
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = this.e;
            t30_02.dispose();
        }
    }
}

