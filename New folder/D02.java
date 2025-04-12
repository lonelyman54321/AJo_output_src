/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.media3.common.b;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;

public final class D02
extends Fragment
implements View.OnClickListener,
pb_2 {
    public static final D02$a Companion;
    public String a;
    public String b;
    public Integer c;
    public ProgressBar d;
    public ImageView e;
    public ImageView f;
    public PlayerView g;
    public ImageView h;
    public ImageView i;
    public TextView j;
    public boolean k;
    public boolean l;
    public ob_2 m;
    public boolean n;
    public final NewCustomEventsRevamp o;
    public yi2_1 p;

    static {
        D02$a d02$a;
        Companion = d02$a = new Object();
    }

    public D02() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        boolean bl2;
        this.k = bl2 = true;
        this.l = bl2;
        this.o = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void Ca(boolean bl2) {
        ProgressBar progressBar = this.d;
        ProgressBar progressBar2 = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            bl2 = false;
            progressBar = null;
        }
        int n3 = 8;
        progressBar.setVisibility(n3);
        progressBar = this.i;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            bl2 = false;
            progressBar = null;
        }
        progressBar.setVisibility(n3);
        bl2 = this.n;
        String string2 = "imgPlay";
        if (bl2) {
            progressBar = this.h;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                progressBar2 = progressBar;
            }
            bl2 = false;
            progressBar = null;
            progressBar2.setVisibility(0);
        } else {
            progressBar = this.h;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                progressBar2 = progressBar;
            }
            progressBar2.setVisibility(n3);
        }
    }

    public final void F5() {
        Object object;
        boolean bl2 = this.n;
        String string2 = "imgThumbnail";
        String string3 = "imgPlay";
        ImageView imageView = null;
        if (bl2) {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object = null;
            }
            ai0_2.i((View)object);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            ai0_2.i((View)object);
        } else {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            ai0_2.B((View)object);
        }
        object = this.d;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        ai0_2.i((View)imageView);
        bl2 = this.k;
        if (bl2) {
            object = this.m;
            if (object != null) {
                ((ob_2)object).i();
            }
        } else {
            object = this.m;
            if (object != null) {
                ((ob_2)object).n();
            }
        }
    }

    public final void M0() {
        Object object = this.h;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            object = null;
        }
        int n3 = 8;
        object.setVisibility(n3);
        object = this.i;
        if (object == null) {
            object = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        ai0_2.B((View)imageView);
        this.n = true;
    }

    public final void Oa() {
        boolean bl2;
        boolean bl3;
        Object object = this.m;
        String string2 = "imgPlay";
        Object object2 = null;
        if (object != null && (object = ((ob_2)object).i) != null && (bl3 = ((b)object).isPlaying()) == (bl2 = true)) {
            object = this.m;
            if (object != null && (object = ((ob_2)object).i) != null) {
                bl2 = false;
                object.setPlayWhenReady(false);
            }
            if ((object = this.f) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgZoom");
                bl3 = false;
                object = null;
            }
            ai0_2.i((View)object);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
                bl3 = false;
                object = null;
            }
            ai0_2.i((View)object);
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl3 = false;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            ai0_2.a((View)object2);
        } else {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            ai0_2.B((View)object2);
        }
    }

    public final void Pa() {
        boolean bl2;
        D02 d02 = this;
        Object object = this.e;
        String string2 = "imgVolume";
        String string3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = d02.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object = null;
        }
        ai0_2.a((View)object);
        object = d02.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgZoom");
            bl2 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = d02.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            bl2 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = d02.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            bl2 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = d02.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            bl2 = false;
            object = null;
        }
        ai0_2.i((View)object);
        bl2 = d02.n;
        long l2 = 0L;
        string2 = null;
        if (bl2) {
            d02.n = false;
            object = d02.m;
            if (object != null) {
                ((ob_2)object).m(l2);
            }
            if ((object = d02.m) != null) {
                ((ob_2)object).k();
            }
            if (bl2 = d02.k) {
                object = d02.m;
                if (object != null) {
                    ((ob_2)object).i();
                }
            } else {
                object = d02.m;
                if (object != null) {
                    ((ob_2)object).n();
                }
            }
        } else {
            long l3;
            long l4;
            object = d02.p;
            boolean bl3 = true;
            if ((object == null || (bl2 = (l4 = (l3 = object.P3()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1))) && (bl2 = d02.l)) {
                object = d02.m;
                if (object == null || (object = ((ob_2)object).i) == null || (bl2 = ((b)object).isPlaying()) != bl3) {
                    object = d02.p;
                    if (object != null) {
                        l2 = object.P3();
                        object = d02.m;
                        if (object != null) {
                            ((ob_2)object).m(l2);
                        }
                    }
                    if ((object = d02.m) != null && (object = ((ob_2)object).i) != null) {
                        object.setPlayWhenReady(bl3);
                    }
                }
                d02.l = false;
            } else {
                object = d02.m;
                if ((object == null || (object = ((ob_2)object).i) == null || (bl2 = ((b)object).isPlaying()) != bl3) && (object = d02.m) != null && (object = ((ob_2)object).i) != null) {
                    object.setPlayWhenReady(bl3);
                }
            }
        }
        Bundle bundle = new Bundle();
        object = d02.p;
        if (object != null && (object = object.x5()) != null) {
            object = ((Product)object).getCode();
        } else {
            bl2 = false;
            object = null;
        }
        string2 = "product_id";
        bundle.putString(string2, (String)object);
        object = d02.p;
        if (object != null && (object = object.x5()) != null) {
            string3 = ((Product)object).getName();
        }
        bundle.putString("product_name", string3);
        NewCustomEventsRevamp.newPushCustomEvent$default(d02.o, "pdp_catalog_video_interactions", "video played", "minimized", "pdp_catalog_video_interactions", "pdp screen", "new", null, bundle, "", false, null, 1600, null);
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.h;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.d;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        ai0_2.B((View)imageView);
    }

    public final void ha() {
        Object object = this.h;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.i;
        if (object == null) {
            object = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        ai0_2.B((View)imageView);
        this.n = true;
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        D02 d02 = this;
        boolean bl2 = false;
        Object object2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.imgVolume;
        boolean bl3 = true;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            n4 = (int)(d02.k ? 1 : 0);
            String string2 = "imgVolume";
            if (n4 != 0) {
                object = d02.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object = null;
                }
                n3 = R$string.video_mute;
                String string3 = hv3_0.K(n3);
                object.setContentDescription((CharSequence)string3);
                object = d02.m;
                if (object != null) {
                    ((ob_2)object).n();
                }
                if ((object = d02.e) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                n4 = R$drawable.volume_on;
                object2.setImageResource(n4);
            } else {
                object = d02.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object = null;
                }
                n3 = R$string.video_unmute;
                String string4 = hv3_0.K(n3);
                object.setContentDescription((CharSequence)string4);
                object = d02.m;
                if (object != null) {
                    ((ob_2)object).i();
                }
                if ((object = d02.e) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                n4 = R$drawable.volume_off;
                object2.setImageResource(n4);
            }
            d02.k = bl2 = d02.k ^ bl3;
        } else {
            n7 = R$id.imgPlay;
            if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                this.Pa();
            } else {
                n7 = R$id.playerView;
                if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                    object2 = d02.m;
                    if (object2 != null && (object2 = ((ob_2)object2).i) != null && (bl2 = ((b)object2).isPlaying()) == bl3) {
                        this.Oa();
                    } else {
                        this.Pa();
                    }
                } else {
                    n7 = R$id.imgZoom;
                    if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                        Bundle bundle = new Bundle();
                        object = d02.p;
                        if (object != null && (object = object.x5()) != null) {
                            object = ((Product)object).getCode();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        Object object3 = "product_id";
                        bundle.putString((String)object3, (String)object);
                        object = d02.p;
                        if (object != null && (object = object.x5()) != null) {
                            object2 = ((Product)object).getName();
                        }
                        object = "product_name";
                        bundle.putString((String)object, (String)object2);
                        int n8 = 1600;
                        NewCustomEventsRevamp newCustomEventsRevamp = d02.o;
                        String string5 = "pdp_catalog_video_interactions";
                        String string6 = "full screen";
                        String string7 = "expand full screen";
                        String string8 = "pdp_catalog_video_interactions";
                        String string9 = "pdp screen";
                        String string10 = "new";
                        String string11 = "";
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string6, string7, string8, string9, string10, null, bundle, string11, false, null, n8, null);
                        object2 = d02.m;
                        if (object2 != null && (object2 = ((ob_2)object2).i) != null && (bl2 = ((b)object2).isPlaying()) == bl3) {
                            object2 = d02.m;
                            Intrinsics.checkNotNull(object2);
                            object2 = (Long)((ob_2)object2).p.d();
                            if (object2 != null) {
                                long l2 = ((Number)object2).longValue();
                                object3 = d02.p;
                                if (object3 != null) {
                                    object3.x3(l2);
                                }
                            }
                        }
                        if ((object2 = d02.m) != null) {
                            ((ob_2)object2).l();
                        }
                        if ((object2 = d02.p) != null) {
                            object = d02.c;
                            Intrinsics.checkNotNull(object);
                            n4 = (Integer)object;
                            object2.D9(n4);
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        int n3;
        String string2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Integer n4 = null;
        if (object != null) {
            string2 = "VIDEO_URL";
            object = object.getString(string2);
        } else {
            n3 = 0;
            object = null;
        }
        this.a = object;
        object = this.getArguments();
        if (object != null) {
            string2 = "THUMBNAIL";
            object = object.getString(string2);
        } else {
            n3 = 0;
            object = null;
        }
        this.b = object;
        object = this.getArguments();
        if (object != null) {
            n3 = object.getInt("IMAGE_POSITION");
            n4 = n3;
        }
        this.c = n4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_new_p_d_p_video_pager;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.progress;
        object2 = (ProgressBar)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.imgVolume;
        object2 = (ImageView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.imgZoom;
        object2 = (ImageView)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.playerView;
        object2 = (PlayerView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.imgPlay;
        object2 = (ImageView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.imgThumbnail;
        object2 = (ImageView)object.findViewById(n3);
        this.i = object2;
        n3 = R$id.timeTextView;
        object = (TextView)object.findViewById(n3);
        this.j = object;
        object = this.e;
        n3 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgZoom");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.g;
        object3 = "playerView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.m;
        if (object != null) {
            ((ob_2)object).l();
        }
        Object object4 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object4, "requireContext(...)");
        Object object5 = this.g;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object5 = null;
        }
        object3 = this.a;
        this.m = object = new ob_2((Context)object4, (PlayerView)((Object)object5), this, (String)object3);
        object3 = this.p;
        if (object3 != null) {
            object3.v2((ob_2)object);
        }
        object = new da$a();
        int n4 = 1;
        ((da$a)object).k = n4;
        ((da$a)object).r = n4;
        int n7 = R$string.acc_banner;
        object4 = hv3_0.K(n7);
        ((da$a)object).b((String)object4);
        object4 = UrlHelper.Companion.getInstance();
        object5 = this.b;
        object4 = ((UrlHelper)object4).getImageUrl((String)object5);
        object5 = this.i;
        String string2 = "imgThumbnail";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object5 = null;
        }
        ((da$a)object).n = object4;
        ((da$a)object).u = object5;
        ((da$a)object).a();
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        ai0_2.B((View)object2);
        object = this.m;
        if (object != null) {
            ((ob_2)object).g = n4;
        }
        if (object != null) {
            long l2 = 0L;
            n3 = 0;
            object2 = null;
            ob_2.h((ob_2)object, l2, 0, n4);
        }
        if ((object = this.p) != null && (object = object.y()) != null) {
            object2 = this.m;
            Intrinsics.checkNotNull(object2);
            object2 = ((ob_2)object2).o;
            object3 = new C02(this);
            ((LiveData)object2).e((mu1_1)object, (F62)object3);
        }
    }

    public final void u4() {
    }
}

