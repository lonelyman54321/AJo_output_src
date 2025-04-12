/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.data.model.GameInfo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.gamezone.GameZoneRewardsActivity;
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import com.ril.ajio.gamezone.GameZoneWebViewActivity$a;
import com.ril.ajio.services.data.gamezop.Body;
import com.ril.ajio.services.data.gamezop.GameZoneRewards;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Component;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from xY0
 */
public final class xy0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3 = 0;
        Object var3_3 = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = 1;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (Uri)object;
                object3 = (s13_0)object3;
                Intrinsics.checkNotNullParameter(object3, "$shareFileListener");
                object3.b((Uri)object);
                return Unit.a;
            }
            case 1: {
                double d2;
                double d5;
                double d7;
                object = (Component)object;
                object3 = (ex1_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                ((ex1_0)object3).h = object;
                if (object == null) return Unit.a;
                if ((object = ((Component)object).getBanners()) == null) return Unit.a;
                int n8 = object.isEmpty() ^ n4;
                if (n8 != n4) return Unit.a;
                object = ((ex1_0)object3).T;
                int n10 = ((ArrayList)object).size();
                if (n10 >= n4 && (n10 = (object2 = ((ArrayList)object).get(0)) instanceof su3) != 0) {
                    object2 = ((ArrayList)object).get(0);
                    String string2 = "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.UiCartComponent";
                    Intrinsics.checkNotNull(object2, string2);
                    object2 = (su3)object2;
                    n10 = ((su3)object2).b;
                    if (n10 == n4) {
                        object2 = ((ex1_0)object3).h;
                        Intrinsics.checkNotNull(object2);
                        ((ArrayList)object).set(0, object2);
                    }
                } else {
                    n10 = ((ArrayList)object).size();
                    if (n10 >= n4 && (n10 = (object2 = ((ArrayList)object).get(0)) instanceof Component) == 0) {
                        object2 = ((ex1_0)object3).h;
                        Intrinsics.checkNotNull(object2);
                        ((ArrayList)object).add(0, object2);
                    }
                }
                if ((n8 = (int)((d7 = (d5 = (object = ((ex1_0)object3).h) != null && (object = ((Component)object).getBanners()) != null && (object = (Banner)((ArrayList)object).get(0)) != null && (object = ((Banner)object).getHeight()) != null ? (Double)object : 0.0) - (d2 = 60.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1))) > 0) {
                    float f5;
                    void var3_5;
                    object = ((ex1_0)object3).F;
                    if (object != null) {
                        ViewGroup.LayoutParams layoutParams = object.getLayoutParams();
                    }
                    Intrinsics.checkNotNull(var3_5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)var3_5;
                    n8 = 1058642330;
                    constraintLayout$LayoutParams.F = f5 = 0.6f;
                    object = ((ex1_0)object3).F;
                    if (object != null) {
                        object.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
                    }
                    if ((object = ((ex1_0)object3).F) != null) {
                        object.requestLayout();
                    }
                }
                ((ex1_0)object3).Sa();
                object = ((ex1_0)object3).S;
                if (object == null) return Unit.a;
                ((RecyclerView$f)object).notifyDataSetChanged();
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        GameZoneWebViewActivity$a gameZoneWebViewActivity$a = GameZoneWebViewActivity.Companion;
        object3 = (GameZoneWebViewActivity)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (!bl2) {
            ((GameZoneWebViewActivity)object3).stopLoader();
            return Unit.a;
        }
        object2 = "format(...)";
        if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
            String string3;
            void var10_30;
            if ((object = (GameZoneRewards)((DataCallback)object).getData()) == null) return Unit.a;
            GameInfo gameInfo = ((GameZoneWebViewActivity)object3).q0;
            if (gameInfo != null) {
                String string4 = gameInfo.getGameUrl();
            } else {
                n7 = 0;
                Object var10_29 = null;
            }
            if (var10_30 == null) return Unit.a;
            int n14 = var10_30.length();
            if (n14 == 0) {
                return Unit.a;
            }
            Body body = ((GameZoneRewards)object).getBody();
            if (body != null) {
                void var3_8;
                body = ((GameZoneRewards)object).getBody();
                if (body != null) {
                    Long l2 = body.getRewardId();
                }
                if (var3_8 != null) {
                    GameZoneRewardsActivity.Companion.getClass();
                    Intrinsics.checkNotNullParameter(object3, "activity");
                    Intrinsics.checkNotNullParameter(object, "gameZoneRewards");
                    Intrinsics.checkNotNullParameter(var10_30, "shareUrl");
                    Intent intent = new Intent((Context)object3, GameZoneRewardsActivity.class);
                    object2 = "GAME_ZONE_REWARDS";
                    intent.putExtra((String)object2, (Parcelable)object);
                    object = "ARG_GAME_ZONE_SHAREURL";
                    intent.putExtra((String)object, (String)var10_30);
                    int n15 = 49;
                    float f6 = 6.9E-44f;
                    ((ComponentActivity)object3).startActivityForResult(intent, n15);
                    return Unit.a;
                }
            }
            if ((string3 = ((GameZoneRewards)object).getDisplayMessage()) == null) return Unit.a;
            n3 = string3.length();
            if (n3 == 0) {
                return Unit.a;
            }
            object = ((GameZoneRewards)object).getDisplayMessage();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            n3 = R$string.acc_alert_message;
            String string5 = hv3_0.K(n3);
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            String string6 = xh2_0.a(objectArray, n4, string5, (String)object2);
            ((GameZoneWebViewActivity)object3).showNotification((String)object, string6);
            return Unit.a;
        }
        int n16 = ((DataCallback)object).getStatus();
        if (n16 != n4) return Unit.a;
        ((GameZoneWebViewActivity)object3).stopLoader();
        object = StringCompanionObject.INSTANCE;
        n16 = R$string.acc_error_message_page_load_fail;
        object = hv3_0.K(n16);
        String string7 = hv3_0.K(R$string.something_wrong_msg);
        Object[] objectArray = new Object[n4];
        objectArray[0] = string7;
        object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
        n3 = R$string.something_wrong_msg;
        String string8 = hv3_0.K(n3);
        ((GameZoneWebViewActivity)object3).showNotification(string8, (String)object);
        return Unit.a;
    }
}

