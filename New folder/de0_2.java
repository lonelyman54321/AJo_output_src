/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.RectF
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.simpleCropView.CropImageView;
import com.ril.ajio.simpleCropView.CropImageView$c;
import com.ril.ajio.simpleCropView.a;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.Functions$b;
import io.reactivex.internal.functions.Functions$c;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from de0
 */
public final class de0_2
extends Fragment
implements View.OnClickListener {
    public static final de0$a Companion;
    public CropImageView a;
    public t30_0 b;
    public RectF c;
    public Uri d;
    public j3_0 e;
    public vh3_2 f;
    public PLPExtras g;
    public final hh3_2 h;

    static {
        de0$a de0$a;
        Companion = de0$a = new Object();
    }

    public de0_2() {
        Object object = new ij_0(this, 1);
        this.h = object = yr1_2.b((Function0)object);
    }

    public final xj_2 Oa(Uri object) {
        this.d = object;
        Object object2 = this.g;
        Object object3 = null;
        Object object4 = object2 != null ? ((PLPExtras)object2).B : null;
        if (object4 != null) {
            object2 = object2 != null ? ((PLPExtras)object2).B : null;
            this.c = object2;
        }
        if ((object2 = this.a) != null) {
            object3 = this.c;
            if (object3 == null) {
                object4 = null;
                ((CropImageView)((Object)object2)).setInitialFrameScale(0.0f);
            }
            object4 = new a((CropImageView)((Object)object2), (RectF)object3, (Uri)object);
            v00_0 v00_02 = new v00_0((i00_0)object4);
            ie0_2 ie0_22 = new ie0_2((CropImageView)((Object)object2));
            Functions$c functions$c = Functions.c;
            Functions$b functions$b = Functions.b;
            x03_0.b(functions$c, "onError is null");
            x03_0.b(functions$b, "onComplete is null");
            object = new j00_0(v00_02, ie0_22, functions$c, functions$b, functions$b, functions$b, functions$b);
            object3 = new he0_1((CropImageView)((Object)object2));
            object2 = new z00_0((j00_0)object, (he0_1)object3);
            object = qt2_2.d;
            x03_0.b(object, "scheduler is null");
            object3 = new CompletableSubscribeOn((u00_0)object2, (Scheduler)object);
            object = ti_2.a();
            object2 = new CompletableObserveOn((u00_0)object3, (HandlerScheduler)object);
            object = new Object();
            object3 = new xj_2((Xd0)object);
            ((u00_0)object2).a((h00_0)object3);
        }
        return object3;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.e = object2 = (j3_0)object;
            bl2 = object instanceof vh3_2;
            if (bl2) {
                object = (vh3_2)object;
                this.f = object;
                return;
            }
            object = pn_2.b(object, " must implement TabListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View object) {
        Object object2;
        block16: {
            j3_0 j3_02;
            block15: {
                String string2;
                int n3;
                void var1_4;
                int n4;
                object2 = null;
                if (object != null) {
                    n4 = object.getId();
                    Integer n7 = n4;
                } else {
                    n4 = 0;
                    Object var1_3 = null;
                }
                int n8 = R$id.backImg;
                if (var1_4 == null || (n3 = var1_4.intValue()) != n8) {
                    n8 = R$id.cancel;
                    if (var1_4 == null || (n3 = var1_4.intValue()) != n8) {
                        n8 = R$id.fitToFull;
                        if (var1_4 != null && (n3 = var1_4.intValue()) == n8) {
                            CropImageView cropImageView = this.a;
                            if (cropImageView == null) return;
                            object2 = CropImageView$c.FIT_IMAGE;
                            cropImageView.setCropMode((CropImageView$c)((Object)object2));
                            return;
                        } else {
                            t30_0 t30_02;
                            n8 = R$id.centerImage;
                            if (var1_4 == null || (n4 = var1_4.intValue()) != n8) return;
                            CropImageView cropImageView = this.a;
                            if (cropImageView != null) {
                                object2 = this.d;
                                n8 = 0;
                                cropImageView.setOutputMaxSize(0, 0);
                                Object object3 = new ge0_2(cropImageView, (Uri)object2);
                                object2 = new o53_0((Callable)object3);
                                object3 = new fe0_2(cropImageView);
                                j53_0 j53_02 = new j53_0((o53_0)object2, (fe0_2)object3);
                                object2 = new ee0_2(cropImageView);
                                i53_0 i53_02 = new i53_0(j53_02, (ee0_2)object2);
                                object2 = new Yd0(this);
                                object3 = new Zd0((Yd0)object2);
                                object2 = new n53_0(i53_02, (bx0_2)object3);
                                Scheduler scheduler = qt2_2.d;
                                SingleSubscribeOn singleSubscribeOn = ((g53_0)object2).h(scheduler);
                                object2 = ti_2.a();
                                SingleObserveOn singleObserveOn = singleSubscribeOn.e((Scheduler)object2);
                                object2 = new ae0_0(this);
                                object3 = new be0_1((ae0_0)object2);
                                object2 = Functions.d;
                                object2 = singleObserveOn.f((o60_0)object3, (o60_0)object2);
                            }
                            if (object2 == null || (t30_02 = this.b) == null) return;
                            t30_02.b((yr0_2)object2);
                            return;
                        }
                    }
                }
                try {
                    j3_02 = this.e;
                    if (j3_02 != null) break block15;
                    string2 = "activityFragmentListener";
                }
                catch (Exception exception) {
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                break block16;
            }
            object2 = j3_02;
        }
        object2.N();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new t30_0();
        this.b = object;
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            object = null;
        }
        object.t();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_image_cropper;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        boolean bl2;
        super.onDestroyView();
        t30_0 t30_02 = this.b;
        if (t30_02 != null && !(bl2 = t30_02.b) && (t30_02 = this.b) != null) {
            t30_02.d();
        }
    }

    public final void onStart() {
        super.onStart();
        Object object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabListener");
            object = null;
        }
        if ((object = object.W0()) != null) {
            int n3 = 8;
            object.setVisibility(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onViewCreated(View object, Bundle object2) {
        String string2 = "SourceUri";
        String string3 = "view";
        Intrinsics.checkNotNullParameter(object, string3);
        super.onViewCreated((View)object, (Bundle)object2);
        if (object != null) {
            int n3 = R$id.cropImageView;
            object2 = (CropImageView)object.findViewById(n3);
            this.a = object2;
            n3 = R$id.backImg;
            ((ImageView)object.findViewById(n3)).setOnClickListener((View.OnClickListener)this);
            n3 = R$id.fitToFull;
            ((ImageView)object.findViewById(n3)).setOnClickListener((View.OnClickListener)this);
            n3 = R$id.centerImage;
            object2 = (ImageView)object.findViewById(n3);
            object2.setOnClickListener((View.OnClickListener)this);
            n3 = R$id.cancel;
            object = (ImageView)object.findViewById(n3);
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.getArguments()) == null) return;
        try {
            object = this.requireArguments();
            boolean bl2 = object.containsKey(string2);
            if (bl2) {
                object = this.requireArguments();
                object = object.getString(string2);
                object = Uri.parse((String)object);
                this.d = object;
            }
            object = this.h;
            object = ((hh3_2)object).getValue();
            object = (bu2_0)object;
            object = ((bu2_0)object).a;
            object = ((LiveData)object).d();
            this.g = object = (PLPExtras)object;
            object = this.d;
            if ((object = this.Oa((Uri)object)) == null) return;
            object2 = this.b;
            if (object2 == null) return;
            ((t30_0)object2).b((yr0_2)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

