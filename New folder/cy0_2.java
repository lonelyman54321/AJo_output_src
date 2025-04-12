/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Looper
 */
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import java.util.AbstractCollection;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from cY0
 */
public final class cy0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        block18: {
            int n3 = 0;
            Object object2 = null;
            int n4 = 1;
            Object object3 = "this$0";
            Object object4 = this.b;
            int n7 = this.a;
            switch (n7) {
                default: {
                    object = (uu_1)object;
                    Intrinsics.checkNotNullParameter(object, "$this$buildSerialDescriptor");
                    object2 = ((s62_0)object4).b;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object2, "<set-?>");
                    ((uu_1)object).b = object2;
                    return Unit.a;
                }
                case 1: {
                    object = (DataCallback)object;
                    object4 = (ex1_0)object4;
                    Intrinsics.checkNotNullParameter(object4, (String)object3);
                    object3 = cp_1.Companion;
                    boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
                    if (bl2) {
                        Object object5;
                        ((ex1_0)object4).Xa();
                        object3 = ((ex1_0)object4).X;
                        n7 = (int)(((AbstractCollection)object3).isEmpty() ? 1 : 0);
                        if (n7 == 0) {
                            ((Stack)object3).pop();
                        }
                        if ((n7 = ((DataCallback)object).getStatus()) == 0 && (object5 = ((DataCallback)object).getData()) != null) {
                            Object[] objectArray = "";
                            object5 = new StringBuilder((String)objectArray);
                            object = ((DataCallback)object).getData();
                            Intrinsics.checkNotNull(object);
                            object = (SaveForLaterResponse)object;
                            ((ex1_0)object4).ub((SaveForLaterResponse)object, (StringBuilder)object5);
                            boolean n8 = ((AbstractCollection)object3).isEmpty();
                            if (n8) {
                                object = StringCompanionObject.INSTANCE;
                                int n10 = R$string.acc_alert_message;
                                object = hv3_0.K(n10);
                                object3 = ((StringBuilder)object5).toString();
                                objectArray = new Object[n4];
                                objectArray[0] = object3;
                                object3 = "format(...)";
                                object = xh2_0.a(objectArray, n4, (String)object, (String)object3);
                                Object string3 = ((ex1_0)object4).m;
                                if (string3 == null) {
                                    string3 = "activityFragmentListener";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)string3);
                                } else {
                                    object2 = string3;
                                }
                                string3 = ((StringBuilder)object5).toString();
                                object2.t0((String)string3, (String)object);
                            }
                        }
                        ((ex1_0)object4).sb(false);
                    }
                    return Unit.a;
                }
                case 0: 
            }
            object = (Location)object;
            object4 = (ey0_1)object4;
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            if (object != null) {
                object2 = yn3_0.a;
                double d2 = object.getLatitude();
                double d5 = object.getLongitude();
                String string2 = "latitude: ";
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append(d2);
                stringBuilder.append(", longitude: ");
                stringBuilder.append(d5);
                String object7 = stringBuilder.toString();
                object3 = new Object[]{};
                ((yn3$a)object2).a(object7, (Object[])object3);
                object2 = ((ey0_1)object4).a;
                d2 = object.getLatitude();
                double d7 = object.getLongitude();
                object2.S9(d2, d7);
            } else {
                object = yn3_0.a;
                Object object5 = "Last known location not available, requesting new...";
                object3 = new Object[]{};
                ((yn3$a)object).a((String)object5, (Object[])object3);
                object4.getClass();
                object = LocationRequest.create();
                if (object != null) {
                    ((LocationRequest)object).setInterval(100000L);
                    long l2 = 10000L;
                    ((LocationRequest)object).setExpirationDuration(l2);
                    n3 = 104;
                    ((LocationRequest)object).setPriority(n3);
                    object2 = object;
                }
                ((ey0_1)object4).c = object = new dy0_2((ey0_1)object4);
                if (object2 != null) {
                    object5 = ((ey0_1)object4).b;
                    if (object5 == null) break block18;
                    object3 = Looper.getMainLooper();
                    try {
                        object5.requestLocationUpdates((LocationRequest)object2, (LocationCallback)object, (Looper)object3);
                    }
                    catch (SecurityException securityException) {
                        object2 = yn3_0.a;
                        ((yn3$a)object2).e(securityException);
                    }
                }
            }
        }
        return Unit.a;
    }
}

