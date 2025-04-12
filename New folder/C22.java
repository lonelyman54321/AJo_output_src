/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.sis.SisStoreList;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.sis.StoreMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class C22
implements Function1 {
    public final /* synthetic */ q22_0 a;

    public /* synthetic */ C22(q22_0 q22_02) {
        this.a = q22_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        q22_0 q22_02 = this.a;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            n3 = ((DataCallback)object).getStatus();
            int n4 = 1;
            Iterator iterator = null;
            if (n3 == 0) {
                object2 = ((DataCallback)object).getData();
                if (object2 != null) {
                    object2 = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object2);
                    object2 = ((StoreMetaData)object2).getSisStoreList();
                    if (object2 != null) {
                        object2 = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((StoreMetaData)object2).getSisStoreList();
                        n3 = ((ArrayList)object2).size();
                        if (n3 > 0) {
                            object2 = ((DataCallback)object).getData();
                            Intrinsics.checkNotNull(object2);
                            object2 = ((StoreMetaData)object2).getSisStoreList();
                            boolean bl2 = false;
                            Object object3 = null;
                            object2 = ((SisStoreList)((ArrayList)object2).get(0)).getStoreMetalistdto();
                            if (object2 != null) {
                                object2 = ((DataCallback)object).getData();
                                Intrinsics.checkNotNull(object2);
                                object2 = ((SisStoreList)((StoreMetaData)object2).getSisStoreList().get(0)).getStoreMetalistdto();
                                Object object4 = "getStoreMetalistdto(...)";
                                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                                n3 = object2.isEmpty() ^ n4;
                                if (n3 != 0) {
                                    object2 = g62_0.c;
                                    String string2 = q22_02.cb().d.Z0;
                                    object4 = (StoreMetaData)((DataCallback)object).getData();
                                    ((g62_0)object2).a(string2, (StoreMetaData)object4);
                                    object2 = q22_02.cb().d;
                                    object = (StoreMetaData)((DataCallback)object).getData();
                                    string2 = q22_02.cb().d.Z0;
                                    if (object != null && (object = ((StoreMetaData)object).getSisStoreList()) != null && (object = (SisStoreList)((ArrayList)object).get(0)) != null) {
                                        object = ((SisStoreList)object).getStoreMetalistdto().iterator();
                                        object3 = "iterator(...)";
                                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                                        while (bl2 = object.hasNext()) {
                                            object3 = (StoreInfo)object.next();
                                            object4 = ((StoreInfo)object3).storeId;
                                            boolean bl3 = Intrinsics.areEqual(object4, string2);
                                            if (!bl3 || (bl3 = Intrinsics.areEqual(string2, object4 = ld3_2.STORE_AJIOGRAM.getStoreId()))) continue;
                                            break;
                                        }
                                    } else {
                                        bl2 = false;
                                        object3 = null;
                                    }
                                    ((bv2_0)object2).a1 = object3;
                                    object = q22_02.r;
                                    if (object == null) {
                                        object = "homeListener";
                                        Intrinsics.throwUninitializedPropertyAccessException(object);
                                    } else {
                                        iterator = object;
                                    }
                                    object = q22_02.cb().d.a1;
                                    iterator.r((StoreInfo)object);
                                    q22_02.Cb();
                                }
                            }
                        }
                    }
                }
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == n4) {
                    object = q22_02.cb().d;
                    ((bv2_0)object).a1 = null;
                }
            }
        }
        return Unit.a;
    }
}

