/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ajiocash.ActivePoints;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from T2
 */
public final class t2_0
extends Ql2 {
    public static final T2$b Companion;
    public static final T2$a d;

    static {
        Object object = new Object();
        Companion = object;
        d = object = new k$e();
    }

    public final int getItemViewType(int n3) {
        n3 = n3 == 0 ? 2 : 1;
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = recyclerView$B;
        int n4 = 1;
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object2);
        boolean bl2 = recyclerView$B instanceof z2_0;
        if (bl2) {
            object = (z2_0)recyclerView$B;
            object2 = this;
            ActivePoints activePoints = (ActivePoints)this.h(n3);
            if (activePoints != null) {
                int n7;
                Object object3 = ((z2_0)object).b;
                Object object4 = activePoints.getTransactionDescription();
                object3.setText((CharSequence)object4);
                object3 = activePoints.getTransactionSubDescription();
                object4 = ((z2_0)object).c;
                int n8 = 8;
                if (object3 != null && (n7 = ((String)object3).length()) != 0) {
                    object3 = activePoints.getTransactionSubDescription();
                    object4.setText((CharSequence)object3);
                    object4.setVisibility(0);
                } else {
                    object4.setVisibility(n8);
                }
                object3 = activePoints.getTransactionReason();
                if (object3 != null) {
                    int n10 = ((String)object3).hashCode();
                    Object[] objectArray = "  |  %s%s";
                    Object[] objectArray2 = "+ %s";
                    Object[] objectArray3 = "- %s";
                    ImageView imageView = ((z2_0)object).a;
                    TextView textView = ((z2_0)object).e;
                    String string2 = "%s%s";
                    View view = ((z2_0)object).g;
                    Object object5 = ((z2_0)object).f;
                    object = ((z2_0)object).d;
                    String string3 = "format(...)";
                    switch (n10) {
                        default: {
                            break;
                        }
                        case 2059137331: {
                            int n14;
                            float f5;
                            object4 = "EXPIRY";
                            n7 = (int)(((String)object3).equals(object4) ? 1 : 0);
                            if (n7 == 0) break;
                            object3 = cp_1.Companion;
                            n7 = (int)(km_1.b((cp$a)object3) ? 1 : 0);
                            if (n7 == 0) {
                                view.setVisibility(0);
                            }
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = activePoints.getAmount();
                            if (object3 != null) {
                                f5 = ((Float)object3).floatValue();
                            } else {
                                f5 = 0.0f;
                                view = null;
                            }
                            object3 = qz2_0.x(Float.valueOf(f5));
                            object4 = new Object[n4];
                            object4[0] = object3;
                            zn0_1.b(object4, n4, (String)objectArray3, string3, textView);
                            object.setVisibility(0);
                            n7 = 8;
                            float f6 = 1.1E-44f;
                            object5.setVisibility(n7);
                            object5 = hv3_0.K(R$string.expired_on);
                            object3 = k7.k(activePoints.getExpiryDate());
                            n10 = 2;
                            objectArray = new Object[n10];
                            objectArray[0] = object5;
                            objectArray[n4] = object3;
                            object5 = Arrays.copyOf(objectArray, n10);
                            object5 = String.format(string2, object5);
                            Intrinsics.checkNotNullExpressionValue(object5, string3);
                            object.setText((CharSequence)object5);
                            object = new da$a();
                            ((da$a)object).k = n4;
                            ((da$a)object).b = n14 = R$drawable.component_placeholder;
                            ((da$a)object).n = object5 = activePoints.getImageUrl();
                            ((da$a)object).u = imageView;
                            ((da$a)object).a();
                            break;
                        }
                        case 79104318: {
                            int n15;
                            float f7;
                            object4 = "SPEND";
                            n7 = (int)(((String)object3).equals(object4) ? 1 : 0);
                            if (n7 == 0) break;
                            n7 = 8;
                            float f8 = 1.1E-44f;
                            view.setVisibility(n7);
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = activePoints.getAmount();
                            if (object3 != null) {
                                f7 = ((Float)object3).floatValue();
                            } else {
                                f7 = 0.0f;
                                view = null;
                            }
                            object3 = qz2_0.x(Float.valueOf(f7));
                            object4 = new Object[n4];
                            object4[0] = object3;
                            zn0_1.b(object4, n4, (String)objectArray3, string3, textView);
                            object.setVisibility(0);
                            n7 = 8;
                            f8 = 1.1E-44f;
                            object5.setVisibility(n7);
                            object5 = hv3_0.K(R$string.debited);
                            object3 = k7.k(activePoints.getTransactionDate());
                            n10 = 2;
                            objectArray = new Object[n10];
                            objectArray[0] = object5;
                            objectArray[n4] = object3;
                            object5 = Arrays.copyOf(objectArray, n10);
                            object5 = String.format(string2, object5);
                            Intrinsics.checkNotNullExpressionValue(object5, string3);
                            object.setText((CharSequence)object5);
                            object = new da$a();
                            ((da$a)object).k = n4;
                            ((da$a)object).b = n15 = R$drawable.component_placeholder;
                            ((da$a)object).n = object5 = activePoints.getImageUrl();
                            ((da$a)object).u = imageView;
                            ((da$a)object).a();
                            break;
                        }
                        case -1768657642: {
                            int n16;
                            float f11;
                            object4 = "ACTIVATION";
                            n7 = (int)(((String)object3).equals(object4) ? 1 : 0);
                            if (n7 == 0) break;
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = activePoints.getAmount();
                            if (object3 != null) {
                                f11 = ((Float)object3).floatValue();
                            } else {
                                n7 = 0;
                                f11 = 0.0f;
                                object3 = null;
                            }
                            object3 = qz2_0.x(Float.valueOf(f11));
                            object4 = new Object[n4];
                            object4[0] = object3;
                            zn0_1.b(object4, n4, (String)objectArray2, string3, textView);
                            object3 = activePoints.isExpired();
                            object4 = Boolean.TRUE;
                            n7 = (int)(Intrinsics.areEqual(object3, object4) ? 1 : 0);
                            if (n7 != 0) {
                                object3 = cp_1.Companion;
                                n7 = (int)(km_1.b((cp$a)object3) ? 1 : 0);
                                if (n7 == 0) {
                                    view.setVisibility(0);
                                }
                                object.setVisibility(0);
                                n7 = 8;
                                f11 = 1.1E-44f;
                                object5.setVisibility(n7);
                                n16 = R$string.expired_on;
                                object5 = hv3_0.K(n16);
                                object3 = k7.k(activePoints.getExpiryDate());
                                n10 = 2;
                                objectArray = new Object[n10];
                                objectArray[0] = object5;
                                objectArray[n4] = object3;
                                zn0_1.b(objectArray, n10, string2, string3, (TextView)object);
                            } else {
                                f11 = 1.1E-44f;
                                n10 = 2;
                                view.setVisibility(8);
                                object.setVisibility(0);
                                object5.setVisibility(0);
                                n7 = R$string.activated;
                                object3 = hv3_0.K(n7);
                                objectArray2 = k7.k(activePoints.getActivationDate());
                                objectArray3 = new Object[n10];
                                objectArray3[0] = object3;
                                objectArray3[n4] = objectArray2;
                                zn0_1.b(objectArray3, n10, string2, string3, (TextView)object);
                                int n17 = R$string.expires;
                                object = hv3_0.K(n17);
                                object3 = k7.k(activePoints.getExpiryDate());
                                objectArray2 = new Object[n10];
                                objectArray2[0] = object;
                                objectArray2[n4] = object3;
                                zn0_1.b(objectArray2, n10, (String)objectArray, string3, (TextView)object5);
                            }
                            object = new da$a();
                            ((da$a)object).k = n4;
                            ((da$a)object).b = n16 = R$drawable.component_placeholder;
                            ((da$a)object).n = object5 = activePoints.getImageUrl();
                            ((da$a)object).u = imageView;
                            ((da$a)object).a();
                            break;
                        }
                        case -1881484424: {
                            int n18;
                            float f12;
                            object4 = "REFUND";
                            n7 = (int)(((String)object3).equals(object4) ? 1 : 0);
                            if (n7 == 0) break;
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = activePoints.getAmount();
                            if (object3 != null) {
                                f12 = ((Float)object3).floatValue();
                            } else {
                                n7 = 0;
                                f12 = 0.0f;
                                object3 = null;
                            }
                            object3 = qz2_0.x(Float.valueOf(f12));
                            object4 = new Object[n4];
                            object4[0] = object3;
                            zn0_1.b(object4, n4, (String)objectArray2, string3, textView);
                            object3 = activePoints.isExpired();
                            object4 = Boolean.TRUE;
                            n7 = (int)(Intrinsics.areEqual(object3, object4) ? 1 : 0);
                            if (n7 != 0) {
                                object3 = cp_1.Companion;
                                n7 = (int)(km_1.b((cp$a)object3) ? 1 : 0);
                                if (n7 == 0) {
                                    view.setVisibility(0);
                                }
                                object.setVisibility(0);
                                n7 = 8;
                                f12 = 1.1E-44f;
                                object5.setVisibility(n7);
                                n18 = R$string.expired_on;
                                object5 = hv3_0.K(n18);
                                object3 = k7.k(activePoints.getExpiryDate());
                                n10 = 2;
                                objectArray = new Object[n10];
                                objectArray[0] = object5;
                                objectArray[n4] = object3;
                                zn0_1.b(objectArray, n10, string2, string3, (TextView)object);
                            } else {
                                f12 = 1.1E-44f;
                                n10 = 2;
                                view.setVisibility(8);
                                object.setVisibility(0);
                                object5.setVisibility(0);
                                n7 = R$string.refunded;
                                object3 = hv3_0.K(n7);
                                objectArray2 = k7.k(activePoints.getActivationDate());
                                objectArray3 = new Object[n10];
                                objectArray3[0] = object3;
                                objectArray3[n4] = objectArray2;
                                zn0_1.b(objectArray3, n10, string2, string3, (TextView)object);
                                int n19 = R$string.starts_expiring;
                                object = hv3_0.K(n19);
                                object3 = k7.k(activePoints.getExpiryDate());
                                objectArray2 = new Object[n10];
                                objectArray2[0] = object;
                                objectArray2[n4] = object3;
                                zn0_1.b(objectArray2, n10, (String)objectArray, string3, (TextView)object5);
                            }
                            object = new da$a();
                            ((da$a)object).k = n4;
                            ((da$a)object).b = n18 = R$drawable.component_placeholder;
                            ((da$a)object).n = object5 = activePoints.getImageUrl();
                            ((da$a)object).u = imageView;
                            ((da$a)object).a();
                            break;
                        }
                    }
                }
            } else {
                object.getClass();
            }
        } else {
            object2 = this;
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 2;
        String string3 = "inflate(...)";
        if (n3 == n4) {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_ac_recent_activity;
            viewGroup = string2.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
            Intrinsics.checkNotNullParameter(viewGroup, "itemView");
            z_0 z_02 = new RecyclerView$B((View)viewGroup);
            return z_02;
        }
        string2 = LayoutInflater.from((Context)viewGroup.getContext());
        int n8 = R$layout.row_active_points;
        viewGroup = string2.inflate(n8, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
        z2_0 z2_02 = new z2_0((View)viewGroup);
        return z2_02;
    }
}

