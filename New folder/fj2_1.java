/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.common.b;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.SpotLight;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fj2
 */
public final class fj2_1
extends RecyclerView$B
implements View.OnClickListener,
pb_2 {
    public final View a;
    public final yi2_1 b;
    public final ProgressBar c;
    public final ImageView d;
    public final ImageView e;
    public final PlayerView f;
    public final ImageView g;
    public final ImageView h;
    public final TextView i;
    public boolean j;
    public boolean k;
    public ob_2 l;
    public boolean m;
    public final NewCustomEventsRevamp n;

    public fj2_1(View view, yi2_1 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        super(view);
        this.a = view;
        this.b = object;
        view = this.itemView;
        int n3 = R$id.progress;
        view = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (ProgressBar)view;
        this.c = view;
        view = this.itemView;
        int n4 = R$id.imgVolume;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (ImageView)view;
        this.d = view;
        View view2 = this.itemView;
        int n7 = R$id.imgZoom;
        view2 = view2.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (ImageView)view2;
        this.e = view2;
        Object object2 = this.itemView;
        int n8 = R$id.playerView;
        object2 = object2.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        object2 = (PlayerView)((Object)object2);
        this.f = object2;
        View view3 = this.itemView;
        int n10 = R$id.imgPlay;
        view3 = view3.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (ImageView)view3;
        this.g = view3;
        View view4 = this.itemView;
        int n14 = R$id.imgThumbnail;
        view4 = view4.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view4, (String)object);
        view4 = (ImageView)view4;
        this.h = view4;
        view4 = this.itemView;
        n14 = R$id.timeTextView;
        view4 = view4.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view4, (String)object);
        view4 = (TextView)view4;
        this.i = view4;
        n3 = 1;
        this.j = n3;
        this.k = n3;
        this.n = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        view.setOnClickListener((View.OnClickListener)this);
        view2.setOnClickListener((View.OnClickListener)this);
        view3.setOnClickListener((View.OnClickListener)this);
        object2.setOnClickListener((View.OnClickListener)this);
    }

    public final void Ca(boolean bl2) {
        ProgressBar progressBar = this.c;
        int n3 = 8;
        progressBar.setVisibility(n3);
        progressBar = this.h;
        progressBar.setVisibility(n3);
        bl2 = this.m;
        ImageView imageView = this.g;
        if (bl2) {
            bl2 = false;
            progressBar = null;
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(n3);
        }
    }

    public final void F5() {
        boolean bl2 = this.m;
        ImageView imageView = this.h;
        ImageView imageView2 = this.g;
        if (bl2) {
            ai0_2.i((View)imageView2);
            ai0_2.i((View)imageView);
        } else {
            ai0_2.B((View)imageView2);
            ai0_2.B((View)imageView);
        }
        Object object = this.c;
        ai0_2.i((View)object);
        bl2 = this.j;
        if (bl2) {
            object = this.l;
            if (object != null) {
                ((ob_2)object).i();
            }
        } else {
            object = this.l;
            if (object != null) {
                ((ob_2)object).n();
            }
        }
    }

    public final void M0() {
        ai0_2.B((View)this.g);
        this.c.setVisibility(8);
        ai0_2.B((View)this.h);
        this.m = true;
    }

    public final void X4() {
    }

    public final void Z1() {
        ai0_2.i((View)this.g);
        ai0_2.B((View)this.c);
    }

    public final void ha() {
        ai0_2.B((View)this.g);
        ai0_2.B((View)this.h);
        this.m = true;
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        fj2_1 fj2_12 = this;
        int n7 = 0;
        Object object2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.imgVolume;
        int n10 = 1;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            n7 = fj2_12.j;
            object = fj2_12.d;
            if (n7 != 0) {
                n7 = R$string.video_mute;
                object2 = hv3_0.K(n7);
                object.setContentDescription((CharSequence)object2);
                object2 = fj2_12.l;
                if (object2 != null) {
                    ((ob_2)object2).n();
                }
                n7 = R$drawable.volume_on;
                object.setImageResource(n7);
            } else {
                n7 = R$string.video_unmute;
                object2 = hv3_0.K(n7);
                object.setContentDescription((CharSequence)object2);
                object2 = fj2_12.l;
                if (object2 != null) {
                    ((ob_2)object2).i();
                }
                n7 = R$drawable.volume_off;
                object.setImageResource(n7);
            }
            n7 = fj2_12.j ^ n10;
            fj2_12.j = n7;
        } else {
            n8 = R$id.imgPlay;
            if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
                this.x();
            } else {
                n8 = R$id.playerView;
                if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
                    object2 = fj2_12.l;
                    if (object2 != null && (object2 = ((ob_2)object2).i) != null && (n7 = (int)(((b)object2).isPlaying() ? 1 : 0)) == n10) {
                        this.w();
                    } else {
                        this.x();
                    }
                } else {
                    n8 = R$id.imgZoom;
                    if (object != null && (n4 = ((Integer)object).intValue()) == n8) {
                        Bundle bundle = new Bundle();
                        object = fj2_12.b;
                        Object object3 = object.x5();
                        if (object3 != null) {
                            object3 = ((Product)object3).getCode();
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        Object object4 = "product_id";
                        bundle.putString((String)object4, (String)object3);
                        object3 = object.x5();
                        if (object3 != null) {
                            object3 = ((Product)object3).getName();
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        bundle.putString("product_name", (String)object3);
                        int n14 = 1600;
                        object4 = fj2_12.n;
                        ArrayList arrayList = "pdp_catalog_video_interactions";
                        String string2 = "full screen";
                        String string3 = "expand full screen";
                        String string4 = "pdp_catalog_video_interactions";
                        String string5 = "pdp screen";
                        String string6 = "new";
                        String string7 = "";
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)((Object)arrayList), string2, string3, string4, string5, string6, null, bundle, string7, false, null, n14, null);
                        object3 = fj2_12.l;
                        if (object3 != null && (object3 = ((ob_2)object3).i) != null && (n8 = (int)(((b)object3).isPlaying() ? 1 : 0)) == n10) {
                            object3 = fj2_12.l;
                            Intrinsics.checkNotNull(object3);
                            object3 = (Long)((ob_2)object3).p.d();
                            if (object3 != null) {
                                long l2 = ((Number)object3).longValue();
                                object.x3(l2);
                            }
                        }
                        if ((object3 = fj2_12.l) != null) {
                            ((ob_2)object3).l();
                        }
                        if ((n8 = (int)(object.u7() ? 1 : 0)) == 0) {
                            n8 = this.getBindingAdapterPosition();
                            object4 = object.P();
                            arrayList = object4 != null ? ((SpotLight)object4).getSpotLightAttributes() : null;
                            if (arrayList != null) {
                                if ((object4 = ((SpotLight)object4).getSpotLightAttributes()) != null) {
                                    n7 = ((ArrayList)object4).size();
                                    object2 = n7;
                                }
                                Intrinsics.checkNotNull(object2);
                                n7 = (Integer)object2;
                                if (n7 > n10) {
                                    n8 += -1;
                                }
                            }
                            object.D9(n8);
                        }
                    }
                }
            }
        }
    }

    public final void u4() {
    }

    public final void w() {
        boolean bl2;
        boolean bl3;
        Object object = this.l;
        ImageView imageView = this.g;
        if (object != null && (object = ((ob_2)object).i) != null && (bl3 = ((b)object).isPlaying()) == (bl2 = true)) {
            object = this.l;
            if (object != null && (object = ((ob_2)object).i) != null) {
                bl2 = false;
                object.setPlayWhenReady(false);
            }
            ai0_2.i((View)this.e);
            object = this.d;
            ai0_2.i((View)object);
            ai0_2.B((View)imageView);
            ai0_2.a((View)imageView);
        } else {
            ai0_2.B((View)imageView);
        }
    }

    public final void x() {
        Object object;
        boolean bl2;
        fj2_1 fj2_12 = this;
        Object object2 = this.d;
        ai0_2.B((View)object2);
        ai0_2.a((View)object2);
        ai0_2.B((View)this.e);
        ai0_2.i((View)this.g);
        ai0_2.i((View)this.h);
        object2 = this.c;
        ai0_2.i((View)object2);
        boolean bl3 = this.m;
        long l2 = 0L;
        yi2_1 yi2_12 = this.b;
        if (bl3) {
            this.m = false;
            object2 = this.l;
            if (object2 != null) {
                ((ob_2)object2).m(l2);
            }
            if ((object2 = fj2_12.l) != null) {
                ((ob_2)object2).k();
            }
            if (bl3 = fj2_12.j) {
                object2 = fj2_12.l;
                if (object2 != null) {
                    ((ob_2)object2).i();
                }
            } else {
                object2 = fj2_12.l;
                if (object2 != null) {
                    ((ob_2)object2).n();
                }
            }
        } else {
            long l3 = yi2_12.P3();
            bl3 = true;
            Object object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object3 != false && (bl2 = this.k)) {
                object = this.l;
                if (object == null || (object = ((ob_2)object).i) == null || (bl2 = ((b)object).isPlaying()) != bl3) {
                    object = fj2_12.l;
                    if (object != null) {
                        l3 = yi2_12.P3();
                        ((ob_2)object).m(l3);
                    }
                    if ((object = fj2_12.l) != null && (object = ((ob_2)object).i) != null) {
                        object.setPlayWhenReady(bl3);
                    }
                }
                fj2_12.k = false;
            } else {
                object = fj2_12.l;
                if ((object == null || (object = ((ob_2)object).i) == null || (bl2 = ((b)object).isPlaying()) != bl3) && (object = fj2_12.l) != null && (object = ((ob_2)object).i) != null) {
                    object.setPlayWhenReady(bl3);
                }
            }
        }
        Bundle bundle = new Bundle();
        object2 = yi2_12.x5();
        bl2 = false;
        object = null;
        if (object2 != null) {
            object2 = ((Product)object2).getCode();
        } else {
            bl3 = false;
            object2 = null;
        }
        String string2 = "product_id";
        bundle.putString(string2, (String)object2);
        object2 = yi2_12.x5();
        if (object2 != null) {
            object = ((Product)object2).getName();
        }
        bundle.putString("product_name", (String)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(fj2_12.n, "pdp_catalog_video_interactions", "video played", "minimized", "pdp_catalog_video_interactions", "pdp screen", "new", null, bundle, "", false, null, 1600, null);
    }
}

