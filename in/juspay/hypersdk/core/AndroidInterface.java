/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.util.Base64
 *  android.util.DisplayMetrics
 *  android.util.Pair
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.WindowManager
 *  android.view.WindowMetrics
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.ImageView
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 *  android.widget.Toast
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.core.AndroidInterface$1;
import in.juspay.hypersdk.core.AndroidInterface$PendingAddScreenMapItem;
import in.juspay.hypersdk.core.AndroidInterface$PreRenderThread;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.InflateJSON;
import in.juspay.hypersdk.core.InflateView;
import in.juspay.hypersdk.core.Renderer;
import in.juspay.hypersdk.core.a;
import in.juspay.hypersdk.core.b_0;
import in.juspay.hypersdk.core.c;
import in.juspay.hypersdk.core.d;
import in.juspay.hypersdk.core.e;
import in.juspay.hypersdk.core.f;
import in.juspay.hypersdk.core.g;
import in.juspay.hypersdk.core.h;
import in.juspay.hypersdk.core.i;
import in.juspay.hypersdk.core.j;
import in.juspay.hypersdk.core.k;
import in.juspay.hypersdk.core.l;
import in.juspay.hypersdk.core.m;
import in.juspay.hypersdk.core.n;
import in.juspay.hypersdk.core.o;
import in.juspay.hypersdk.core.p;
import in.juspay.hypersdk.core.q;
import in.juspay.hypersdk.core.r;
import in.juspay.hypersdk.core.s;
import in.juspay.hypersdk.core.t;
import in.juspay.hypersdk.core.u;
import in.juspay.hypersdk.core.v;
import java.io.File;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class AndroidInterface {
    private final DynamicUI dynamicUI;
    private final Set onGoingPrepareScreenSet;
    private final Map pendingAddScreenMap;
    private String state;

    public AndroidInterface(DynamicUI dynamicUI) {
        Cloneable cloneable;
        this.pendingAddScreenMap = cloneable = new Cloneable();
        this.onGoingPrepareScreenSet = cloneable;
        this.dynamicUI = dynamicUI;
    }

    public static /* synthetic */ void a(AndroidInterface androidInterface, ObjectAnimator objectAnimator, String string2, String string3) {
        androidInterface.lambda$cancelAnim$18(objectAnimator, string2, string3);
    }

    public static /* synthetic */ DynamicUI access$000(AndroidInterface androidInterface) {
        return androidInterface.dynamicUI;
    }

    public static /* synthetic */ void b(AndroidInterface androidInterface, String string2, String string3, int n3, String string4, boolean bl2, String string5, String string6) {
        androidInterface.lambda$addStoredViewToParent$3(string2, string3, n3, string4, bl2, string5, string6);
    }

    public static /* synthetic */ void c(AndroidInterface androidInterface, String string2, int n3) {
        androidInterface.lambda$removeView$6(string2, n3);
    }

    public static /* synthetic */ void d(AndroidInterface androidInterface, String string2, int n3, String string3) {
        androidInterface.lambda$setImage$12(string2, n3, string3);
    }

    public static /* synthetic */ void e(AndroidInterface androidInterface, String string2, String string3) {
        androidInterface.lambda$runCmdsInBg$9(string2, string3);
    }

    public static /* synthetic */ void f(AndroidInterface androidInterface, Pair pair, String string2, String string3) {
        androidInterface.lambda$startAnim$17(pair, string2, string3);
    }

    private int findChildIndex(int n3, ViewGroup viewGroup) {
        int n4 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            View view = viewGroup.getChildAt(i3);
            int n7 = view.getId();
            if (n7 != n3) continue;
            return i3;
        }
        return -1;
    }

    public static /* synthetic */ void g(AndroidInterface androidInterface, String string2, int n3, JSONArray jSONArray) {
        androidInterface.lambda$updateAnim$19(string2, n3, jSONArray);
    }

    private String getJSONResult(String object) {
        boolean bl2;
        JSONArray jSONArray = new JSONArray((String)object);
        DynamicUI dynamicUI = this.dynamicUI;
        object = new InflateJSON(dynamicUI);
        dynamicUI = this.dynamicUI.getActivity();
        if (dynamicUI == null) {
            bl2 = true;
        } else {
            bl2 = false;
            dynamicUI = null;
        }
        ((InflateView)object).setUseAppContext(bl2);
        bl2 = ((InflateView)object).getUseAppContext();
        object = ((InflateJSON)object).runJSON(null, jSONArray, bl2, null);
        if (object != null) {
            return object.toString();
        }
        return "_null_";
    }

    public static /* synthetic */ void h(AndroidInterface androidInterface, String string2, String string3) {
        androidInterface.lambda$updateProperties$11(string2, string3);
    }

    public static /* synthetic */ void i(AndroidInterface androidInterface, String string2) {
        androidInterface.lambda$processPendingAddScreen$21(string2);
    }

    public static /* synthetic */ void j(AndroidInterface androidInterface, String string2, String string3) {
        androidInterface.lambda$runInUI$8(string2, string3);
    }

    public static /* synthetic */ void k(AndroidInterface androidInterface, String string2, int n3, String string3) {
        androidInterface.lambda$toggleKeyboard$13(string2, n3, string3);
    }

    public static /* synthetic */ void l(AndroidInterface androidInterface, String string2, JSONObject jSONObject, int n3) {
        androidInterface.lambda$replaceView$4(string2, jSONObject, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$addStoredViewToParent$3(String object, String object2, int n3, String string2, boolean bl2, String string3, String object3) {
        Exception exception2;
        block3: {
            Object object4;
            Object object5 = "window.callUICallback('";
            try {
                object4 = this.onGoingPrepareScreenSet;
                boolean bl3 = object4.contains(object);
                if (bl3) {
                    AndroidInterface$PendingAddScreenMapItem androidInterface$PendingAddScreenMapItem;
                    object3 = this.pendingAddScreenMap;
                    object5 = androidInterface$PendingAddScreenMapItem;
                    object4 = object2;
                    String string4 = object;
                    String string5 = string2;
                    androidInterface$PendingAddScreenMapItem = new AndroidInterface$PendingAddScreenMapItem((String)object2, (String)object, n3, string2, bl2, string3);
                    object3.put(object, androidInterface$PendingAddScreenMapItem);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object4 = this.dynamicUI;
            Renderer renderer = ((DynamicUI)object4).getRenderer();
            String string6 = object;
            boolean bl4 = bl2;
            Object object6 = object3;
            renderer.addStoredViewToParent((String)object2, (String)object, n3, bl2, (String)object3);
            object2 = this.dynamicUI;
            object = new InflateJSON((DynamicUI)object2);
            boolean bl5 = true;
            ((InflateView)object).setUseAppContext(bl5);
            object2 = this.dynamicUI;
            object4 = ((DynamicUI)object2).getRenderer();
            object2 = this.dynamicUI;
            renderer = ((DynamicUI)object2).getAppContext();
            string6 = "";
            String string7 = "";
            bl4 = ((InflateView)object).getUseAppContext();
            ((Renderer)object4).parseAndRunPipe(renderer, string3, string6, string7, bl4);
            if (string2 == null) return;
            object = this.dynamicUI;
            object2 = new StringBuilder((String)object5);
            ((StringBuilder)object2).append(string2);
            String string8 = "','success');";
            ((StringBuilder)object2).append(string8);
            object2 = ((StringBuilder)object2).toString();
            ((DynamicUI)object).addJsToWebView((String)object2);
            return;
        }
        object2 = this.dynamicUI.getLogger();
        string2 = " excep: fn__addStoredViewToParent  - ";
        CharSequence charSequence = new StringBuilder(string2);
        String string9 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)charSequence).append(string9);
        charSequence = ((StringBuilder)charSequence).toString();
        string9 = "ERROR";
        object2.e(string9, (String)charSequence);
        object2 = this.dynamicUI.getErrorCallback();
        charSequence = new StringBuilder(string2);
        string2 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        object2.onException(string9, (String)charSequence, exception2);
    }

    private /* synthetic */ void lambda$addViewToParent$1(String object, JSONObject object2, int n3, boolean bl2, String string2, String string3) {
        block10: {
            String string4 = "window.callUICallback('";
            DynamicUI dynamicUI = this.dynamicUI;
            Renderer renderer = dynamicUI.getRenderer();
            renderer.addViewToParent((String)object, (JSONObject)object2, n3, bl2, string2);
            if (string3 == null) break block10;
            object = this.dynamicUI;
            object2 = new StringBuilder(string4);
            ((StringBuilder)object2).append(string3);
            CharSequence charSequence = "','success');";
            ((StringBuilder)object2).append((String)charSequence);
            object2 = ((StringBuilder)object2).toString();
            try {
                ((DynamicUI)object).addJsToWebView((String)object2);
            }
            catch (Exception exception) {
                object2 = this.dynamicUI.getLogger();
                String string5 = " excep: fn__addViewToParent  - ";
                charSequence = new StringBuilder(string5);
                string2 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)charSequence).append(string2);
                charSequence = ((StringBuilder)charSequence).toString();
                string2 = "ERROR";
                object2.e(string2, (String)charSequence);
                object2 = this.dynamicUI.getErrorCallback();
                charSequence = new StringBuilder(string5);
                string5 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)charSequence).append(string5);
                charSequence = ((StringBuilder)charSequence).toString();
                object2.onException(string2, (String)charSequence, exception);
                if (string3 == null) break block10;
                DynamicUI dynamicUI2 = this.dynamicUI;
                object2 = cP.a(string4, string3, "','failure');");
                dynamicUI2.addJsToWebView((String)object2);
            }
        }
    }

    private /* synthetic */ void lambda$cancelAnim$18(ObjectAnimator object, String charSequence, String string2) {
        String string3 = "window.callUICallback('";
        object.cancel();
        object = object.getAnimatedValue();
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append((String)charSequence);
        charSequence = "', '";
        stringBuilder.append((String)charSequence);
        stringBuilder.append(f5);
        object = "');";
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        try {
            dynamicUI.addJsToWebView((String)object);
        }
        catch (Exception exception) {
            object = this.dynamicUI.getLogger();
            string3 = "Error parsing json for animation with id ";
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            string2 = "JSONERROR";
            object.e(string2, (String)charSequence);
        }
    }

    private /* synthetic */ void lambda$generateUIElement$14(String[] stringArray, String string2, View view) {
        this.showPopup(view, stringArray, string2);
    }

    private /* synthetic */ void lambda$generateUIElement$15(String object, String object2, int n3, String[] stringArray, String string2) {
        Object object3 = this.dynamicUI;
        if ((object = ((DynamicUI)object3).getContainer((String)object)) != null) {
            object3 = "PopupMenu";
            boolean bl2 = ((String)object2).equals(object3);
            if (bl2) {
                object = object.findViewById(n3);
                object2 = new i(this, stringArray, string2);
                object.setOnClickListener((View.OnClickListener)object2);
            }
        } else {
            object = this.dynamicUI.getLogger();
            object2 = "missing_container";
            String string3 = "render, no container";
            object.e((String)object2, string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$moveView$5(String object, String charSequence, String string2) {
        try {
            DynamicUI dynamicUI = this.dynamicUI;
            object = dynamicUI.getContainer((String)object);
            if (object != null) {
                int n3 = Integer.parseInt((String)charSequence);
                object = object.findViewById(n3);
                charSequence = object.getParent();
                charSequence = (ViewGroup)charSequence;
                charSequence.removeView((View)object);
                int n4 = Integer.parseInt(string2);
                charSequence.addView((View)object, n4);
                return;
            }
            object = this.dynamicUI;
            object = ((DynamicUI)object).getLogger();
            charSequence = "missing_container";
            string2 = "moveView, no container";
            object.e((String)charSequence, string2);
            return;
        }
        catch (Exception exception) {
            object = this.dynamicUI.getLogger();
            charSequence = new StringBuilder(" fn__moveView - ");
            string2 = this.dynamicUI.getRenderer().getErrorDetails();
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            string2 = "ERROR";
            object.e(string2, (String)charSequence);
        }
    }

    private /* synthetic */ void lambda$prepareAndStoreView$2(String string2, JSONObject object, String string3) {
        block10: {
            String string4 = "window.callUICallback('";
            boolean bl2 = true;
            this.setPrepareScreenTaskStatus(string2, bl2);
            Object object2 = this.dynamicUI;
            object2 = ((DynamicUI)object2).getRenderer();
            ((Renderer)object2).prepareAndStoreView(string2, (JSONObject)object);
            if (string3 == null) break block10;
            object = this.dynamicUI;
            object2 = new StringBuilder(string4);
            ((StringBuilder)object2).append(string3);
            CharSequence charSequence = "','success');";
            ((StringBuilder)object2).append((String)charSequence);
            object2 = ((StringBuilder)object2).toString();
            try {
                ((DynamicUI)object).addJsToWebView((String)object2);
            }
            catch (Exception exception) {
                object2 = this.dynamicUI.getLogger();
                String string5 = " excep: fn__prepareAndStoreView  - ";
                charSequence = new StringBuilder(string5);
                String string6 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)charSequence).append(string6);
                charSequence = ((StringBuilder)charSequence).toString();
                string6 = "ERROR";
                object2.e(string6, (String)charSequence);
                object2 = this.dynamicUI.getErrorCallback();
                charSequence = new StringBuilder(string5);
                string5 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)charSequence).append(string5);
                charSequence = ((StringBuilder)charSequence).toString();
                object2.onException(string6, (String)charSequence, exception);
                if (string3 == null) break block10;
                DynamicUI dynamicUI = this.dynamicUI;
                object2 = "','failure');";
                string3 = cP.a(string4, string3, (String)object2);
                dynamicUI.addJsToWebView(string3);
            }
        }
        this.setPrepareScreenTaskStatus(string2, false);
        this.processPendingAddScreen(string2);
    }

    private /* synthetic */ void lambda$processPendingAddScreen$21(String string2) {
        AndroidInterface$PendingAddScreenMapItem androidInterface$PendingAddScreenMapItem = (AndroidInterface$PendingAddScreenMapItem)this.pendingAddScreenMap.get(string2);
        if (androidInterface$PendingAddScreenMapItem != null) {
            Map map2 = this.pendingAddScreenMap;
            map2.remove(string2);
            String string3 = androidInterface$PendingAddScreenMapItem.parentId;
            String string4 = androidInterface$PendingAddScreenMapItem.screenName;
            int n3 = androidInterface$PendingAddScreenMapItem.index;
            String string5 = androidInterface$PendingAddScreenMapItem.callbackName;
            boolean bl2 = androidInterface$PendingAddScreenMapItem.replaceChild;
            String string6 = androidInterface$PendingAddScreenMapItem.runInUIprop;
            this.addStoredViewToParent(string3, string4, n3, string5, bl2, string6, null);
        }
    }

    private /* synthetic */ void lambda$removeView$6(String object, int n3) {
        Object object2 = this.dynamicUI;
        if ((object = ((DynamicUI)object2).getContainer((String)object)) != null) {
            if ((object = object.findViewById(n3)) == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup)object.getParent();
            viewGroup.removeView((View)object);
        } else {
            object = this.dynamicUI.getLogger();
            String string2 = "missing_container";
            object2 = "removeView, no container";
            object.e(string2, (String)object2);
        }
    }

    private /* synthetic */ void lambda$render$0(JSONObject object, String object2, String charSequence, String string2) {
        block13: {
            String string3 = "window.callUICallback(";
            Object object3 = this.dynamicUI;
            object3 = ((DynamicUI)object3).getRenderer();
            Object object4 = this.dynamicUI;
            object4 = ((DynamicUI)object4).getContainer((String)object2);
            boolean bl2 = Boolean.parseBoolean((String)charSequence);
            ((Renderer)object3).renderUI((JSONObject)object, (ViewGroup)object4, bl2, (String)object2);
            if (string2 == null) break block13;
            object = this.dynamicUI;
            object2 = new StringBuilder(string3);
            ((StringBuilder)object2).append(string2);
            charSequence = ",'success');";
            ((StringBuilder)object2).append((String)charSequence);
            object2 = ((StringBuilder)object2).toString();
            try {
                ((DynamicUI)object).addJsToWebView((String)object2);
            }
            catch (Exception exception) {
                object2 = this.dynamicUI.getLogger();
                object3 = " excep: fn__Render  - ";
                charSequence = new StringBuilder((String)object3);
                object4 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)charSequence).append((String)object4);
                charSequence = ((StringBuilder)charSequence).toString();
                object4 = "ERROR";
                object2.e((String)object4, (String)charSequence);
                object2 = this.dynamicUI.getErrorCallback();
                charSequence = new StringBuilder((String)object3);
                object3 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)charSequence).append((String)object3);
                charSequence = ((StringBuilder)charSequence).toString();
                object2.onException((String)object4, (String)charSequence, exception);
                if (string2 == null) break block13;
                DynamicUI dynamicUI = this.dynamicUI;
                object2 = cP.a(string3, string2, ",'failure');");
                dynamicUI.addJsToWebView((String)object2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$replaceView$4(String object, JSONObject object2, int n3) {
        Object object3;
        Exception exception2;
        Object object4;
        block7: {
            block6: {
                boolean bl2;
                try {
                    object4 = this.dynamicUI;
                    object = ((DynamicUI)object4).getContainer((String)object);
                    if (object == null) break block6;
                    object4 = this.dynamicUI;
                    object4 = ((DynamicUI)object4).getRenderer();
                    object2 = ((Renderer)object4).createView((JSONObject)object2);
                    if ((object = object.findViewById(n3)) == null) return;
                }
                catch (Exception exception2) {
                    break block7;
                }
                catch (JSONException jSONException) {
                    return;
                }
                n3 = object instanceof ViewGroup;
                if (n3 != 0) {
                    object3 = object;
                    object3 = (ViewGroup)object;
                    n3 = object3.getChildCount();
                    object4 = null;
                    Object var7_10 = null;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Object object5 = object;
                        object5 = (ViewGroup)object;
                        if ((object5 = object5.getChildAt(0)) == null) continue;
                        Object object6 = object;
                        object6 = (ViewGroup)object;
                        object6.removeViewAt(0);
                        object6 = object2;
                        object6 = (ViewGroup)object2;
                        object6.addView((View)object5, i3);
                    }
                }
                if (!(bl2 = this.replaceViewImpl((View)object2, (View)object))) return;
                object2.requestLayout();
                return;
            }
            object = this.dynamicUI;
            object = ((DynamicUI)object).getLogger();
            object2 = "missing_container";
            String string2 = "replaceView, no container";
            object.e((String)object2, string2);
            return;
        }
        object2 = this.dynamicUI.getLogger();
        object3 = exception2.getLocalizedMessage();
        String string3 = "excep: fn__replaceView - Error while replaceView ";
        object4 = new StringBuilder(string3);
        ((StringBuilder)object4).append(exception2);
        String string4 = ((StringBuilder)object4).toString();
        object2.e((String)object3, string4);
    }

    private /* synthetic */ void lambda$runCmdsInBg$9(String string2, String string3) {
        this.runJSONWithCallback(string2, string3);
    }

    private /* synthetic */ void lambda$runCmdsInUI$10(String string2, String string3) {
        this.runJSONWithCallback(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$runInUI$7(String object, String object2, String charSequence, String string2) {
        Exception exception2;
        String string3;
        block4: {
            block3: {
                InflateJSON inflateJSON;
                DynamicUI dynamicUI;
                block2: {
                    string3 = "window.callUICallback(";
                    try {
                        dynamicUI = this.dynamicUI;
                        inflateJSON = new InflateJSON(dynamicUI);
                        dynamicUI = this.dynamicUI;
                        dynamicUI = dynamicUI.getActivity();
                        if (dynamicUI == null) break block2;
                        boolean bl2 = false;
                        dynamicUI = null;
                        inflateJSON.setUseAppContext(false);
                        dynamicUI = this.dynamicUI;
                        Renderer renderer = dynamicUI.getRenderer();
                        dynamicUI = this.dynamicUI;
                        Activity activity = dynamicUI.getActivity();
                        boolean bl3 = inflateJSON.getUseAppContext();
                        renderer.parseAndRunPipe(activity, (String)object, (String)object2, (String)charSequence, bl3);
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                boolean bl4 = true;
                inflateJSON.setUseAppContext(bl4);
                dynamicUI = this.dynamicUI;
                Renderer renderer = dynamicUI.getRenderer();
                dynamicUI = this.dynamicUI;
                Context context = dynamicUI.getAppContext();
                boolean bl5 = inflateJSON.getUseAppContext();
                renderer.parseAndRunPipe(context, (String)object, (String)object2, (String)charSequence, bl5);
            }
            if (string2 == null) return;
            object = this.dynamicUI;
            object2 = new StringBuilder(string3);
            ((StringBuilder)object2).append(string2);
            charSequence = ",'success');";
            ((StringBuilder)object2).append((String)charSequence);
            object2 = ((StringBuilder)object2).toString();
            ((DynamicUI)object).addJsToWebView((String)object2);
            return;
        }
        object2 = this.dynamicUI.getLogger();
        String string4 = " excep: fn__runInUI  - ";
        charSequence = new StringBuilder(string4);
        String string5 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)charSequence).append(string5);
        charSequence = ((StringBuilder)charSequence).toString();
        string5 = "ERROR";
        object2.e(string5, (String)charSequence);
        object2 = this.dynamicUI.getErrorCallback();
        charSequence = new StringBuilder(string4);
        string4 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)charSequence).append(string4);
        charSequence = ((StringBuilder)charSequence).toString();
        object2.onException(string5, (String)charSequence, exception2);
        if (string2 == null) return;
        DynamicUI dynamicUI = this.dynamicUI;
        object2 = cP.a(string3, string2, ",'failure');");
        dynamicUI.addJsToWebView((String)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$runInUI$8(String object, String string2) {
        Exception exception2;
        String string3;
        block4: {
            Object object2;
            Object object3;
            block3: {
                block2: {
                    string3 = "window.callUICallback(";
                    try {
                        object3 = this.dynamicUI;
                        object2 = new InflateJSON((DynamicUI)object3);
                        object3 = this.dynamicUI;
                        object3 = ((DynamicUI)object3).getActivity();
                        if (object3 == null) break block2;
                        boolean bl2 = false;
                        object3 = null;
                        ((InflateView)object2).setUseAppContext(false);
                        object3 = this.dynamicUI;
                        Renderer renderer = ((DynamicUI)object3).getRenderer();
                        object3 = this.dynamicUI;
                        Activity activity = ((DynamicUI)object3).getActivity();
                        String string4 = "";
                        String string5 = "";
                        boolean bl3 = ((InflateView)object2).getUseAppContext();
                        String string6 = object;
                        renderer.parseAndRunPipe(activity, (String)object, string4, string5, bl3);
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                boolean bl4 = true;
                ((InflateView)object2).setUseAppContext(bl4);
                object3 = this.dynamicUI;
                Renderer renderer = ((DynamicUI)object3).getRenderer();
                object3 = this.dynamicUI;
                Context context = ((DynamicUI)object3).getAppContext();
                String string7 = "";
                String string8 = "";
                boolean bl5 = ((InflateView)object2).getUseAppContext();
                String string9 = object;
                renderer.parseAndRunPipe(context, (String)object, string7, string8, bl5);
            }
            if (string2 == null) return;
            object = this.dynamicUI;
            object2 = new StringBuilder(string3);
            ((StringBuilder)object2).append(string2);
            object3 = ",'success');";
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            ((DynamicUI)object).addJsToWebView((String)object2);
            return;
        }
        Object object4 = exception2.getClass().getName();
        Object object5 = this.dynamicUI.getLogger();
        String string10 = " excep: fn__runInUI  - ";
        String string11 = " - ";
        CharSequence charSequence = Gn.a(string10, (String)object4, string11);
        String string12 = this.dynamicUI.getRenderer().getErrorDetails();
        charSequence.append(string12);
        charSequence = charSequence.toString();
        string12 = "ERROR";
        object5.e(string12, (String)charSequence);
        object5 = this.dynamicUI.getErrorCallback();
        object4 = Gn.a(string10, (String)object4, string11);
        string10 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)object4).append(string10);
        object4 = ((StringBuilder)object4).toString();
        object5.onError(string12, (String)object4);
        if (string2 == null) return;
        object4 = this.dynamicUI;
        object5 = ",'failure');";
        string2 = cP.a(string3, string2, (String)object5);
        ((DynamicUI)object4).addJsToWebView(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$setImage$12(String object, int n3, String object2) {
        Exception exception2;
        block3: {
            try {
                DynamicUI dynamicUI = this.dynamicUI;
                object = dynamicUI.getContainer((String)object);
                if (object != null) {
                    object = object.findViewById(n3);
                    object = (ImageView)object;
                    n3 = 0;
                    Bitmap bitmap = null;
                    object2 = Base64.decode((String)object2, (int)0);
                    int n4 = ((Object)object2).length;
                    bitmap = BitmapFactory.decodeByteArray((byte[])object2, (int)0, (int)n4);
                    object.setImageBitmap(bitmap);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object = this.dynamicUI;
            object = ((DynamicUI)object).getLogger();
            String string2 = "missing_container";
            object2 = "setImage, no container";
            object.e(string2, (String)object2);
            return;
        }
        Object object3 = this.dynamicUI.getLogger();
        String string3 = " excep: fn__setImage  - ";
        object2 = new StringBuilder(string3);
        String string4 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)object2).append(string4);
        object2 = ((StringBuilder)object2).toString();
        string4 = "ERROR";
        object3.e(string4, (String)object2);
        object3 = this.dynamicUI.getErrorCallback();
        object2 = new StringBuilder(string3);
        string3 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)object2).append(string3);
        object2 = ((StringBuilder)object2).toString();
        object3.onException(string4, (String)object2, exception2);
    }

    private /* synthetic */ void lambda$setPrepareScreenTaskStatus$20(boolean bl2, String string2) {
        if (bl2) {
            Set set = this.onGoingPrepareScreenSet;
            set.add(string2);
        } else {
            Set set = this.onGoingPrepareScreenSet;
            set.remove(string2);
        }
    }

    private /* synthetic */ boolean lambda$showPopup$16(String charSequence, MenuItem object) {
        Object object2 = this.dynamicUI;
        charSequence = Gn.a("window.callUICallback('", (String)charSequence, "', '");
        int n3 = object.getItemId();
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append("');");
        charSequence = ((StringBuilder)charSequence).toString();
        ((DynamicUI)object2).addJsToWebView((String)charSequence);
        charSequence = this.dynamicUI.getActivity();
        object2 = new StringBuilder("You Clicked : ");
        object = object.getTitle();
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        Toast.makeText((Context)charSequence, (CharSequence)object, (int)0).show();
        return true;
    }

    private /* synthetic */ void lambda$startAnim$17(Pair object, String charSequence, String string2) {
        block9: {
            if (object != null) {
                Object object2 = ((Pair)object).second;
                if (object2 == null) break block9;
                object2 = (ObjectAnimator)object2;
                object2.start();
                object = ((Pair)object).second;
                object = (ObjectAnimator)object;
                object2 = new AndroidInterface$1(this, (String)charSequence, string2);
                try {
                    object.addListener((Animator.AnimatorListener)object2);
                }
                catch (Exception exception) {
                    object = this.dynamicUI.getLogger();
                    object2 = "Error parsing json for animation with id ";
                    charSequence = new StringBuilder((String)object2);
                    ((StringBuilder)charSequence).append(string2);
                    charSequence = ((StringBuilder)charSequence).toString();
                    string2 = "JSONERROR";
                    object.e(string2, (String)charSequence);
                }
            }
        }
    }

    private /* synthetic */ void lambda$toggleKeyboard$13(String object, int n3, String string2) {
        Object object2 = this.dynamicUI;
        if ((object = ((DynamicUI)object2).getContainer((String)object)) != null) {
            object = object.findViewById(n3);
            InputMethodManager inputMethodManager = (InputMethodManager)this.dynamicUI.getActivity().getSystemService("input_method");
            object2 = "show";
            int n4 = (int)(string2.equals(object2) ? 1 : 0);
            if (n4 != 0) {
                n4 = 1;
                inputMethodManager.showSoftInput((View)object, n4);
            } else {
                object = object.getWindowToken();
                n4 = 0;
                string2 = null;
                inputMethodManager.hideSoftInputFromWindow((IBinder)object, 0);
            }
        } else {
            object = this.dynamicUI.getLogger();
            String string3 = "missing_container";
            string2 = "removeView, no container";
            object.e(string3, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$updateAnim$19(String object, int n3, JSONArray object2) {
        try {
            Object object3 = this.dynamicUI;
            object = ((DynamicUI)object3).getContainer((String)object);
            if (object != null) {
                object = object.findViewById(n3);
                object3 = this.dynamicUI;
                object3 = ((DynamicUI)object3).getRenderer();
                object3 = ((Renderer)object3).getInflateView();
                ((InflateView)object3).handleAnimation(object, (JSONArray)object2);
                return;
            }
            object = this.dynamicUI;
            object = ((DynamicUI)object).getLogger();
            object2 = "missing_container";
            object3 = "updateAnim, no container";
            object.e((String)object2, (String)object3);
            return;
        }
        catch (Exception exception) {
            object = this.dynamicUI.getLogger();
            String string2 = "updateAnim: View doesn't exist for id -";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(n3);
            String string3 = ((StringBuilder)object2).toString();
            object2 = "ERROR";
            object.e((String)object2, string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$updateProperties$11(String object, String object2) {
        Object object3 = "id";
        try {
            boolean bl2;
            DynamicUI dynamicUI = this.dynamicUI;
            object = dynamicUI.getContainer((String)object);
            if (object == null) {
                object = this.dynamicUI;
                object = ((DynamicUI)object).getLogger();
                object2 = "missing_container";
                object3 = "updateProperties, no container";
                object.e((String)object2, (String)object3);
                return;
            }
            dynamicUI = new JSONObject((String)object2);
            int n3 = dynamicUI.getInt((String)object3);
            object = object.findViewById(n3);
            dynamicUI.remove((String)object3);
            object3 = this.dynamicUI;
            object2 = new InflateJSON((DynamicUI)object3);
            boolean bl3 = true;
            ((InflateView)object2).setUseAppContext(bl3);
            object3 = dynamicUI.keys();
            while (bl2 = object3.hasNext()) {
                Object object4 = object3.next();
                object4 = (String)object4;
                Object object5 = this.dynamicUI;
                object5 = ((DynamicUI)object5).getRenderer();
                object5 = ((Renderer)object5).getInflateView();
                boolean bl4 = ((InflateView)object2).getUseAppContext();
                ((InflateView)object5).parseKeys((String)object4, (JSONObject)dynamicUI, object, bl4);
            }
            return;
        }
        catch (Exception exception) {}
        object2 = this.dynamicUI.getLogger();
        object3 = exception.getLocalizedMessage();
        String string2 = "excep: fn__updateProperties- Error while updateProperties ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(exception);
        String string3 = stringBuilder.toString();
        object2.e((String)object3, string3);
    }

    public static /* synthetic */ void m(AndroidInterface androidInterface, boolean bl2, String string2) {
        androidInterface.lambda$setPrepareScreenTaskStatus$20(bl2, string2);
    }

    public static /* synthetic */ void n(AndroidInterface androidInterface, String[] stringArray, String string2, View view) {
        androidInterface.lambda$generateUIElement$14(stringArray, string2, view);
    }

    public static /* synthetic */ void o(AndroidInterface androidInterface, String string2, String string3) {
        androidInterface.lambda$runCmdsInUI$10(string2, string3);
    }

    public static /* synthetic */ boolean p(AndroidInterface androidInterface, String string2, MenuItem menuItem) {
        return androidInterface.lambda$showPopup$16(string2, menuItem);
    }

    public static /* synthetic */ void q(AndroidInterface androidInterface, String string2, String string3, String string4) {
        androidInterface.lambda$moveView$5(string2, string3, string4);
    }

    public static /* synthetic */ void r(AndroidInterface androidInterface, String string2, JSONObject jSONObject, int n3, boolean bl2, String string3, String string4) {
        androidInterface.lambda$addViewToParent$1(string2, jSONObject, n3, bl2, string3, string4);
    }

    private boolean replaceViewImpl(View view, View view2) {
        boolean bl2;
        int n3;
        ViewGroup viewGroup = (ViewGroup)view2.getParent();
        int n4 = view2.getId();
        if ((n4 = this.findChildIndex(n4, viewGroup)) != (n3 = -1)) {
            viewGroup.removeViewAt(n4);
            viewGroup.addView(view, n4);
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    private void runJSONWithCallback(String string2, String string3) {
        block12: {
            String string4 = "ERROR";
            Object object = "window.callUICallback('";
            string2 = this.getJSONResult(string2);
            if (string3 == null) break block12;
            Object object2 = this.dynamicUI;
            string2 = ((DynamicUI)object2).encodeUtfAndWrapDecode(string2, string4);
            object2 = new StringBuilder((String)object);
            ((StringBuilder)object2).append(string3);
            object = "',";
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string2);
            string2 = ");";
            ((StringBuilder)object2).append(string2);
            string2 = ((StringBuilder)object2).toString();
            object = this.dynamicUI;
            try {
                ((DynamicUI)object).addJsToWebView(string2);
            }
            catch (Exception exception) {
                object = this.dynamicUI.getLogger();
                String string5 = " excep: fn__runInUIJSON  - ";
                object2 = new StringBuilder(string5);
                String string6 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)object2).append(string6);
                object2 = ((StringBuilder)object2).toString();
                object.e(string4, (String)object2);
                object = this.dynamicUI.getErrorCallback();
                object2 = new StringBuilder(string5);
                string5 = this.dynamicUI.getRenderer().getErrorDetails();
                ((StringBuilder)object2).append(string5);
                object2 = ((StringBuilder)object2).toString();
                object.onException(string4, (String)object2, exception);
                if (string3 == null) break block12;
                DynamicUI dynamicUI = this.dynamicUI;
                string4 = "window.callUICallbackJSON(";
                object = ",'failure');";
                string3 = cP.a(string4, string3, (String)object);
                dynamicUI.addJsToWebView(string3);
            }
        }
    }

    public static /* synthetic */ void s(AndroidInterface androidInterface, String string2, String string3, String string4, String string5) {
        androidInterface.lambda$runInUI$7(string2, string3, string4, string5);
    }

    public static /* synthetic */ void t(AndroidInterface androidInterface, String string2, JSONObject jSONObject, String string3) {
        androidInterface.lambda$prepareAndStoreView$2(string2, jSONObject, string3);
    }

    public static /* synthetic */ void u(AndroidInterface androidInterface, JSONObject jSONObject, String string2, String string3, String string4) {
        androidInterface.lambda$render$0(jSONObject, string2, string3, string4);
    }

    public static /* synthetic */ void v(AndroidInterface androidInterface, String string2, String string3, int n3, String[] stringArray, String string4) {
        androidInterface.lambda$generateUIElement$15(string2, string3, n3, stringArray, string4);
    }

    public void Render(String string2, String string3) {
        this.render(string2, string3, null);
    }

    public void Render(String string2, String string3, String string4) {
        this.render(string2, string3, string4, null);
    }

    public void addStoredViewToParent(String string2, String string3, int n3, String string4, boolean bl2, String string5) {
        this.addStoredViewToParent(string2, string3, n3, string4, bl2, string5, null);
    }

    public void addStoredViewToParent(String string2, String string3, int n3, String string4, boolean bl2, String string5, String string6) {
        q q2 = new q(this, string3, string2, n3, string4, bl2, string5, string6);
        ExecutorManager.runOnMainThread(q2);
    }

    public String addToContainerList(int n3, String string2) {
        boolean bl2;
        DynamicUI dynamicUI = this.dynamicUI;
        if ((string2 = dynamicUI.getContainer(string2)) != null && (bl2 = (dynamicUI = string2.findViewById(n3)) instanceof ViewGroup)) {
            dynamicUI = this.dynamicUI;
            ViewGroup viewGroup = (ViewGroup)string2.findViewById(n3);
            return dynamicUI.addToContainerList(viewGroup);
        }
        return "__failed";
    }

    public void addViewToParent(String string2, String string3, int n3, String string4) {
        this.addViewToParent(string2, string3, n3, string4, null);
    }

    public void addViewToParent(String string2, String string3, int n3, String string4, String string5) {
        this.addViewToParent(string2, string3, n3, string4, false, string5);
    }

    public void addViewToParent(String string2, String string3, int n3, String string4, boolean bl2) {
        this.addViewToParent(string2, string3, n3, string4, bl2, null);
    }

    public void addViewToParent(String object, String string2, int n3, String string3, boolean bl2, String string4) {
        JSONObject jSONObject = new JSONObject(string2);
        try {
            n n4 = new n(this, (String)object, jSONObject, n3, bl2, string4, string3);
            ExecutorManager.runOnMainThread(n4);
        }
        catch (JSONException jSONException) {
            object = this.dynamicUI.getLogger();
            string3 = "Error while parsing ";
            CharSequence charSequence = new StringBuilder(string3);
            charSequence.append(string2);
            string2 = charSequence.toString();
            charSequence = "JSONERROR";
            object.e((String)charSequence, string2);
        }
    }

    public void cancelAnim(String string2, String string3) {
        InflateView inflateView = this.dynamicUI.getRenderer().getInflateView();
        Object object = new StringBuilder("M_anim_");
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        inflateView = (ObjectAnimator)((Pair)inflateView.getStateValFromKey((String)object)).second;
        object = new r(this, (ObjectAnimator)inflateView, string3, string2);
        ExecutorManager.runOnMainThread((Runnable)object);
    }

    public void dismissPopUp() {
        this.dynamicUI.getRenderer().dismissPopUp();
    }

    public int dpToPx(int n3) {
        if (n3 > 0) {
            DisplayMetrics displayMetrics = this.dynamicUI.getAppContext().getResources().getDisplayMetrics();
            float f5 = n3;
            float f6 = displayMetrics.density;
            return Math.round(f5 * f6);
        }
        return 0;
    }

    public String fetchData(String string2) {
        return this.dynamicUI.getAppContext().getSharedPreferences("DUI", 0).getString(string2, "null");
    }

    public void generateUIElement(String string2, int n3, String[] stringArray, String string3) {
        this.generateUIElement(string2, n3, stringArray, string3, null);
    }

    public void generateUIElement(String string2, int n3, String[] stringArray, String string3, String string4) {
        v v4 = new v(this, string4, string2, n3, stringArray, string3);
        ExecutorManager.runOnMainThread(v4);
    }

    public String getInternalStorageBaseFilePath() {
        return this.dynamicUI.getAppContext().getDir("juspay", 0).getAbsolutePath();
    }

    public String getNewID() {
        return String.valueOf(View.generateViewId());
    }

    public Renderer getRenderer() {
        return this.dynamicUI.getRenderer();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getScreenDimensions() {
        JSONException jSONException2;
        Object object;
        Object object2;
        JSONObject jSONObject;
        block5: {
            int n3;
            int n4;
            Object object3;
            Rect rect;
            JSONObject jSONObject2;
            block4: {
                block2: {
                    block3: {
                        jSONObject = new JSONObject();
                        jSONObject2 = new JSONObject();
                        object2 = new DisplayMetrics();
                        object = new DisplayMetrics();
                        rect = new Rect();
                        try {
                            object3 = this.dynamicUI;
                            object3 = ((DynamicUI)object3).getActivity();
                            if (object3 == null) break block2;
                            object3 = this.dynamicUI;
                            object3 = ((DynamicUI)object3).getActivity();
                            object3 = object3.getWindow();
                            object3 = object3.getDecorView();
                            object3.getWindowVisibleDisplayFrame(rect);
                            object3 = this.dynamicUI;
                            object3 = ((DynamicUI)object3).getActivity();
                            object3 = object3.getWindowManager();
                            object3 = object3.getDefaultDisplay();
                            object3.getMetrics((DisplayMetrics)object2);
                            int n7 = Build.VERSION.SDK_INT;
                            n4 = 30;
                            if (n7 < n4) break block3;
                            object = this.dynamicUI;
                            object = ((DynamicUI)object).getActivity();
                            object = object.getWindowManager();
                            object = e3.a((WindowManager)object);
                            object = f3.a((WindowMetrics)object);
                            n3 = object.height();
                            break block4;
                        }
                        catch (JSONException jSONException2) {
                            break block5;
                        }
                    }
                    object3 = this.dynamicUI;
                    object3 = ((DynamicUI)object3).getActivity();
                    object3 = object3.getWindowManager();
                    object3 = object3.getDefaultDisplay();
                    object3.getRealMetrics((DisplayMetrics)object);
                    n3 = ((DisplayMetrics)object).heightPixels;
                    break block4;
                }
                object2 = Resources.getSystem();
                object2 = object2.getDisplayMetrics();
                n3 = 0;
                object = null;
            }
            object3 = "width";
            n4 = ((DisplayMetrics)object2).widthPixels;
            jSONObject.put((String)object3, n4);
            object3 = "height";
            int n8 = ((DisplayMetrics)object2).heightPixels;
            jSONObject.put((String)object3, n8);
            object2 = "screenHeight";
            jSONObject.put((String)object2, n3);
            object2 = "top";
            n3 = rect.top;
            jSONObject2.put((String)object2, n3);
            object2 = "bottom";
            n3 = rect.bottom;
            jSONObject2.put((String)object2, n3);
            object2 = "left";
            n3 = rect.left;
            jSONObject2.put((String)object2, n3);
            object2 = "right";
            n3 = rect.right;
            jSONObject2.put((String)object2, n3);
            object2 = "viewportDimensions";
            jSONObject.put((String)object2, (Object)jSONObject2);
            return jSONObject.toString();
        }
        object2 = this.dynamicUI.getLogger();
        String string2 = ((Object)((Object)jSONException2)).toString();
        object = "JSON_EXCEPTION";
        object2.e((String)object, string2);
        return jSONObject.toString();
    }

    public String getState() {
        String string2 = this.state;
        if (string2 != null) {
            return string2;
        }
        return "{}";
    }

    public boolean isFilePresent(String string2) {
        File file = new File(string2);
        return file.exists();
    }

    public void moveView(String string2, String string3) {
        this.moveView(string2, string3, null);
    }

    public void moveView(String string2, String string3, String string4) {
        l l2 = new l(this, string4, string2, string3);
        ExecutorManager.runOnMainThread(l2);
    }

    public void prepareAndStoreView(String object, String string2, String charSequence) {
        Object object2 = new JSONObject(string2);
        p p2 = new p(this, (String)object, (JSONObject)object2, (String)charSequence);
        try {
            AndroidInterface$PreRenderThread androidInterface$PreRenderThread = new AndroidInterface$PreRenderThread(p2);
            androidInterface$PreRenderThread.start();
        }
        catch (JSONException jSONException) {
            object = this.dynamicUI.getLogger();
            object2 = "Error while parsing ";
            charSequence = new StringBuilder((String)object2);
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
            charSequence = "JSONERROR";
            object.e((String)charSequence, string2);
        }
    }

    public void processPendingAddScreen(String string2) {
        u u3 = new u(this, string2);
        ExecutorManager.runOnMainThread(u3);
    }

    public void removeView(int n3) {
        this.removeView(n3, null);
    }

    public void removeView(int n3, String string2) {
        g g3 = new g(this, string2, n3);
        ExecutorManager.runOnMainThread(g3);
    }

    public void render(String string2, String string3) {
        this.render(string2, string3, "true", null);
    }

    public void render(String string2, String string3, String string4) {
        this.render(string2, string3, string4, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void render(String string2, String object, String object2, String charSequence) {
        Object object3 = "window.callUICallback(";
        Object object4 = " excep: fn__Render  - missing_container - ";
        try {
            JSONObject jSONObject = new JSONObject(string2);
            Object object5 = this.dynamicUI;
            object5 = ((DynamicUI)object5).getContainer((String)charSequence);
            if (object5 != null) {
                object5 = object3;
                object3 = new d(this, jSONObject, (String)charSequence, (String)object2, (String)object);
                ExecutorManager.runOnMainThread((Runnable)object3);
                return;
            }
            object2 = this.dynamicUI;
            object2 = ((DynamicUI)object2).getLogger();
            charSequence = "missing_container";
            object5 = "render, it is not activity, it is applicationContext/ no container";
            object2.e((String)charSequence, (String)object5);
            object2 = this.dynamicUI;
            object2 = ((DynamicUI)object2).getErrorCallback();
            charSequence = "ERROR";
            object5 = new StringBuilder((String)object4);
            object4 = this.dynamicUI;
            object4 = ((DynamicUI)object4).getRenderer();
            object4 = ((Renderer)object4).getErrorDetails();
            ((StringBuilder)object5).append((String)object4);
            object4 = ((StringBuilder)object5).toString();
            object2.onError((String)charSequence, (String)object4);
            if (object == null) return;
            object2 = this.dynamicUI;
            charSequence = new StringBuilder((String)object3);
            ((StringBuilder)charSequence).append((String)object);
            object = ",'failure');";
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            ((DynamicUI)object2).addJsToWebView((String)object);
            return;
        }
        catch (JSONException jSONException) {
            object = this.dynamicUI.getLogger();
            object2 = new StringBuilder("fn__render - ");
            charSequence = this.dynamicUI.getRenderer().getErrorDetails();
            ((StringBuilder)object2).append((String)charSequence);
            charSequence = " - ";
            ((StringBuilder)object2).append((String)charSequence);
            ((StringBuilder)object2).append(string2);
            string2 = ((StringBuilder)object2).toString();
            object2 = "JSONERROR";
            object.e((String)object2, string2);
        }
    }

    public void replaceView(String string2, int n3) {
        this.replaceView(string2, n3, null);
    }

    public void replaceView(String string2, int n3, String charSequence) {
        Object object = new JSONObject(string2);
        try {
            t t3 = new t(this, (String)charSequence, (JSONObject)object, n3);
            ExecutorManager.runOnMainThread(t3);
        }
        catch (JSONException jSONException) {
            DuiLogger duiLogger = this.dynamicUI.getLogger();
            charSequence = new StringBuilder("fn__replaceView - ");
            object = this.dynamicUI.getRenderer().getErrorDetails();
            ((StringBuilder)charSequence).append((String)object);
            object = " - ";
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
            charSequence = "JSON_ERROR";
            duiLogger.e((String)charSequence, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run(String object, String string2) {
        Exception exception2;
        String string3;
        block4: {
            Object object2;
            Object object3;
            block3: {
                block2: {
                    string3 = "window.callUICallback(";
                    try {
                        object3 = this.dynamicUI;
                        object2 = new InflateJSON((DynamicUI)object3);
                        object3 = this.dynamicUI;
                        object3 = ((DynamicUI)object3).getActivity();
                        if (object3 == null) break block2;
                        boolean bl2 = false;
                        object3 = null;
                        ((InflateView)object2).setUseAppContext(false);
                        object3 = this.dynamicUI;
                        Renderer renderer = ((DynamicUI)object3).getRenderer();
                        object3 = this.dynamicUI;
                        Activity activity = ((DynamicUI)object3).getActivity();
                        String string4 = "";
                        String string5 = "";
                        boolean bl3 = ((InflateView)object2).getUseAppContext();
                        renderer.parseAndRunPipe(activity, (String)object, string4, string5, bl3);
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                boolean bl4 = true;
                ((InflateView)object2).setUseAppContext(bl4);
                object3 = this.dynamicUI;
                Renderer renderer = ((DynamicUI)object3).getRenderer();
                object3 = this.dynamicUI;
                Context context = ((DynamicUI)object3).getAppContext();
                String string6 = "";
                String string7 = "";
                boolean bl5 = ((InflateView)object2).getUseAppContext();
                renderer.parseAndRunPipe(context, (String)object, string6, string7, bl5);
            }
            if (string2 == null) return;
            object = this.dynamicUI;
            object2 = new StringBuilder(string3);
            ((StringBuilder)object2).append(string2);
            object3 = ",'success');";
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            ((DynamicUI)object).addJsToWebView((String)object2);
            return;
        }
        Object object4 = exception2.getClass().getName();
        Object object5 = this.dynamicUI.getLogger();
        String string8 = "runInUI";
        object5.e(string8, (String)object4);
        object5 = this.dynamicUI.getErrorCallback();
        object4 = nn_2.a((String)object4, " - ");
        String string9 = this.dynamicUI.getRenderer().getErrorDetails();
        ((StringBuilder)object4).append(string9);
        object4 = ((StringBuilder)object4).toString();
        object5.onError(string8, (String)object4);
        if (string2 == null) return;
        object4 = this.dynamicUI;
        object5 = ",'failure');";
        string2 = cP.a(string3, string2, (String)object5);
        ((DynamicUI)object4).addJsToWebView(string2);
    }

    public String runCmds(String string2) {
        try {
            return this.getJSONResult(string2);
        }
        catch (Exception exception) {
            Object object = this.dynamicUI.getLogger();
            String string3 = " excep: fn__runInUIJSON  - ";
            CharSequence charSequence = new StringBuilder(string3);
            String string4 = this.dynamicUI.getRenderer().getErrorDetails();
            ((StringBuilder)charSequence).append(string4);
            charSequence = ((StringBuilder)charSequence).toString();
            string4 = "ERROR";
            object.e(string4, (String)charSequence);
            object = this.dynamicUI.getErrorCallback();
            charSequence = new StringBuilder(string3);
            string3 = this.dynamicUI.getRenderer().getErrorDetails();
            ((StringBuilder)charSequence).append(string3);
            charSequence = ((StringBuilder)charSequence).toString();
            object.onException(string4, (String)charSequence, exception);
            return "__failure__";
        }
    }

    public void runCmdsInBg(String string2, String string3) {
        f f5 = new f(this, string2, string3);
        ExecutorManager.runOnBackgroundThread(f5);
    }

    public void runCmdsInUI(String string2, String string3) {
        o o3 = new o(this, string2, string3);
        ExecutorManager.runOnMainThread(o3);
    }

    public void runInUI(String string2, String string3) {
        k k2 = new k(this, string2, string3);
        ExecutorManager.runOnMainThread(k2);
    }

    public void runInUI(String string2, String string3, String string4, String string5) {
        b_0 b_02 = new b_0(this, string2, string4, string5, string3);
        ExecutorManager.runOnMainThread(b_02);
    }

    public void saveData(String string2, String string3) {
        this.dynamicUI.getAppContext().getSharedPreferences("DUI", 0).edit().putString(string2, string3).apply();
    }

    public void saveState(String string2) {
        this.state = string2;
    }

    public String setFragmentContainer(int n3, String object) {
        View view;
        boolean bl2;
        DynamicUI dynamicUI = this.dynamicUI;
        if ((object = dynamicUI.getContainer((String)object)) != null && (bl2 = (view = object.findViewById(n3)) instanceof ViewGroup)) {
            object = this.dynamicUI;
            view = (ViewGroup)view;
            return ((DynamicUI)object).addToContainerList((ViewGroup)view);
        }
        return "__failed";
    }

    public void setImage(int n3, String string2, String string3) {
        j j3 = new j(this, string3, n3, string2);
        ExecutorManager.runOnMainThread(j3);
    }

    public void setPrepareScreenTaskStatus(String string2, boolean bl2) {
        a a2 = new a(this, bl2, string2);
        ExecutorManager.runOnMainThread(a2);
    }

    public void setState(String string2) {
        this.state = string2;
    }

    public void showLoading() {
    }

    public void showPopup(View object, String[] object2, String string2) {
        Activity activity = this.dynamicUI.getActivity();
        if (activity != null) {
            int n3;
            Activity activity2 = this.dynamicUI.getActivity();
            activity = new PopupMenu((Context)activity2, (View)object);
            object = null;
            activity2 = null;
            for (int i3 = 0; i3 < (n3 = ((String[])object2).length); ++i3) {
                Menu menu2 = activity.getMenu();
                String string3 = object2[i3];
                menu2.add(0, i3, 0, (CharSequence)string3);
            }
            object = new s(this, string2);
            activity.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener)object);
            activity.show();
        } else {
            object = this.dynamicUI.getLogger();
            object2 = "Missing Activity";
            string2 = "showPopup, it is not  activity, it is applicationContext";
            object.e((String)object2, string2);
        }
    }

    public void startAnim(String string2) {
        this.startAnim(string2, null);
    }

    public void startAnim(String string2, String string3) {
        Pair pair = this.dynamicUI.getRenderer().getInflateView().findAnimationById(string2);
        m m2 = new m(this, pair, string3, string2);
        ExecutorManager.runOnMainThread(m2);
    }

    public void throwError(String string2) {
        this.dynamicUI.getLogger().e("throwError", string2);
    }

    public void toggleKeyboard(int n3, String string2, String string3) {
        Object object = this.dynamicUI.getActivity();
        if (object != null) {
            object = new e(this, string3, n3, string2);
            ExecutorManager.runOnMainThread((Runnable)object);
        } else {
            DuiLogger duiLogger = this.dynamicUI.getLogger();
            string2 = "Missing Activity";
            string3 = "toggleKeyboard, it is not  activity, it is applicationContext";
            duiLogger.e(string2, string3);
        }
    }

    public void updateAnim(int n3, String string2) {
        this.updateAnim(n3, string2, null);
    }

    public void updateAnim(int n3, String string2, String charSequence) {
        Object object = new JSONObject(string2);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(object);
        try {
            object = new c(this, (String)charSequence, n3, jSONArray);
            ExecutorManager.runOnMainThread((Runnable)object);
        }
        catch (JSONException jSONException) {
            DuiLogger duiLogger = this.dynamicUI.getLogger();
            object = "Error parsing json for animation string ";
            charSequence = new StringBuilder((String)object);
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
            charSequence = "JSONERROR";
            duiLogger.e((String)charSequence, string2);
        }
    }

    public void updateProperties(String string2) {
        this.updateProperties(string2, null);
    }

    public void updateProperties(String string2, String string3) {
        h h3 = new h(this, string3, string2);
        ExecutorManager.runOnMainThread(h3);
    }
}

