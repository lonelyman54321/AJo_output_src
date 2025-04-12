/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.sis.SisStoreList;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.sis.StoreMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Zf2
 */
public final class zf2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ zf2_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object iterator) {
        Object object = "this$0";
        Object[] objectArray = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                iterator = (DataCallback)((Object)iterator);
                objectArray = (ed3_2)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object);
                objectArray.getClass();
                if (iterator == null || (n4 = nn_2.b((cp$a)(object = cp_1.Companion), (DataCallback)((Object)iterator))) == 0) return Unit.a;
                n4 = ((DataCallback)((Object)iterator)).getStatus();
                n3 = 0;
                Object object2 = null;
                int n7 = 1;
                if (n4 == 0) {
                    StoreInfo storeInfo;
                    boolean bl2;
                    float f5;
                    object = (StoreMetaData)((DataCallback)((Object)iterator)).getData();
                    boolean bl3 = false;
                    if (object != null) {
                        object = ((StoreMetaData)object).getSisStoreList();
                    } else {
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    if (object == null) return Unit.a;
                    object = (StoreMetaData)((DataCallback)((Object)iterator)).getData();
                    if (object != null) {
                        object = ((StoreMetaData)object).getSisStoreList();
                    } else {
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    Intrinsics.checkNotNull(object);
                    n4 = object.isEmpty() ^ n7;
                    if (n4 == 0) return Unit.a;
                    object = (StoreMetaData)((DataCallback)((Object)iterator)).getData();
                    if (object != null) {
                        object = ((StoreMetaData)object).getSisStoreList();
                    } else {
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    Intrinsics.checkNotNull(object);
                    object = (SisStoreList)((ArrayList)object).get(0);
                    if (object != null) {
                        object = ((SisStoreList)object).getStoreMetalistdto();
                    } else {
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    if (object == null) return Unit.a;
                    object = (StoreMetaData)((DataCallback)((Object)iterator)).getData();
                    if (object != null) {
                        object = ((StoreMetaData)object).getSisStoreList();
                    } else {
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    Intrinsics.checkNotNull(object);
                    object = (SisStoreList)((ArrayList)object).get(0);
                    if (object == null || (object = ((SisStoreList)object).getStoreMetalistdto()) == null || (n4 = object.isEmpty() ^ n7) != n7) return Unit.a;
                    object = g62_0.c;
                    Object object3 = objectArray.j;
                    String string2 = "mStoreLPViewModel";
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object3 = null;
                    }
                    object3 = ((uc3_2)object3).c;
                    Iterator iterator2 = ((DataCallback)((Object)iterator)).getData();
                    Intrinsics.checkNotNull(iterator2);
                    iterator2 = (StoreMetaData)((Object)iterator2);
                    ((g62_0)object).a((String)object3, (StoreMetaData)((Object)iterator2));
                    object = objectArray.j;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    if ((object3 = objectArray.j) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object3 = null;
                    }
                    iterator2 = ((DataCallback)((Object)iterator)).getData();
                    Intrinsics.checkNotNull(iterator2);
                    iterator2 = ((SisStoreList)((StoreMetaData)((Object)iterator2)).getSisStoreList().get(0)).getStoreMetalistdto();
                    object3.getClass();
                    String string3 = "iterator(...)";
                    if (iterator2 != null) {
                        iterator2 = ((ArrayList)((Object)iterator2)).iterator();
                        Intrinsics.checkNotNullExpressionValue(iterator2, string3);
                        while (bl2 = iterator2.hasNext()) {
                            String string4;
                            int n8;
                            String string5;
                            storeInfo = (StoreInfo)iterator2.next();
                            if (storeInfo != null) {
                                string5 = storeInfo.storeId;
                            } else {
                                n8 = 0;
                                string5 = null;
                            }
                            if (string5 == null || (n8 = string5.length()) == 0 || (string5 = ((uc3_2)object3).c) == null || (n8 = string5.length()) == 0) continue;
                            if (storeInfo != null) {
                                string5 = storeInfo.storeId;
                            } else {
                                n8 = 0;
                                string5 = null;
                            }
                            if ((n8 = (int)(kotlin.text.b.i(string5, string4 = ((uc3_2)object3).c, n7 != 0) ? 1 : 0)) == 0) continue;
                            break;
                        }
                    } else {
                        bl2 = false;
                        storeInfo = null;
                    }
                    ((uc3_2)object).d = storeInfo;
                    iterator = ((DataCallback)((Object)iterator)).getData();
                    Intrinsics.checkNotNull(iterator);
                    iterator = ((SisStoreList)((StoreMetaData)((Object)iterator)).getSisStoreList().get(0)).getStoreMetalistdto();
                    object = "getStoreMetalistdto(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object);
                    objectArray.Ra();
                    iterator = ((ArrayList)((Object)iterator)).iterator();
                    Intrinsics.checkNotNullExpressionValue(iterator, string3);
                    while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object = iterator.next();
                        Intrinsics.checkNotNullExpressionValue(object, "next(...)");
                        object = (StoreInfo)object;
                        object2 = objectArray.j;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object2 = null;
                        }
                        if ((n4 = (int)(kotlin.text.b.i((String)(object2 = ((uc3_2)object2).c), (String)(object = ((StoreInfo)object).storeId), n7 != 0) ? 1 : 0)) == 0) continue;
                        return Unit.a;
                    }
                    return Unit.a;
                }
                int n10 = ((DataCallback)((Object)iterator)).getStatus();
                if (n10 != n7) return Unit.a;
                iterator = yn3_0.a;
                object = "Process Store Info Failure";
                objectArray = new Object[]{};
                ((yn3$a)((Object)iterator)).d((String)object, objectArray);
                return Unit.a;
            }
            case 0: 
        }
        iterator = (Float)((Object)iterator);
        objectArray = (bg2_1)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object);
        int n14 = 0;
        float f6 = 0.0f;
        object = null;
        if (iterator != null) {
            float f7 = ((Number)((Object)iterator)).floatValue();
            float f8 = f7 - 0.0f;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1));
            if (n3 == 0) {
                Object object4 = objectArray.Pa();
                object = Float.valueOf(0.0f);
                object4 = ((qz1_2)object4).Q;
                ((h83_0)object4).setValue(object);
            } else {
                objectArray.getClass();
                object = new Bundle();
                object.putFloat("RATING", f7);
                String string6 = objectArray.o;
                object.putString("BASE_PRODUCT_ID", string6);
                Object object5 = objectArray.j;
                if (object5 != null) {
                    string6 = "OrderSummaryFragment";
                    int n15 = 927;
                    object5.onFragmentInteraction(string6, n15, (Bundle)object);
                }
                object = objectArray.Pa();
                object5 = Boolean.FALSE;
                object = ((qz1_2)object).R;
                ((h83_0)object).setValue(object5);
                objectArray.Oa();
            }
            object = h40_0.a;
            n14 = h40_0.v1();
            if (n14 == 0) return Unit.a;
            n14 = 0x40800000;
            f6 = 4.0f;
            float f11 = f7 - f6;
            Object object6 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object6 < 0) return Unit.a;
            iterator = objectArray.x;
            object = new Object();
            ((lq2_1)((Object)iterator)).a((Function1)object);
            return Unit.a;
        } else {
            iterator = objectArray.Pa();
            object = Float.valueOf(0.0f);
            iterator = ((qz1_2)((Object)iterator)).Q;
            ((h83_0)((Object)iterator)).setValue(object);
        }
        return Unit.a;
    }
}

