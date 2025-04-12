/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.net.Uri
 *  android.text.InputFilter
 *  android.text.InputFilter$LengthFilter
 *  android.text.Spanned
 *  android.text.TextWatcher
 *  android.util.DisplayMetrics
 *  android.util.Pair
 *  android.view.ActionMode$Callback
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.BounceInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.LinearInterpolator
 *  android.view.animation.PathInterpolator
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.CalendarView
 *  android.widget.CalendarView$OnDateChangeListener
 *  android.widget.EditText
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyperlottie.LottieAnimation;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.InflateView$1;
import in.juspay.hypersdk.core.InflateView$2;
import in.juspay.hypersdk.core.InflateView$3;
import in.juspay.hypersdk.core.InflateView$4;
import in.juspay.hypersdk.core.InflateView$5;
import in.juspay.hypersdk.core.InflateView$6;
import in.juspay.hypersdk.core.InflateView$7;
import in.juspay.hypersdk.core.InflateView$8;
import in.juspay.hypersdk.core.InflateView$Cmd;
import in.juspay.hypersdk.core.PaymentUtils;
import in.juspay.hypersdk.mystique.AccordionLayout;
import in.juspay.hypersdk.mystique.AnimationHolder;
import in.juspay.hypersdk.mystique.BottomSheetLayout;
import in.juspay.hypersdk.mystique.OnScroll;
import in.juspay.hypersdk.mystique.SecureActionCallback;
import in.juspay.hypersdk.mystique.SwypeLayout;
import in.juspay.hypersdk.mystique.SwypeScroll;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InflateView {
    private static final String ARG_TYPE_SPLIT = "_";
    private static final Pattern COMMAND_SPLIT;
    private static final String FUNCTION_ARG_SPLIT = ",";
    private static final Pattern FUNCTION_ARG_SPLIT_ESCAPE;
    private static final String FUNCTION_ARG_START = ":";
    private static final String KEYWORD_SPLIT = "->";
    private static final String LOG_TAG = "in.juspay.hypersdk.core.InflateView";
    private static final Map PRIMITIVE_TYPES;
    private static final String SETTER_EQUALS = "=";
    private final AnimationHolder animationHolder;
    private String currView;
    private String currViewId;
    private final DuiCallback duiCallback;
    protected final DynamicUI dynamicUI;
    private String fileOrigin;
    private final HashMap functionCache;
    private String lastCommand;
    private LottieAnimation lottieAnimation;
    private PopupMenu popUpMenu;
    protected HashMap state;
    private float swipeEndX;
    private float swipeEndY;
    private float swipeStartX;
    private float swipeStartY;
    private boolean useAppContext;

    static {
        Hashtable<Class<Void>, StringBuilder> hashtable;
        PRIMITIVE_TYPES = hashtable = new Hashtable<Class<Void>, StringBuilder>();
        String string2 = "(?<!\\\\)";
        Serializable serializable = new StringBuilder(string2);
        String string3 = Pattern.quote(FUNCTION_ARG_SPLIT);
        serializable.append(string3);
        FUNCTION_ARG_SPLIT_ESCAPE = Pattern.compile(serializable.toString());
        serializable = new StringBuilder(string2);
        string2 = Pattern.quote(";");
        serializable.append(string2);
        COMMAND_SPLIT = Pattern.compile(serializable.toString());
        serializable = Boolean.TYPE;
        hashtable.put((Class<Void>)Boolean.class, (StringBuilder)serializable);
        serializable = Character.TYPE;
        hashtable.put((Class<Void>)Character.class, (StringBuilder)serializable);
        serializable = Byte.TYPE;
        hashtable.put((Class<Void>)Byte.class, (StringBuilder)serializable);
        serializable = Short.TYPE;
        hashtable.put((Class<Void>)Short.class, (StringBuilder)serializable);
        serializable = Integer.TYPE;
        hashtable.put((Class<Void>)Integer.class, (StringBuilder)serializable);
        serializable = Long.TYPE;
        hashtable.put((Class<Void>)Long.class, (StringBuilder)serializable);
        serializable = Float.TYPE;
        hashtable.put((Class<Void>)Float.class, (StringBuilder)serializable);
        serializable = Double.TYPE;
        hashtable.put((Class<Void>)Double.class, (StringBuilder)serializable);
        serializable = Void.TYPE;
        hashtable.put(Void.class, (StringBuilder)serializable);
    }

    public InflateView(DynamicUI dynamicUI) {
        AnimationHolder animationHolder;
        Object object = new HashMap();
        this.functionCache = object;
        object = new HashMap();
        this.state = object;
        this.currViewId = "-1";
        this.lastCommand = object = "";
        this.currView = object;
        this.fileOrigin = object;
        this.useAppContext = false;
        this.lottieAnimation = null;
        this.dynamicUI = dynamicUI;
        this.duiCallback = object = new InflateView$1(this, dynamicUI);
        this.state.put("duiObj", dynamicUI);
        Object object2 = dynamicUI.getAppContext().getResources().getDisplayMetrics();
        float f5 = object2.density;
        this.animationHolder = animationHolder = new AnimationHolder((DuiCallback)object, f5);
        object = "in.juspay.hyperlottie.LottieAnimation";
        boolean bl2 = PaymentUtils.isClassAvailable((String)object);
        if (bl2) {
            animationHolder = dynamicUI.getAppContext();
            object2 = dynamicUI.getBridgeComponents().getFileProviderInterface();
            this.lottieAnimation = object = new LottieAnimation((Context)animationHolder, dynamicUI, (FileProviderInterface)object2);
        }
    }

    public static /* synthetic */ float a(float f5, float[] fArray) {
        return InflateView.lambda$getCustomEasing$11(fArray, f5);
    }

    public static /* synthetic */ float access$000(InflateView inflateView) {
        return inflateView.swipeStartX;
    }

    public static /* synthetic */ float access$002(InflateView inflateView, float f5) {
        inflateView.swipeStartX = f5;
        return f5;
    }

    public static /* synthetic */ float access$100(InflateView inflateView) {
        return inflateView.swipeStartY;
    }

    public static /* synthetic */ float access$102(InflateView inflateView, float f5) {
        inflateView.swipeStartY = f5;
        return f5;
    }

    public static /* synthetic */ float access$200(InflateView inflateView) {
        return inflateView.swipeEndX;
    }

    public static /* synthetic */ float access$202(InflateView inflateView, float f5) {
        inflateView.swipeEndX = f5;
        return f5;
    }

    public static /* synthetic */ float access$300(InflateView inflateView) {
        return inflateView.swipeEndY;
    }

    public static /* synthetic */ float access$302(InflateView inflateView, float f5) {
        inflateView.swipeEndY = f5;
        return f5;
    }

    public static /* synthetic */ void b(InflateView inflateView) {
        inflateView.lambda$dismissPopUp$12();
    }

    public static /* synthetic */ void c(PopupMenu popupMenu, View view) {
        popupMenu.show();
    }

    public static /* synthetic */ void d(InflateView inflateView, String string2, CalendarView calendarView, int n3, int n4, int n7) {
        inflateView.lambda$parseKeys$8(string2, calendarView, n3, n4, n7);
    }

    public static /* synthetic */ void e(InflateView inflateView, String string2, View view) {
        inflateView.lambda$parseKeys$4(string2, view);
    }

    public static /* synthetic */ boolean f(InflateView inflateView, String string2, MenuItem menuItem) {
        return inflateView.lambda$parseKeys$9(string2, menuItem);
    }

    private Object findAndSetField(Object object, String object2, String object3, boolean bl2) {
        Object object4 = object.getClass();
        try {
            object4 = ((Class)object4).getField((String)object2);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            object4 = object.getClass().getFields();
            int n3 = ((Field[])object4).length;
            Field field = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Field field2 = object4[i3];
                String string2 = field2.getName();
                boolean bl3 = string2.equals(object2);
                if (!bl3) continue;
                field = field2;
            }
            object4 = field;
        }
        if (object4 != null) {
            object2 = this.getValue((String)object3, bl2);
            ((Field)object4).set(object, object2);
        } else {
            object3 = this.dynamicUI.getLogger();
            String string3 = LOG_TAG;
            String string4 = "Couldn't set field for ";
            object4 = new StringBuilder(string4);
            ((StringBuilder)object4).append((String)object2);
            object2 = ((StringBuilder)object4).toString();
            object3.d(string3, (String)object2);
        }
        return object;
    }

    private Method findMethodInClass(Class clazz, String object) {
        int n3;
        Class[] classArray = null;
        if (clazz == null) {
            return null;
        }
        String string2 = FUNCTION_ARG_START;
        int n4 = 0;
        int n7 = this.indexOf((String)object, string2, 0);
        if (n7 != (n3 = -1)) {
            object = this.substr((String)object, string2);
            string2 = object[0];
            n4 = 1;
            object = object[n4];
        } else {
            string2 = object;
            object = null;
        }
        if (object != null) {
            classArray = this.parseTypeArguments((String)object);
        }
        object = new InflateView$Cmd(clazz, string2, classArray);
        return this.findMethodWithCmd((InflateView$Cmd)object);
    }

    public static /* synthetic */ void g(InflateView inflateView, String string2, View view, boolean bl2) {
        inflateView.lambda$parseKeys$7(string2, view, bl2);
    }

    private ObjectAnimator getAnimator(Object object, PropertyValuesHolder[] timeInterpolator, JSONObject object2) {
        float f5;
        String string2 = "duration";
        int n3 = object2.has(string2);
        float f6 = 0.0f;
        if (n3 != 0) {
            double d2 = object2.getDouble(string2);
            f5 = (float)d2;
        } else {
            f5 = 0.0f;
            string2 = null;
        }
        String string3 = "delay";
        boolean bl2 = object2.has(string3);
        if (bl2) {
            double d5 = object2.getDouble(string3);
            f6 = (float)d5;
        }
        string3 = "repeatCount";
        bl2 = object2.has(string3);
        boolean bl3 = false;
        if (bl2) {
            n3 = object2.getInt(string3);
        } else {
            n3 = 0;
            string3 = null;
        }
        String string4 = "startImmediate";
        boolean bl4 = object2.has(string4);
        if (bl4 && (bl2 = object2.getBoolean(string4))) {
            bl3 = true;
        }
        object2 = (bl4 = object2.has(string4 = "easing")) ? object2.getString(string4) : "linear";
        object = ObjectAnimator.ofPropertyValuesHolder((Object)object, (PropertyValuesHolder[])timeInterpolator);
        long l2 = (long)f5;
        object.setDuration(l2);
        long l3 = (long)f6;
        object.setStartDelay(l3);
        object.setRepeatCount(n3);
        timeInterpolator = this.getEasing((String)object2);
        object.setInterpolator(timeInterpolator);
        if (bl3) {
            object.start();
        }
        return object;
    }

    private int getArgsLength(String string2) {
        return FUNCTION_ARG_SPLIT_ESCAPE.split(string2).length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object getClassType(String object) {
        String string2;
        String string3;
        String string4;
        String[] stringArray;
        String string5;
        Object object2;
        Object object3;
        int n3;
        int n4;
        block34: {
            n4 = 1;
            n3 = 0;
            object3 = null;
            object2 = String.class;
            string5 = "WARNING";
            if (object == null) {
                object = this.dynamicUI.getLogger();
                object3 = " isNull : fn__getClassType -  toConvert ";
                CharSequence charSequence = new StringBuilder((String)object3);
                String string6 = this.getErrorDetails();
                ((StringBuilder)charSequence).append(string6);
                charSequence = ((StringBuilder)charSequence).toString();
                object.e(string5, (String)charSequence);
                object = this.dynamicUI.getErrorCallback();
                charSequence = new StringBuilder((String)object3);
                object3 = this.getErrorDetails();
                ((StringBuilder)charSequence).append((String)object3);
                charSequence = ((StringBuilder)charSequence).toString();
                object.onError(string5, (String)charSequence);
                return object2;
            }
            stringArray = this.substr((String)object, ARG_TYPE_SPLIT);
            string4 = stringArray[0];
            string4.getClass();
            string3 = " ";
            int n7 = string4.hashCode();
            switch (n7) {
                case 3392903: {
                    object3 = "null";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 13;
                    break block34;
                }
                case 102230: {
                    object3 = "get";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 12;
                    break block34;
                }
                case 99674: {
                    object3 = "dpf";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 11;
                    break block34;
                }
                case 98855: {
                    object3 = "ctx";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 10;
                    break block34;
                }
                case 96798: {
                    object3 = "apm";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 9;
                    break block34;
                }
                case 3677: {
                    object3 = "sp";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 8;
                    break block34;
                }
                case 3212: {
                    object3 = "dp";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 7;
                    break block34;
                }
                case 3184: {
                    object3 = "cs";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 6;
                    break block34;
                }
                case 115: {
                    object3 = "s";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 5;
                    break block34;
                }
                case 108: {
                    object3 = "l";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block34;
                }
                case 105: {
                    object3 = "i";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block34;
                }
                case 102: {
                    object3 = "f";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block34;
                }
                case 98: {
                    object3 = "b";
                    n3 = (int)(string4.equals(object3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block34;
                }
                case -891988091: {
                    string2 = "strget";
                    n7 = (int)(string4.equals(string2) ? 1 : 0);
                    if (n7 != 0) break block34;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                try {
                    return this.getClassName(string4);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    Object object4 = this.dynamicUI.getLogger();
                    object3 = " no class with name ";
                    String string7 = " : fn__getClassType - ";
                    StringBuilder stringBuilder = og_1.a((String)object3, string4, string7, (String)object, string3);
                    string2 = this.getErrorDetails();
                    stringBuilder.append(string2);
                    String string8 = stringBuilder.toString();
                    object4.e(string5, string8);
                    object4 = this.dynamicUI.getErrorCallback();
                    object = og_1.a((String)object3, string4, string7, (String)object, string3);
                    object3 = this.getErrorDetails();
                    ((StringBuilder)object).append((String)object3);
                    object = ((StringBuilder)object).toString();
                    object4.onError(string5, (String)object);
                    return object2;
                }
            }
            case 13: {
                return null;
            }
            case 12: {
                object3 = this.state;
                Object object5 = stringArray[n4];
                object5 = ((HashMap)object3).get(object5);
                if (object5 != null) {
                    return object5.getClass();
                }
                object5 = this.dynamicUI.getLogger();
                object3 = " isNull : fn__getClassType - ";
                object2 = Gn.a((String)object3, (String)object, string3);
                String string9 = this.getErrorDetails();
                ((StringBuilder)object2).append(string9);
                object2 = ((StringBuilder)object2).toString();
                object5.e(string5, (String)object2);
                object5 = this.dynamicUI.getErrorCallback();
                object = Gn.a((String)object3, (String)object, string3);
                object3 = this.getErrorDetails();
                ((StringBuilder)object).append((String)object3);
                object = ((StringBuilder)object).toString();
                object5.onError(string5, (String)object);
            }
            case 11: {
                return Float.TYPE;
            }
            case 10: {
                return Context.class;
            }
            case 9: {
                return this.dynamicUI.getApplicationManager();
            }
            case 8: {
                return Float.class;
            }
            case 5: {
                return object2;
            }
            case 4: {
                return Long.TYPE;
            }
            case 3: 
            case 7: {
                return Integer.TYPE;
            }
            case 2: {
                return Float.TYPE;
            }
            case 1: {
                return Boolean.TYPE;
            }
            case 0: 
            case 6: 
        }
        return CharSequence.class;
    }

    private Context getContext() {
        boolean bl2 = this.useAppContext;
        if (bl2) {
            return this.dynamicUI.getAppContext();
        }
        return this.dynamicUI.getActivity();
    }

    private TimeInterpolator getCustomEasing(String object, float[] fArray) {
        object.getClass();
        String string2 = "bezier";
        boolean bl2 = ((String)object).equals(string2);
        if (!bl2) {
            string2 = "spring";
            boolean bl3 = ((String)object).equals(string2);
            if (!bl3) {
                object = new LinearInterpolator();
                return object;
            }
            object = new ch1_2(fArray);
            return object;
        }
        float f5 = fArray[0];
        float f6 = fArray[1];
        float f7 = fArray[2];
        float f8 = fArray[3];
        object = new PathInterpolator(f5, f6, f7, f8);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private TimeInterpolator getEasing(String string2) {
        String string3;
        String string4;
        int n3 = 1;
        int n4 = 0;
        Object object = "[";
        string2.getClass();
        int n7 = -1;
        int n8 = string2.hashCode();
        switch (n8) {
            default: {
                break;
            }
            case -361990811: {
                string4 = "ease-in-out";
                n8 = (int)(string2.equals(string4) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 4;
                break;
            }
            case -789192465: {
                string4 = "ease-out";
                n8 = (int)(string2.equals(string4) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 3;
                break;
            }
            case -1102672091: {
                string4 = "linear";
                n8 = (int)(string2.equals(string4) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 2;
                break;
            }
            case -1383205240: {
                string4 = "bounce";
                n8 = (int)(string2.equals(string4) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 1;
                break;
            }
            case -1965120668: {
                string4 = "ease-in";
                n8 = (int)(string2.equals(string4) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 0;
                string3 = null;
            }
        }
        switch (n7) {
            default: {
                n7 = (int)(string2.contains((CharSequence)object) ? 1 : 0);
                if (n7 == 0) return new LinearInterpolator();
                n7 = string2.indexOf((String)object);
                string3 = string2.substring(0, n7);
                int n10 = string2.indexOf((String)object);
                string2 = string2.substring(n10);
                string4 = new JSONArray(string2);
                int n14 = string4.length();
                object = new float[n14];
                while (n4 < n14) {
                    double d2 = string4.getDouble(n4);
                    float f5 = (float)d2;
                    object[n4] = f5;
                    n4 += n3;
                }
                try {
                    return this.getCustomEasing(string3, (float[])object);
                }
                catch (JSONException jSONException) {}
                return new LinearInterpolator();
            }
            case 4: {
                return new AccelerateDecelerateInterpolator();
            }
            case 3: {
                return new DecelerateInterpolator();
            }
            case 2: {
                return new LinearInterpolator();
            }
            case 1: {
                return new BounceInterpolator();
            }
            case 0: 
        }
        return new AccelerateInterpolator();
    }

    private Object getValue(String object, boolean n3) {
        if (object != null) {
            String string2;
            boolean bl2;
            this.dynamicUI.getLogger().d("getValue!", (String)object);
            String string3 = ARG_TYPE_SPLIT;
            object = this.substr((String)object, string3);
            String string4 = object[0];
            object = object[1];
            int n4 = 92;
            int n7 = ((String)object).indexOf(n4);
            int n8 = -1;
            if (n7 != n8 && (bl2 = ((String)object).contains(string2 = ";"))) {
                String string5 = "\\\\;";
                object = ((String)object).replace(string5, string2);
            }
            if ((n7 = ((String)object).indexOf(n4)) != n8 && (n7 = (int)(((String)object).contains(string3) ? 1 : 0)) != 0) {
                string2 = "\\\\_";
                object = ((String)object).replace(string2, string3);
            }
            if ((n3 = ((String)object).indexOf(n4)) != n8 && (n7 = (int)(((String)object).contains(string3 = FUNCTION_ARG_START) ? 1 : 0)) != 0) {
                string2 = "\\\\:";
                object = ((String)object).replace(string2, string3);
            }
            if ((n3 = ((String)object).indexOf(n4)) != n8 && (n7 = (int)(((String)object).contains(string3 = FUNCTION_ARG_SPLIT) ? 1 : 0)) != 0) {
                string2 = "\\\\,";
                object = ((String)object).replace(string2, string3);
            }
            if ((n3 = ((String)object).indexOf(n4)) != n8 && (n4 = (int)(((String)object).contains(string3 = SETTER_EQUALS) ? 1 : 0)) != 0) {
                String string6 = "\\\\=";
                object = ((String)object).replace(string6, string3);
            }
            return this.getValueNew(string4, (String)object);
        }
        object = this.dynamicUI.getLogger();
        String string7 = " isNull : fn__getValue - value ";
        CharSequence charSequence = new StringBuilder(string7);
        String string8 = this.getErrorDetails();
        ((StringBuilder)charSequence).append(string8);
        charSequence = ((StringBuilder)charSequence).toString();
        string8 = "WARNING";
        object.e(string8, (String)charSequence);
        object = this.dynamicUI.getErrorCallback();
        charSequence = new StringBuilder(string7);
        string7 = this.getErrorDetails();
        ((StringBuilder)charSequence).append(string7);
        charSequence = ((StringBuilder)charSequence).toString();
        object.onError(string8, (String)charSequence);
        return null;
    }

    public static /* synthetic */ CharSequence h(String string2, CharSequence charSequence, int n3, int n4, Spanned spanned, int n7, int n8) {
        return InflateView.lambda$parseKeys$0(string2, charSequence, n3, n4, spanned, n7, n8);
    }

    public static /* synthetic */ CharSequence i(String string2, CharSequence charSequence, int n3, int n4, Spanned spanned, int n7, int n8) {
        return InflateView.lambda$parseKeys$1(string2, charSequence, n3, n4, spanned, n7, n8);
    }

    private int indexOf(String string2, String string3, int n3) {
        int n4;
        int n7;
        String string4 = string2.substring(n3);
        int n8 = string4.indexOf(string3);
        if (n8 != (n7 = -1) && n8 != 0 && n8 < (n4 = string2.length())) {
            int n10;
            n4 = n8 + n3;
            int n14 = n4 + -1;
            if ((n14 = (int)string2.charAt(n14)) == (n10 = 92)) {
                n3 = string3.length() + n4;
                return this.indexOf(string2, string3, n3);
            }
        }
        if (n8 == n7) {
            return n8;
        }
        return n8 + n3;
    }

    public static boolean isWrappedPrimitiveType(Class clazz) {
        return PRIMITIVE_TYPES.containsKey(clazz);
    }

    public static /* synthetic */ void j(InflateView inflateView, String string2, AdapterView adapterView, View view, int n3, long l2) {
        inflateView.lambda$parseKeys$6(string2, adapterView, view, n3, l2);
    }

    public static /* synthetic */ boolean k(InflateView inflateView, String string2, View view, int n3, KeyEvent keyEvent) {
        return inflateView.lambda$parseKeys$2(string2, view, n3, keyEvent);
    }

    public static /* synthetic */ boolean l(InflateView inflateView, String string2, View view) {
        return inflateView.lambda$parseKeys$3(string2, view);
    }

    private /* synthetic */ void lambda$dismissPopUp$12() {
        PopupMenu popupMenu = this.popUpMenu;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    private static /* synthetic */ float lambda$getCustomEasing$11(float[] fArray, float f5) {
        double d2 = -10.0f * f5;
        d2 = Math.pow(2.0, d2);
        float f6 = fArray[0];
        double d5 = f6;
        double d7 = Math.PI * 2 / d5;
        double d9 = f5 - (f6 /= 4.0f);
        return (float)(Math.sin(d7 * d9) * d2) + 1.0f;
    }

    private static /* synthetic */ CharSequence lambda$parseKeys$0(String string2, CharSequence charSequence, int n3, int n4, Spanned object, int n7, int n8) {
        while (n3 < n4) {
            object = Pattern.compile(string2);
            n7 = charSequence.charAt(n3);
            String string3 = String.valueOf((char)n7);
            boolean bl2 = ((Matcher)(object = ((Pattern)object).matcher(string3))).matches();
            if (!bl2) {
                return "";
            }
            ++n3;
        }
        return null;
    }

    private static /* synthetic */ CharSequence lambda$parseKeys$1(String object, CharSequence charSequence, int n3, int n4, Spanned spanned, int n7, int n8) {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = spanned.subSequence(0, n7).toString();
        stringBuilder.append(string2);
        CharSequence charSequence2 = charSequence.subSequence(n3, n4);
        stringBuilder.append((Object)charSequence2);
        n3 = spanned.length();
        charSequence2 = spanned.subSequence(n8, n3);
        stringBuilder.append((Object)charSequence2);
        charSequence2 = stringBuilder.toString();
        object = Pattern.compile((String)object).matcher(charSequence2);
        n3 = (int)(((Matcher)object).matches() ? 1 : 0);
        if (n3 == 0 && !(bl2 = ((Matcher)object).hitEnd())) {
            object = "";
            boolean bl3 = charSequence.equals(object);
            if (bl3 && n7 != n8) {
                object = spanned.subSequence(n7, n8);
            }
            return object;
        }
        return null;
    }

    private /* synthetic */ boolean lambda$parseKeys$2(String string2, View object, int n3, KeyEvent object2) {
        object = this.dynamicUI;
        object2 = new StringBuilder("window.callUICallback('");
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("','");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append("');");
        string2 = ((StringBuilder)object2).toString();
        ((DynamicUI)object).addJsToWebView(string2);
        return false;
    }

    private /* synthetic */ boolean lambda$parseKeys$3(String string2, View object) {
        object = this.dynamicUI;
        string2 = cP.a("window.callUICallback('", string2, "');");
        ((DynamicUI)object).addJsToWebView(string2);
        return false;
    }

    private /* synthetic */ void lambda$parseKeys$4(String string2, View object) {
        object = this.dynamicUI;
        string2 = cP.a("window.callUICallback('", string2, "');");
        ((DynamicUI)object).addJsToWebView(string2);
    }

    private /* synthetic */ void lambda$parseKeys$5(String string2) {
        DynamicUI dynamicUI = this.dynamicUI;
        string2 = cP.a("window.callUICallback('", string2, "');");
        dynamicUI.addJsToWebView(string2);
    }

    private /* synthetic */ void lambda$parseKeys$6(String string2, AdapterView object, View object2, int n3, long l2) {
        object = this.dynamicUI;
        object2 = new StringBuilder("window.callUICallback('");
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("',");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(");");
        string2 = ((StringBuilder)object2).toString();
        ((DynamicUI)object).addJsToWebView(string2);
    }

    private /* synthetic */ void lambda$parseKeys$7(String string2, View object, boolean bl2) {
        object = this.dynamicUI;
        StringBuilder stringBuilder = new StringBuilder("window.callUICallback('");
        stringBuilder.append(string2);
        stringBuilder.append("','");
        stringBuilder.append(bl2);
        stringBuilder.append("');");
        string2 = stringBuilder.toString();
        ((DynamicUI)object).addJsToWebView(string2);
    }

    private /* synthetic */ void lambda$parseKeys$8(String charSequence, CalendarView calendarView, int n3, int n4, int n7) {
        String string2 = "','";
        charSequence = oe3_0.a(n3, "window.callUICallback('", (String)charSequence, string2, string2);
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(n7);
        ((StringBuilder)charSequence).append("');");
        charSequence = ((StringBuilder)charSequence).toString();
        this.dynamicUI.addJsToWebView((String)charSequence);
    }

    private /* synthetic */ boolean lambda$parseKeys$9(String charSequence, MenuItem menuItem) {
        DynamicUI dynamicUI = this.dynamicUI;
        charSequence = Gn.a("window.callUICallback('", (String)charSequence, "', '");
        int n3 = menuItem.getItemId();
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append("');");
        charSequence = ((StringBuilder)charSequence).toString();
        dynamicUI.addJsToWebView((String)charSequence);
        return true;
    }

    public static /* synthetic */ void m(InflateView inflateView, String string2) {
        inflateView.lambda$parseKeys$5(string2);
    }

    private void normalTextChange(JSONObject objectArray, Object object) {
        GenericDeclaration genericDeclaration = object.getClass();
        int n3 = 1;
        Object object2 = new Class[n3];
        object2[0] = TextWatcher.class;
        genericDeclaration = ((Class)genericDeclaration).getMethod("addTextChangedListener", (Class<?>)object2);
        objectArray = objectArray.getString("onChange");
        object2 = new InflateView$7(this, (String)objectArray);
        objectArray = new Object[n3];
        objectArray[0] = object2;
        ((Method)genericDeclaration).invoke(object, objectArray);
    }

    private Object[] parseArguments(String stringArray, boolean bl2) {
        Object object;
        ArrayList<String[]> arrayList;
        boolean bl3;
        if (stringArray != null && !(bl3 = ((String)((Object)(arrayList = stringArray.trim()))).equals(object = ""))) {
            int n3;
            arrayList = new ArrayList<String[]>();
            object = stringArray.split(ARG_TYPE_SPLIT);
            String object22 = FUNCTION_ARG_SPLIT;
            int n4 = this.indexOf((String)stringArray, object22, 0);
            if (n4 == (n3 = -1)) {
                stringArray = this.getValue((String)stringArray, bl2);
                arrayList.add((String[])stringArray);
            } else {
                int n7 = ((String[])object).length;
                n4 = 2;
                if (n7 == n4) {
                    stringArray = this.getValue((String)stringArray, bl2);
                    arrayList.add((String[])stringArray);
                } else {
                    object = FUNCTION_ARG_SPLIT_ESCAPE;
                    for (String string2 : ((Pattern)object).split((CharSequence)stringArray)) {
                        Object object2 = this.getValue(string2, bl2);
                        arrayList.add((String[])object2);
                    }
                }
            }
            return arrayList.toArray();
        }
        return new Object[0];
    }

    private Class[] parseTypeArguments(String classArray) {
        int n3;
        int n4;
        int n7 = 1;
        if (classArray == null) {
            return null;
        }
        String[] stringArray = classArray.split(ARG_TYPE_SPLIT);
        Object object = FUNCTION_ARG_SPLIT;
        int n8 = this.indexOf((String)classArray, (String)object, 0);
        if (n8 != (n4 = -1) && (n3 = stringArray.length) != (n8 = 2) && (n8 = (stringArray = FUNCTION_ARG_SPLIT_ESCAPE.split((CharSequence)classArray)).length) > n7) {
            int n10 = stringArray.length;
            classArray = new Class[n10];
            for (int i3 = 0; i3 < (n8 = stringArray.length); i3 += n7) {
                object = stringArray[i3];
                classArray[i3] = object = (Class)this.getClassType((String)object);
            }
            return classArray;
        }
        classArray = (Class)this.getClassType((String)classArray);
        Class[] classArray2 = new Class[n7];
        classArray2[0] = classArray;
        return classArray2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Object runCommand(Object var1_1, Object var2_2, String var3_3, boolean var4_4) {
        block48: {
            block49: {
                block50: {
                    block51: {
                        var5_5 = this;
                        var6_6 /* !! */  = var1_1;
                        var7_7 = var2_2;
                        var8_8 = var3_3;
                        var9_9 = var4_4;
                        var10_10 = " is null ";
                        var11_11 = "get";
                        this.lastCommand = var3_3;
                        var12_12 /* !! */  = "->";
                        var13_13 = 0;
                        var14_14 = null;
                        var15_15 = this.indexOf(var3_3, (String)var12_12 /* !! */ , 0);
                        var16_16 = ":";
                        var17_17 = 1;
                        var18_18 = -1;
                        if (var15_15 == var18_18) break block49;
                        var19_19 = this.substr(var3_3, (String)var12_12 /* !! */ )[0];
                        var21_21 = this.indexOf((String)var19_19, var20_20 = "_", 0);
                        if (var21_21 != var18_18 && (var21_21 = (int)var19_19.startsWith((String)var11_11)) != 0) {
                            var19_19 = this.substr((String)var19_19, var20_20);
                            var22_22 = var19_19[var17_17];
                            var19_19 = var19_19[0];
                        } else {
                            var21_21 = 0;
                            var22_22 = null;
                        }
                        var23_23 = var5_5.indexOf((String)var8_8, var16_16, 0);
                        if (var23_23 != var18_18) {
                            var8_8 = var5_5.substr((String)var8_8, (String)var12_12 /* !! */ )[var17_17];
                            var12_12 /* !! */  = var5_5.substr((String)var8_8, var16_16);
                            var24_24 = var12_12 /* !! */ [0];
                            var12_12 /* !! */  = var12_12 /* !! */ [var17_17];
                        } else {
                            var8_8 = var5_5.substr((String)var8_8, (String)var12_12 /* !! */ )[var17_17];
                            var24_24 = var8_8;
                            var12_12 /* !! */  = null;
                        }
                        var19_19.getClass();
                        var25_25 = " ";
                        var26_26 = "WARNING";
                        var27_27 = var19_19.hashCode();
                        switch (var27_27) lbl-1000:
                        // 7 sources

                        {
                            default: {
                                var28_28 = -1;
                                break;
                            }
                            case 3559070: {
                                var11_11 = "this";
                                var28_28 = (int)var19_19.equals(var11_11);
                                if (var28_28 == 0) ** GOTO lbl-1000
                                var28_28 = 5;
                                break;
                            }
                            case 3237035: {
                                var11_11 = "infl";
                                var28_28 = (int)var19_19.equals(var11_11);
                                if (var28_28 == 0) ** GOTO lbl-1000
                                var28_28 = 4;
                                break;
                            }
                            case 102230: {
                                var28_28 = (int)var19_19.equals(var11_11);
                                if (var28_28 == 0) ** GOTO lbl-1000
                                var28_28 = 3;
                                break;
                            }
                            case 98855: {
                                var11_11 = "ctx";
                                var28_28 = (int)var19_19.equals(var11_11);
                                if (var28_28 == 0) ** GOTO lbl-1000
                                var28_28 = 2;
                                break;
                            }
                            case 96798: {
                                var11_11 = "apm";
                                var28_28 = (int)var19_19.equals(var11_11);
                                if (var28_28 == 0) ** GOTO lbl-1000
                                var28_28 = 1;
                                break;
                            }
                            case -995424086: {
                                var11_11 = "parent";
                                var28_28 = (int)var19_19.equals(var11_11);
                                if (var28_28 == 0) ** GOTO lbl-1000
                                var28_28 = 0;
                                var11_11 = null;
                            }
                        }
                        switch (var28_28) {
                            default: {
                                var6_6 /* !! */  = "var_";
                                var29_29 = var5_5.indexOf((String)var24_24, (String)var6_6 /* !! */ , 0);
                                var30_31 = -1;
                                if (var29_29 == var30_31) ** GOTO lbl98
                                var6_6 /* !! */  = var5_5.substr((String)var24_24, var20_20);
                                var30_31 = 1;
                                var6_6 /* !! */  = var6_6 /* !! */ [var30_31];
                                var11_11 = var5_5.getClassName((String)var24_24);
                                var6_6 /* !! */  = var11_11.getDeclaredField((String)var6_6 /* !! */ );
                                var6_6 /* !! */ .setAccessible((boolean)var30_31);
                                var8_8 = var5_5.substr((String)var8_8, var16_16)[var30_31];
                                var8_8 = var5_5.getValue((String)var8_8, var9_9);
                                var9_9 = false;
                                var31_34 = null;
                                var6_6 /* !! */ .set(null, var8_8);
                                ** GOTO lbl444
lbl98:
                                // 1 sources

                                var6_6 /* !! */  = "new";
                                var30_31 = (int)var8_8.equals(var6_6 /* !! */ );
                                if (var30_31 != 0 || (var29_29 = (int)(var10_10 = var5_5.substr((String)var8_8, var16_16)[0]).equals(var6_6 /* !! */ )) != 0) ** GOTO lbl117
                                var6_6 /* !! */  = var5_5.getClassName((String)var19_19);
                                if ((var6_6 /* !! */  = var5_5.findMethodInClass((Class)var6_6 /* !! */ , (String)var8_8)) == null) ** GOTO lbl444
                                var7_7 = var6_6 /* !! */ .getName();
                                var32_51 = var7_7.equals(var8_8 = "forName");
                                if (var32_51) {
                                    var6_6 /* !! */  = (String)var5_5.getValue((String)var12_12 /* !! */ , var9_9);
                                    var6_6 /* !! */  = var5_5.getClassName((String)var6_6 /* !! */ );
                                } else if (var12_12 /* !! */  != null) {
                                    var7_7 = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                    var8_8 = null;
                                    var6_6 /* !! */  = var6_6 /* !! */ .invoke(null, (Object[])var7_7);
                                } else {
                                    var8_8 = null;
                                    var6_6 /* !! */  = var6_6 /* !! */ .invoke(null, null);
                                }
                                break block48;
lbl117:
                                // 1 sources

                                if (var12_12 /* !! */  == null) ** GOTO lbl139
                                var6_6 /* !! */  = "in.juspay.hypersdk.mystique.DuiInvocationHandler";
                                var29_29 = (int)var19_19.equals(var6_6 /* !! */ );
                                if (var29_29 != 0) {
                                    var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                } else {
                                    var6_6 /* !! */  = var5_5.parseTypeArguments((String)var12_12 /* !! */ );
                                    var8_8 = var5_5.getClassName((String)var19_19).getConstructors();
                                    var30_31 = ((Constructor<?>[])var8_8).length;
                                    while (var13_13 < var30_31) {
                                        var11_11 = var8_8[var13_13];
                                        var19_19 = var11_11.getParameterTypes();
                                        var15_15 = ((Object)var19_19).length;
                                        if (var15_15 == (var33_54 = var5_5.getArgsLength((String)var12_12 /* !! */ )) && (var15_15 = (int)var5_5.matchTypes((Class[])(var19_19 = var11_11.getParameterTypes()), (Class[])var6_6 /* !! */ )) != 0) {
                                            var6_6 /* !! */  = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                            var6_6 /* !! */  = var11_11.newInstance(var6_6 /* !! */ );
                                            break block48;
                                        }
                                        var28_28 = 1;
                                        var13_13 += var28_28;
                                    }
                                }
                                ** GOTO lbl444
lbl139:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.getClassName((String)var19_19).newInstance();
                                break block48;
                            }
                            case 5: {
                                var10_10 = var1_1.getClass();
                                var10_10 = var5_5.findMethodInClass((Class)var10_10, (String)var8_8);
                                if (var12_12 /* !! */  == null) ** GOTO lbl165
                                if (var10_10 == null) ** GOTO lbl149
                                var7_7 = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                var6_6 /* !! */  = var10_10.invoke((Object)var6_6 /* !! */ , (Object[])var7_7);
                                break block48;
lbl149:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var31_35 = " isNull : fn__runCommand - classMethodDetails  ";
                                var10_10 = Gn.a(var31_35, (String)var8_8, var25_25);
                                var11_11 = this.getErrorDetails();
                                var10_10.append((String)var11_11);
                                var10_10 = var10_10.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var10_10);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var8_8 = Gn.a(var31_35, var8_8, var25_25);
                                var31_35 = this.getErrorDetails();
                                var8_8.append(var31_35);
                                var8_8 = var8_8.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var8_8);
                                ** GOTO lbl444
lbl165:
                                // 1 sources

                                if (var10_10 == null) ** GOTO lbl170
                                var9_9 = false;
                                var31_36 = null;
                                var6_6 /* !! */  = var10_10.invoke((Object)var6_6 /* !! */ , null);
                                break block48;
lbl170:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var31_37 = " isNull : fn__runCommand - this  classMethodDetails ";
                                var10_10 = Gn.a(var31_37, (String)var8_8, var25_25);
                                var11_11 = this.getErrorDetails();
                                var10_10.append((String)var11_11);
                                var10_10 = var10_10.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var10_10);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var8_8 = Gn.a(var31_37, var8_8, var25_25);
                                var31_37 = this.getErrorDetails();
                                var8_8.append(var31_37);
                                var8_8 = var8_8.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var8_8);
                                ** GOTO lbl444
                            }
                            case 4: {
                                var6_6 /* !! */  = this.getClass();
                                var6_6 /* !! */  = var5_5.findMethodInClass((Class)var6_6 /* !! */ , (String)var8_8);
                                if (var12_12 /* !! */  == null) ** GOTO lbl210
                                if (var6_6 /* !! */  == null) ** GOTO lbl194
                                var7_7 = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                var6_6 /* !! */  = var6_6 /* !! */ .invoke((Object)var5_5, (Object[])var7_7);
                                break block48;
lbl194:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var31_38 = " isNull : fn__runCommand - infl  classMethodDetails ";
                                var10_10 = Gn.a(var31_38, (String)var8_8, var25_25);
                                var11_11 = this.getErrorDetails();
                                var10_10.append((String)var11_11);
                                var10_10 = var10_10.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var10_10);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var8_8 = Gn.a(var31_38, var8_8, var25_25);
                                var31_38 = this.getErrorDetails();
                                var8_8.append(var31_38);
                                var8_8 = var8_8.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var8_8);
                                ** GOTO lbl444
lbl210:
                                // 1 sources

                                if (var6_6 /* !! */  == null) ** GOTO lbl215
                                var9_9 = false;
                                var31_39 = null;
                                var6_6 /* !! */  = var6_6 /* !! */ .invoke((Object)var5_5, null);
                                break block48;
lbl215:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var31_40 = " isNull : fn__runCommand - infl classMethodDetails  ";
                                var10_10 = Gn.a(var31_40, (String)var8_8, var25_25);
                                var11_11 = this.getErrorDetails();
                                var10_10.append((String)var11_11);
                                var10_10 = var10_10.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var10_10);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var8_8 = Gn.a(var31_40, var8_8, var25_25);
                                var31_40 = this.getErrorDetails();
                                var8_8.append(var31_40);
                                var8_8 = var8_8.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var8_8);
                                ** GOTO lbl444
                            }
                            case 2: {
                                var6_6 /* !! */  = var5_5.dynamicUI.getActivity();
                                if (var6_6 /* !! */  == null) {
                                    var6_6 /* !! */  = var5_5.dynamicUI.getAppContext();
                                }
                                var10_10 = var6_6 /* !! */ .getClass();
                                var10_10 = var5_5.findMethodInClass((Class)var10_10, (String)var8_8);
                                if (var12_12 /* !! */  == null) ** GOTO lbl258
                                if (var10_10 == null) ** GOTO lbl242
                                var7_7 = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                var6_6 /* !! */  = var10_10.invoke((Object)var6_6 /* !! */ , (Object[])var7_7);
                                break block48;
lbl242:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var31_41 = " isNull : fn__runCommand - ctx  classMethodDetails ";
                                var10_10 = Gn.a(var31_41, (String)var8_8, var25_25);
                                var11_11 = this.getErrorDetails();
                                var10_10.append((String)var11_11);
                                var10_10 = var10_10.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var10_10);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var8_8 = Gn.a(var31_41, var8_8, var25_25);
                                var31_41 = this.getErrorDetails();
                                var8_8.append(var31_41);
                                var8_8 = var8_8.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var8_8);
                                ** GOTO lbl444
lbl258:
                                // 1 sources

                                if (var10_10 == null) ** GOTO lbl263
                                var9_9 = false;
                                var31_42 = null;
                                var6_6 /* !! */  = var10_10.invoke((Object)var6_6 /* !! */ , null);
                                break block48;
lbl263:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var31_43 = " isNull : fn__runCommand - ctx classMethodDetails  ";
                                var10_10 = Gn.a(var31_43, (String)var8_8, var25_25);
                                var11_11 = this.getErrorDetails();
                                var10_10.append((String)var11_11);
                                var10_10 = var10_10.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var10_10);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var8_8 = Gn.a(var31_43, var8_8, var25_25);
                                var31_43 = this.getErrorDetails();
                                var8_8.append(var31_43);
                                var8_8 = var8_8.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var8_8);
                                ** GOTO lbl444
                            }
                            case 1: {
                                var6_6 /* !! */  = var5_5.dynamicUI.getApplicationManager().getClass();
                                var6_6 /* !! */  = var5_5.findMethodInClass((Class)var6_6 /* !! */ , (String)var8_8);
                                if (var12_12 /* !! */  == null) ** GOTO lbl304
                                if (var6_6 /* !! */  == null) ** GOTO lbl288
                                var7_7 = var5_5.dynamicUI.getApplicationManager();
                                var11_11 = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                var6_6 /* !! */  = var6_6 /* !! */ .invoke(var7_7, (Object[])var11_11);
                                ** GOTO lbl327
lbl288:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var11_11 = " isNull : fn__runCommand - applicationManager  classMethodDetails ";
                                var19_19 = Gn.a((String)var11_11, (String)var8_8, var25_25);
                                var14_14 = this.getErrorDetails();
                                var19_19.append((String)var14_14);
                                var14_14 = var19_19.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var14_14);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var11_11 = Gn.a((String)var11_11, var8_8, var25_25);
                                var14_14 = this.getErrorDetails();
                                var11_11.append((String)var14_14);
                                var11_11 = var11_11.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var11_11);
                                ** GOTO lbl325
lbl304:
                                // 1 sources

                                if (var6_6 /* !! */  == null) ** GOTO lbl310
                                var7_7 = var5_5.dynamicUI.getApplicationManager();
                                var28_28 = 0;
                                var11_11 = null;
                                var6_6 /* !! */  = var6_6 /* !! */ .invoke(var7_7, null);
                                ** GOTO lbl327
lbl310:
                                // 1 sources

                                var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                                var11_11 = " isNull : fn__runCommand - applicationManager classMethodDetails  ";
                                var14_14 = Gn.a((String)var11_11, (String)var8_8, var25_25);
                                var19_19 = this.getErrorDetails();
                                var14_14.append((String)var19_19);
                                var14_14 = var14_14.toString();
                                var6_6 /* !! */ .e(var26_26, (String)var14_14);
                                var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                                var11_11 = Gn.a((String)var11_11, var8_8, var25_25);
                                var14_14 = this.getErrorDetails();
                                var11_11.append((String)var14_14);
                                var11_11 = var11_11.toString();
                                var6_6 /* !! */ .onError(var26_26, (String)var11_11);
                            }
lbl325:
                            // 3 sources

                            case 3: {
                                var6_6 /* !! */  = var7_7;
lbl327:
                                // 3 sources

                                if (var22_22 != null) {
                                    var7_7 = var5_5.state.get(var22_22);
                                    var11_11 = null;
                                    var28_28 = var5_5.indexOf((String)var24_24, var20_20, 0);
                                    if (var28_28 == (var13_13 = -1) && var7_7 != null) {
                                        var10_10 = var7_7.getClass();
                                        var10_10 = var5_5.findMethodInClass((Class)var10_10, (String)var8_8);
                                        if (var12_12 /* !! */  != null) {
                                            if (var10_10 != null) {
                                                var6_6 /* !! */  = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                                                var6_6 /* !! */  = var10_10.invoke(var7_7, (Object[])var6_6 /* !! */ );
                                            } else {
                                                var7_7 = var5_5.dynamicUI.getLogger();
                                                var31_44 = " isNull : fn__runCommand - get classMethodDetails ";
                                                var10_10 = Gn.a(var31_44, var8_8, var25_25);
                                                var11_11 = this.getErrorDetails();
                                                var10_10.append((String)var11_11);
                                                var10_10 = var10_10.toString();
                                                var7_7.e(var26_26, (String)var10_10);
                                                var7_7 = var5_5.dynamicUI.getErrorCallback();
                                                var8_8 = Gn.a(var31_44, (String)var8_8, var25_25);
                                                var31_44 = this.getErrorDetails();
                                                var8_8.append(var31_44);
                                                var8_8 = var8_8.toString();
                                                var7_7.onError(var26_26, (String)var8_8);
                                            }
                                        } else if (var10_10 != null) {
                                            var9_9 = false;
                                            var31_45 = null;
                                            var6_6 /* !! */  = var10_10.invoke(var7_7, null);
                                        } else {
                                            var7_7 = var5_5.dynamicUI.getLogger();
                                            var31_46 = " isNull : fn__runCommand - get classMethodDetails : ";
                                            var10_10 = Gn.a(var31_46, var8_8, var25_25);
                                            var11_11 = this.getErrorDetails();
                                            var10_10.append((String)var11_11);
                                            var10_10 = var10_10.toString();
                                            var7_7.e(var26_26, (String)var10_10);
                                            var7_7 = var5_5.dynamicUI.getErrorCallback();
                                            var8_8 = Gn.a(var31_46, (String)var8_8, var25_25);
                                            var31_46 = this.getErrorDetails();
                                            var8_8.append(var31_46);
                                            var8_8 = var8_8.toString();
                                            var7_7.onError(var26_26, (String)var8_8);
                                        }
                                    } else {
                                        if (var7_7 != null) {
                                            var6_6 /* !! */  = var5_5.substr((String)var24_24, var20_20);
                                            var32_52 = 1;
                                            var6_6 /* !! */  = var6_6 /* !! */ [var32_52];
                                            var10_10 = var5_5.state.get(var22_22);
                                            var7_7 = var5_5.substr((String)var8_8, var16_16)[var32_52];
                                            return var5_5.findAndSetField(var10_10, (String)var6_6 /* !! */ , (String)var7_7, var9_9);
                                        }
                                        var7_7 = var5_5.dynamicUI.getLogger();
                                        var8_8 = " isNull : fn__runCommand - get_";
                                        var31_47 /* !! */  = Gn.a((String)var8_8, var22_22, (String)var10_10);
                                        var11_11 = this.getErrorDetails();
                                        var31_47 /* !! */ .append((String)var11_11);
                                        var31_47 /* !! */  = var31_47 /* !! */ .toString();
                                        var7_7.e(var26_26, (String)var31_47 /* !! */ );
                                        var7_7 = var5_5.dynamicUI.getErrorCallback();
                                        var8_8 = Gn.a((String)var8_8, var22_22, (String)var10_10);
                                        var31_47 /* !! */  = this.getErrorDetails();
                                        var8_8.append((String)var31_47 /* !! */ );
                                        var8_8 = var8_8.toString();
                                        var7_7.onError(var26_26, (String)var8_8);
                                    }
                                }
                                break block48;
                            }
                            case 0: 
                        }
                        var10_10 = var1_1.getClass();
                        var10_10 = var5_5.findMethodInClass((Class)var10_10, (String)var8_8);
                        var11_11 = " isNull : fn__runCommand - parent  classMethodDetails ";
                        if (var12_12 /* !! */  == null) break block50;
                        if (var10_10 == null) break block51;
                        var7_7 = var5_5.parseArguments((String)var12_12 /* !! */ , var9_9);
                        var6_6 /* !! */  = var10_10.invoke((Object)var6_6 /* !! */ , (Object[])var7_7);
                        break block48;
                    }
                    var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                    var31_48 /* !! */  = Gn.a((String)var11_11, (String)var8_8, var25_25);
                    var10_10 = this.getErrorDetails();
                    var31_48 /* !! */ .append((String)var10_10);
                    var31_48 /* !! */  = var31_48 /* !! */ .toString();
                    var6_6 /* !! */ .e(var26_26, (String)var31_48 /* !! */ );
                    var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                    var8_8 = Gn.a((String)var11_11, var8_8, var25_25);
                    var31_48 /* !! */  = this.getErrorDetails();
                    var8_8.append((String)var31_48 /* !! */ );
                    var8_8 = var8_8.toString();
                    var6_6 /* !! */ .onError(var26_26, (String)var8_8);
                    ** GOTO lbl444
                }
                if (var10_10 != null) {
                    var9_9 = false;
                    var31_49 = null;
                    var6_6 /* !! */  = var10_10.invoke((Object)var6_6 /* !! */ , null);
                } else {
                    var6_6 /* !! */  = var5_5.dynamicUI.getLogger();
                    var31_50 /* !! */  = Gn.a((String)var11_11, (String)var8_8, var25_25);
                    var10_10 = this.getErrorDetails();
                    var31_50 /* !! */ .append((String)var10_10);
                    var31_50 /* !! */  = var31_50 /* !! */ .toString();
                    var6_6 /* !! */ .e(var26_26, (String)var31_50 /* !! */ );
                    var6_6 /* !! */  = var5_5.dynamicUI.getErrorCallback();
                    var8_8 = Gn.a(" isNull : fn__runCommand - parent classMethodDetails  ", var8_8, var25_25);
                    var31_50 /* !! */  = this.getErrorDetails();
                    var8_8.append((String)var31_50 /* !! */ );
                    var8_8 = var8_8.toString();
                    var6_6 /* !! */ .onError(var26_26, (String)var8_8);
lbl444:
                    // 12 sources

                    var6_6 /* !! */  = var7_7;
                }
                break block48;
            }
            if (var2_2 == null) {
                var10_10 = null;
                var32_53 = this.indexOf(var3_3, var16_16, 0);
                if (var32_53 != (var30_32 = -1)) {
                    var7_7 = this.substr(var3_3, var16_16);
                    var30_32 = 1;
                    var7_7 = var7_7[var30_32];
                    var10_10 = var1_1.getClass();
                    var8_8 = this.findMethodInClass((Class)var10_10, var3_3);
                    var7_7 = this.parseArguments((String)var7_7, var4_4);
                    var6_6 /* !! */  = var8_8.invoke((Object)var1_1, (Object[])var7_7);
                } else {
                    var7_7 = var1_1.getClass();
                    var7_7 = this.findMethodInClass((Class)var7_7, var3_3);
                    var8_8 = null;
                    var6_6 /* !! */  = var7_7.invoke((Object)var1_1, null);
                }
            } else {
                var6_6 /* !! */  = null;
                var29_30 = this.indexOf(var3_3, var16_16, 0);
                if (var29_30 != (var30_33 = -1)) {
                    var6_6 /* !! */  = this.substr(var3_3, var16_16);
                    var30_33 = 1;
                    var6_6 /* !! */  = var6_6 /* !! */ [var30_33];
                    var10_10 = var2_2.getClass();
                    var8_8 = this.findMethodInClass((Class)var10_10, var3_3);
                    var6_6 /* !! */  = this.parseArguments((String)var6_6 /* !! */ , var4_4);
                    var6_6 /* !! */  = var8_8.invoke((Object)var2_2, (Object[])var6_6 /* !! */ );
                } else {
                    var6_6 /* !! */  = var2_2.getClass();
                    var6_6 /* !! */  = this.findMethodInClass((Class)var6_6 /* !! */ , var3_3);
                    var8_8 = null;
                    var6_6 /* !! */  = var6_6 /* !! */ .invoke((Object)var2_2, null);
                }
            }
        }
        return var6_6 /* !! */ ;
    }

    private void separatorTextChange(JSONObject objectArray, Object object) {
        GenericDeclaration genericDeclaration = object.getClass();
        int n3 = 1;
        EditText editText = new Class[n3];
        editText[0] = TextWatcher.class;
        genericDeclaration = ((Class)genericDeclaration).getMethod("addTextChangedListener", (Class<?>)editText);
        editText = object;
        editText = (EditText)object;
        String string2 = objectArray.getString("onChange");
        InflateView$8 inflateView$8 = new InflateView$8(this, (JSONObject)objectArray, string2, editText);
        objectArray = new Object[n3];
        objectArray[0] = inflateView$8;
        ((Method)genericDeclaration).invoke(object, objectArray);
    }

    private String[] substr(String string2, String string3) {
        int n3;
        String string4 = null;
        int n4 = this.indexOf(string2, string3, 0);
        if (n4 == (n3 = -1)) {
            return new String[]{string2};
        }
        string4 = string2.substring(0, n4);
        int n7 = string3.length() + n4;
        string2 = string2.substring(n7);
        return new String[]{string4, string2};
    }

    private Method tryExactMatch(Class clazz, String string2, Class[] classArray) {
        return clazz.getMethod(string2, classArray);
    }

    private Method tryMultiAgrumentDeepMatch(Class methodArray, String string2, Class[] classArray) {
        Object object = "undefined";
        boolean n3 = ((String)object).equals(string2);
        if (n3) {
            return null;
        }
        object = this.dynamicUI.getLogger();
        String string3 = LOG_TAG;
        Object object2 = new StringBuilder("tryMultiAgrumentDeepMatch reached. Beware slow function.. ");
        Object object3 = methodArray.toString();
        ((StringBuilder)object2).append((String)object3);
        object3 = " : ";
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append((String)object3);
        int n4 = classArray.length;
        ((StringBuilder)object2).append(n4);
        object2 = ((StringBuilder)object2).toString();
        object.d(string3, (String)object2);
        methodArray = methodArray.getMethods();
        int n7 = methodArray.length;
        string3 = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8;
            object2 = methodArray[i3];
            object3 = ((Method)object2).getName();
            n4 = (int)(object3.equals(string2) ? 1 : 0);
            if (n4 == 0 || (n4 = ((Class<?>[])(object3 = ((Method)object2).getParameterTypes())).length) != (n8 = classArray.length) || (n4 = (int)(this.matchTypes((Class[])(object3 = ((Method)object2).getParameterTypes()), classArray) ? 1 : 0)) == 0) continue;
            return object2;
        }
        return null;
    }

    private Method trySingleArgumentDeepMatch(Class object, String string2, Class clazz) {
        Object object2;
        int n3 = 1;
        boolean bl2 = InflateView.isWrappedPrimitiveType(clazz);
        if (bl2) {
            try {
                object2 = PRIMITIVE_TYPES;
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            object2 = object2.get(clazz);
            object2 = (Class)object2;
            Class[] classArray = new Class[n3];
            classArray[0] = object2;
            return ((Class)object).getMethod(string2, classArray);
        }
        while (true) {
            object2 = clazz.getInterfaces();
            int n4 = ((Class<?>[])object2).length;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                Class[] classArray;
                Class<?> clazz2 = object2[i3];
                try {
                    classArray = new Class[n3];
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    continue;
                }
                classArray[0] = clazz2;
                return ((Class)object).getMethod(string2, classArray);
            }
            try {
                object2 = new Class[n3];
            }
            catch (NoSuchMethodException noSuchMethodException) {
                if ((clazz = clazz.getSuperclass()) != null) continue;
                object = this.dynamicUI.getLogger();
                string2 = LOG_TAG;
                object.e(string2, "Never reach here");
                return null;
            }
            object2[0] = clazz;
            return ((Class)object).getMethod(string2, (Class<?>)object2);
            break;
        }
    }

    public Boolean containsInState(String string2) {
        return this.state.containsKey(string2);
    }

    public void convertAndStoreArray(ArrayList cloneable, Class object, String string2, boolean n3) {
        Map map2;
        int n4 = ((ArrayList)cloneable).size();
        if (n3 != 0) {
            map2 = PRIMITIVE_TYPES;
            object = (Class)map2.get(object);
        }
        if (object != null) {
            object = Array.newInstance(object, n4);
            map2 = null;
            for (n3 = 0; n3 < n4; ++n3) {
                Object e2 = ((ArrayList)cloneable).get(n3);
                Array.set(object, n3, e2);
            }
            cloneable = this.state;
            ((HashMap)cloneable).put(string2, object);
        }
    }

    public Class createPrimitiveClass(String string2) {
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 3159: {
                String string3 = "by";
                boolean bl2 = string2.equals(string3);
                if (!bl2) break;
                n3 = 8;
                break;
            }
            case 118: {
                String string4 = "v";
                boolean bl3 = string2.equals(string4);
                if (!bl3) break;
                n3 = 7;
                break;
            }
            case 115: {
                String string5 = "s";
                boolean bl4 = string2.equals(string5);
                if (!bl4) break;
                n3 = 6;
                break;
            }
            case 108: {
                String string6 = "l";
                boolean bl5 = string2.equals(string6);
                if (!bl5) break;
                n3 = 5;
                break;
            }
            case 105: {
                String string7 = "i";
                boolean bl6 = string2.equals(string7);
                if (!bl6) break;
                n3 = 4;
                break;
            }
            case 102: {
                String string8 = "f";
                boolean bl7 = string2.equals(string8);
                if (!bl7) break;
                n3 = 3;
                break;
            }
            case 100: {
                String string9 = "d";
                boolean bl8 = string2.equals(string9);
                if (!bl8) break;
                n3 = 2;
                break;
            }
            case 99: {
                String string10 = "c";
                boolean bl9 = string2.equals(string10);
                if (!bl9) break;
                n3 = 1;
                break;
            }
            case 98: {
                String string11 = "b";
                boolean bl10 = string2.equals(string11);
                if (!bl10) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return null;
            }
            case 8: {
                return Byte.TYPE;
            }
            case 7: {
                return Void.TYPE;
            }
            case 6: {
                return Short.TYPE;
            }
            case 5: {
                return Long.TYPE;
            }
            case 4: {
                return Integer.TYPE;
            }
            case 3: {
                return Float.TYPE;
            }
            case 2: {
                return Double.TYPE;
            }
            case 1: {
                return Character.TYPE;
            }
            case 0: 
        }
        return Boolean.TYPE;
    }

    public void dismissPopUp() {
        fh1_1 fh1_12 = new fh1_1(this);
        ExecutorManager.runOnMainThread(fh1_12);
    }

    public float dpToPx(float f5) {
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            f6 = this.dynamicUI.getAppContext().getResources().getDisplayMetrics().density;
            return Math.round(f5 * f6);
        }
        return 0.0f;
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

    public Pair findAnimationById(String string2) {
        HashMap hashMap = this.state;
        boolean bl2 = hashMap.containsKey(string2 = kp1_0.c("M_anim_", string2));
        if (bl2) {
            return (Pair)this.state.get(string2);
        }
        return null;
    }

    public Method findMethodWithCmd(InflateView$Cmd inflateView$Cmd) {
        Object object;
        block7: {
            object = this.functionCache;
            int n3 = object.containsKey(inflateView$Cmd);
            if (n3 != 0) {
                return (Method)this.functionCache.get(inflateView$Cmd);
            }
            object = InflateView$Cmd.access$400(inflateView$Cmd);
            String string2 = InflateView$Cmd.access$500(inflateView$Cmd);
            Object object2 = InflateView$Cmd.access$600(inflateView$Cmd);
            try {
                object = this.tryExactMatch((Class)object, string2, (Class[])object2);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                int n4;
                object = InflateView$Cmd.access$600(inflateView$Cmd);
                if (object != null && (n3 = ((Class[])(object = InflateView$Cmd.access$600(inflateView$Cmd))).length) == (n4 = 1)) {
                    object = InflateView$Cmd.access$400(inflateView$Cmd);
                    string2 = InflateView$Cmd.access$500(inflateView$Cmd);
                    object2 = InflateView$Cmd.access$600(inflateView$Cmd)[0];
                    object = this.trySingleArgumentDeepMatch((Class)object, string2, (Class)object2);
                    break block7;
                }
                object = InflateView$Cmd.access$400(inflateView$Cmd);
                string2 = InflateView$Cmd.access$500(inflateView$Cmd);
                object2 = InflateView$Cmd.access$600(inflateView$Cmd);
                object = this.tryMultiAgrumentDeepMatch((Class)object, string2, (Class[])object2);
            }
        }
        this.functionCache.put(inflateView$Cmd, object);
        return object;
    }

    public Class getClassName(String string2) {
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case -407376626: {
                String string3 = "in.juspay.mystique.AccordionLayout";
                n4 = (int)(string2.equals(string3) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 3;
                break;
            }
            case -631823565: {
                String string4 = "in.juspay.mystique.SwypeScroll";
                n4 = (int)(string2.equals(string4) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 2;
                break;
            }
            case -833865840: {
                String string5 = "in.juspay.mystique.SwypeLayout";
                n4 = (int)(string2.equals(string5) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 1;
                break;
            }
            case -1409106502: {
                String string6 = "in.juspay.mystique.BottomSheetLayout";
                n4 = (int)(string2.equals(string6) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return Class.forName(string2);
            }
            case 3: {
                return AccordionLayout.class;
            }
            case 2: {
                return SwypeScroll.class;
            }
            case 1: {
                return SwypeLayout.class;
            }
            case 0: 
        }
        return BottomSheetLayout.class;
    }

    public DynamicUI getDUI() {
        return this.dynamicUI;
    }

    public String getErrorDetails() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.currViewId;
        stringBuilder.append(string2);
        string2 = " - ";
        stringBuilder.append(string2);
        String string3 = this.currView;
        stringBuilder.append(string3);
        stringBuilder.append("-");
        string3 = this.fileOrigin;
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        string2 = this.lastCommand;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public HashMap getState() {
        return this.state;
    }

    public Object getStateValFromKey(String string2) {
        return this.state.get(string2);
    }

    public boolean getUseAppContext() {
        return this.useAppContext;
    }

    public Object getValueNew(String charSequence, String string2) {
        int n3;
        charSequence.getClass();
        int n4 = -1;
        int n7 = ((String)charSequence).hashCode();
        switch (n7) {
            default: {
                break;
            }
            case 3392903: {
                String string3 = "null";
                n3 = (int)(((String)charSequence).equals(string3) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 12;
                break;
            }
            case 3237035: {
                String string4 = "infl";
                n3 = (int)(((String)charSequence).equals(string4) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 11;
                break;
            }
            case 102230: {
                String string5 = "get";
                n3 = (int)(((String)charSequence).equals(string5) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 10;
                break;
            }
            case 99674: {
                String string6 = "dpf";
                n3 = (int)(((String)charSequence).equals(string6) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 9;
                break;
            }
            case 98855: {
                String string7 = "ctx";
                n3 = (int)(((String)charSequence).equals(string7) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 8;
                break;
            }
            case 96798: {
                String string8 = "apm";
                n3 = (int)(((String)charSequence).equals(string8) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 7;
                break;
            }
            case 3677: {
                String string9 = "sp";
                n3 = (int)(((String)charSequence).equals(string9) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 6;
                break;
            }
            case 3212: {
                String string10 = "dp";
                n3 = (int)(((String)charSequence).equals(string10) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 5;
                break;
            }
            case 108: {
                String string11 = "l";
                n3 = (int)(((String)charSequence).equals(string11) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 4;
                break;
            }
            case 105: {
                String string12 = "i";
                n3 = (int)(((String)charSequence).equals(string12) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 3;
                break;
            }
            case 102: {
                String string13 = "f";
                n3 = (int)(((String)charSequence).equals(string13) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 2;
                break;
            }
            case 98: {
                String string14 = "b";
                n3 = (int)(((String)charSequence).equals(string14) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 1;
                break;
            }
            case -891988091: {
                String string15 = "strget";
                n3 = (int)(((String)charSequence).equals(string15) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                return string2;
            }
            case 12: {
                return null;
            }
            case 11: {
                return this;
            }
            case 10: {
                return this.state.get(string2);
            }
            case 9: {
                float f5 = Float.parseFloat(string2);
                return Float.valueOf(this.dpToPx(f5));
            }
            case 8: {
                charSequence = this.dynamicUI.getActivity();
                if (charSequence != null && (n3 = (int)(this.useAppContext ? 1 : 0)) == 0) {
                    return this.dynamicUI.getActivity();
                }
                return this.dynamicUI.getAppContext();
            }
            case 7: {
                return this.dynamicUI.getApplicationManager();
            }
            case 6: {
                float f6 = Float.parseFloat(string2);
                float f7 = this.dynamicUI.getAppContext().getResources().getDisplayMetrics().scaledDensity;
                return Float.valueOf(f6 * f7);
            }
            case 5: {
                n3 = Integer.parseInt(string2);
                return this.dpToPx(n3);
            }
            case 4: {
                return Long.parseLong(string2);
            }
            case 3: {
                return Integer.parseInt(string2);
            }
            case 2: {
                return Float.valueOf(Float.parseFloat(string2));
            }
            case 1: {
                return Boolean.parseBoolean(string2);
            }
            case 0: 
        }
        charSequence = new StringBuilder();
        string2 = this.state.get(string2);
        ((StringBuilder)charSequence).append((Object)string2);
        ((StringBuilder)charSequence).append("");
        return ((StringBuilder)charSequence).toString();
    }

    public void handleAnimation(Object object, JSONArray jSONArray) {
        int n3;
        int n4;
        InflateView inflateView = this;
        Object object2 = object;
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); i3 += n4) {
            ObjectAnimator objectAnimator;
            Object object3;
            float f5;
            int n7;
            int n8;
            Object object4 = jSONArray.getJSONObject(i3);
            String string2 = object4.getString("props");
            Object object5 = new JSONArray(string2);
            string2 = "id";
            boolean bl2 = object4.has(string2);
            String string3 = "";
            string2 = bl2 ? object4.getString(string2) : string3;
            String string4 = "onEnd";
            int n10 = object4.has(string4);
            if (n10 != 0) {
                string3 = object4.getString(string4);
            }
            n10 = object5.length();
            Object object6 = new PropertyValuesHolder[n10];
            String string5 = null;
            for (int i8 = 0; i8 < (n7 = object5.length()); i8 += n8) {
                Object object7 = object5.getJSONObject(i8);
                String string6 = "from";
                double d2 = object7.getDouble(string6);
                float f6 = (float)d2;
                double d5 = object7.getDouble("to");
                f5 = (float)d5;
                object3 = object7.getString("prop");
                n7 = 2;
                object7 = new float[n7];
                object7[0] = (JSONObject)f6;
                n8 = 1;
                f6 = Float.MIN_VALUE;
                object7[n8] = (JSONObject)f5;
                objectAnimator = PropertyValuesHolder.ofFloat((String)object3, (float[])object7);
                object6[i8] = objectAnimator;
            }
            objectAnimator = inflateView.getAnimator(object2, (PropertyValuesHolder[])object6, (JSONObject)object4);
            object5 = object2;
            int n14 = ((View)object2).getId();
            object5 = n14;
            object3 = new Pair(object5, (Object)objectAnimator);
            object5 = inflateView.state;
            string5 = "M_anim_";
            object6 = new StringBuilder(string5);
            ((StringBuilder)object6).append(string2);
            string2 = ((StringBuilder)object6).toString();
            ((HashMap)object5).put(string2, object3);
            boolean bl3 = object4.has(string4);
            if (bl3) {
                object3 = kp1_0.c(string5, string3);
                object4 = new InflateView$6(inflateView, (String)object3, objectAnimator);
                objectAnimator.addListener((Animator.AnimatorListener)object4);
            }
            n4 = 1;
            f5 = Float.MIN_VALUE;
        }
    }

    public boolean matchTypes(Class[] classArray, Class[] classArray2) {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = classArray.length); i3 += n4) {
            Class clazz;
            Object object = classArray2[i3];
            if (object == null || (object = classArray[i3]) == null || (n3 = (int)(object.equals(clazz = Object.class) ? 1 : 0)) != 0 && (n3 = (int)(((Class)(object = classArray2[i3])).isPrimitive() ? 1 : 0)) == 0 || (n3 = (int)((object = classArray[i3]).equals(clazz = classArray2[i3]) ? 1 : 0)) != 0) continue;
            object = classArray[i3];
            n3 = (int)(((Class)object).isPrimitive() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(((Class)(object = classArray2[i3])).isArray() ? 1 : 0)) == 0) {
                object = classArray2[i3];
                clazz = "TYPE";
                object = ((Class)object).getField((String)((Object)clazz));
                clazz = null;
                object = ((Field)object).get(null);
                object = (Class)object;
                if (object == null) continue;
                clazz = classArray[i3];
                try {
                    n3 = (int)(object.equals(clazz) ? 1 : 0);
                    if (n3 != 0) continue;
                    return false;
                }
                catch (Exception exception) {
                    return n4 != 0;
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    return false;
                }
            }
            object = classArray[i3];
            clazz = ClassLoader.class;
            n3 = (int)(object.equals(clazz) ? 1 : 0);
            if (n3 != 0) {
                object = classArray2[i3].getName();
                n3 = (int)(((String)object).equals(clazz = "dalvik.system.PathClassLoader") ? 1 : 0);
                if (n3 == 0) continue;
                return n4 != 0;
            }
            object = classArray[i3];
            clazz = classArray2[i3];
            n3 = (int)(object.equals(clazz) ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(((Class)(object = classArray[i3])).isAssignableFrom(clazz = classArray2[i3]) ? 1 : 0)) != 0) continue;
            return false;
        }
        return n4 != 0;
    }

    public Object parseAndRunPipe(Object object, String stringArray, boolean bl2) {
        Pattern pattern = COMMAND_SPLIT;
        stringArray = pattern.split((CharSequence)stringArray);
        int n3 = stringArray.length;
        Object object2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Object object3 = stringArray[i3];
            Object object4 = "";
            boolean bl3 = object3.equals(object4);
            if (bl3) continue;
            object4 = SETTER_EQUALS;
            int n7 = this.indexOf((String)object3, (String)object4, 0);
            if (n7 != (n4 = -1)) {
                object3 = this.substr((String)object3, (String)object4);
                object4 = object3[0];
                object4 = this.substr((String)object4, ARG_TYPE_SPLIT);
                n7 = 1;
                object4 = object4[n7];
                object3 = object3[n7];
                object3 = this.runCommand(object, object2, (String)object3, bl2);
                this.state.put(object4, object3);
                DuiLogger duiLogger = this.dynamicUI.getLogger();
                String string2 = LOG_TAG;
                String string3 = "setting ";
                StringBuilder stringBuilder = new StringBuilder(string3);
                stringBuilder.append((String)object4);
                object4 = " to ";
                stringBuilder.append((String)object4);
                stringBuilder.append(object3);
                object3 = stringBuilder.toString();
                duiLogger.d(string2, (String)object3);
                continue;
            }
            object2 = this.runCommand(object, object2, (String)object3, bl2);
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void parseKeys(String var1_1, JSONObject var2_2, Object var3_3, boolean var4_4) {
        block67: {
            block68: {
                block73: {
                    block66: {
                        block72: {
                            block71: {
                                block65: {
                                    block70: {
                                        block69: {
                                            block64: {
                                                block63: {
                                                    var5_5 = this;
                                                    var6_6 = var1_1;
                                                    var7_7 /* !! */  = var2_2;
                                                    var8_8 = var3_3;
                                                    var9_9 = "secureEdit";
                                                    var10_10 = "feedback";
                                                    var11_11 = "', '";
                                                    var12_12 = "javascript:window.callUICallback('";
                                                    var13_13 = "onDateChange";
                                                    var14_14 = "onScrollStateChange";
                                                    var15_15 = "onScroll";
                                                    var16_20 = "onTouch";
                                                    var17_21 = "onClick";
                                                    var18_22 = "onSwipe";
                                                    var19_23 = "source";
                                                    var20_24 = "popupMenu";
                                                    var21_25 = "onLongPress";
                                                    var22_26 = "onSeekBarChanged";
                                                    var23_27 = "onKeyUp";
                                                    var24_28 = "animation";
                                                    var25_29 = "inputFilter";
                                                    var26_30 = "afterRender";
                                                    var27_31 = "pattern";
                                                    var28_32 = "id";
                                                    var29_33 /* !! */  = "listItem";
                                                    var30_34 = "onFocus";
                                                    var31_35 = "onItemClick";
                                                    var32_36 = "Exception occured  :";
                                                    var33_37 = "Exception occured in onScroll:";
                                                    var34_38 = "onRefresh";
                                                    var35_39 = "android.resource://";
                                                    var36_40 = "Exception occured in onScrollStateChange :";
                                                    var37_41 /* !! */  = "inlineAnimation";
                                                    var38_42 = var37_41 /* !! */ .equals(var1_1);
                                                    if (var38_42 != 0) {
                                                        var37_41 /* !! */  = Thread.currentThread();
                                                        var37_41 /* !! */  = var37_41 /* !! */ .getName();
                                                        var39_43 = var14_14;
                                                        var14_14 = "PreRenderThread";
                                                        var40_44 = var37_41 /* !! */ .equals(var14_14);
                                                        if (var40_44 == 0) {
                                                            var15_15 = this.animationHolder;
                                                            var21_25 = var2_2.getString(var1_1);
                                                            var19_23 = new JSONArray((String)var21_25);
                                                            var15_15.applyAnimation(var3_3, (JSONArray)var19_23, (JSONObject)var2_2);
                                                            return;
                                                        }
                                                    } else {
                                                        var39_43 = var14_14;
                                                    }
                                                    if ((var40_44 = (var14_14 = "lottieAnimation").equals(var6_6)) != 0) {
                                                        var15_15 = var5_5.lottieAnimation;
                                                        if (var15_15 == null) return;
                                                        var21_25 = var7_7 /* !! */ .getString((String)var6_6);
                                                        var19_23 = new JSONArray((String)var21_25);
                                                        var15_15.applyAnimation(var8_8, (JSONArray)var19_23);
                                                        return;
                                                    }
                                                    var40_44 = var29_33 /* !! */ .equals(var6_6);
                                                    var37_41 /* !! */  = "Missing Activity";
                                                    var41_45 = var33_37;
                                                    var33_37 = "listData";
                                                    if (var40_44 == 0 || (var40_44 = var7_7 /* !! */ .has(var33_37)) == 0) ** GOTO lbl96
                                                    var15_15 = var5_5.dynamicUI;
                                                    if ((var15_15 = var15_15.getActivity()) != null) break block63;
                                                    var15_15 = var5_5.dynamicUI;
                                                    var15_15 = var15_15.getLogger();
                                                    var19_23 = "listData, it is not  activity, it is applicationContext";
                                                    var15_15.e((String)var37_41 /* !! */ , (String)var19_23);
                                                    return;
                                                }
                                                var42_46 = var8_8 instanceof ListView;
                                                if (var42_46 == false) return;
                                                var15_15 = var8_8;
                                                var15_15 = (ListView)var8_8;
                                                var43_49 = false;
                                                var19_23 = null;
                                                var15_15.setDivider(null);
                                                var19_23 = var5_5.dynamicUI;
                                                var19_23 = var19_23.getAndroidInterface();
                                                var44_51 = var19_23.getRenderer();
                                                var21_25 = var7_7 /* !! */ .getString((String)var29_33 /* !! */ );
                                                var19_23 = new JSONObject((String)var21_25);
                                                var23_27 = var7_7 /* !! */ .getString(var33_37);
                                                var21_25 = new JSONArray((String)var23_27);
                                                var23_27 = "itemView";
                                                var9_9 = var19_23.getJSONObject((String)var23_27);
                                                var23_27 = "holderViews";
                                                var45_52 = var19_23.getJSONArray((String)var23_27);
                                                var23_27 = var5_5.dynamicUI;
                                                var35_39 = var23_27.getActivity();
                                                var23_27 = var5_5.duiCallback;
                                                var37_41 /* !! */  = var19_23;
                                                var19_23 = new in.juspay.hypersdk.mystique.ListAdapter((Context)var35_39, var44_51, (JSONObject)var9_9, var45_52, (JSONArray)var21_25, (DuiCallback)var23_27);
                                                var15_15.setAdapter((ListAdapter)var19_23);
                                                return;
lbl96:
                                                // 1 sources

                                                var46_53 = var33_37.equals(var6_6);
                                                if (!var46_53) ** GOTO lbl114
                                                var42_47 = var8_8 instanceof ListView;
                                                if (var42_47 == false) return;
                                                var15_15 = var8_8;
                                                var15_15 = (ListView)var8_8;
                                                var21_25 = var7_7 /* !! */ .getString(var33_37);
                                                var19_23 = new JSONArray((String)var21_25);
                                                var21_25 = var15_15.getAdapter();
                                                var47_54 = var21_25 instanceof in.juspay.hypersdk.mystique.ListAdapter;
                                                if (var47_54 == false) return;
                                                var15_15 = var15_15.getAdapter();
                                                var15_15 = (in.juspay.hypersdk.mystique.ListAdapter)var15_15;
                                                var15_15.updateRowData((JSONArray)var19_23);
                                                var15_15.notifyDataSetChanged();
                                                return;
lbl114:
                                                // 1 sources

                                                var46_53 = var6_6.equals(var27_31);
                                                var14_14 = InputFilter[].class;
                                                var33_37 = "setFilters";
                                                var48_56 = var37_41 /* !! */ ;
                                                var37_41 /* !! */  = ",";
                                                if (var46_53) {
                                                    var29_33 /* !! */  = var3_3.getClass();
                                                    var49_57 = var15_15;
                                                    var50_58 = var17_21;
                                                    var51_59 = 1;
                                                    var15_15 = new Class[var51_59];
                                                    var51_59 = 0;
                                                    var17_21 = null;
                                                    var15_15[0] = var14_14;
                                                    var15_15 = var29_33 /* !! */ .getMethod(var33_37, (Class<?>)var15_15);
                                                    var27_31 = var7_7 /* !! */ .getString((String)var27_31);
                                                    var27_31 = var27_31.split((String)var37_41 /* !! */ );
                                                    var29_33 /* !! */  = var27_31[0];
                                                    var51_59 = ((String[])var27_31).length;
                                                    var52_60 /* !! */  = var37_41 /* !! */ ;
                                                    var38_42 = 1;
                                                    if (var51_59 == var38_42) {
                                                        var53_61 = 10000 != 0;
                                                    } else {
                                                        var27_31 = var27_31[var38_42];
                                                        var27_31 = var27_31.trim();
                                                        var53_61 = Integer.parseInt((String)var27_31);
                                                    }
                                                    var17_21 = new gh1_2((String)var29_33 /* !! */ );
                                                    var29_33 /* !! */  = new InputFilter.LengthFilter((int)var53_61);
                                                    var53_61 = 2 != 0;
                                                    var37_41 /* !! */  = new InputFilter[var53_61];
                                                    var53_61 = false;
                                                    var27_31 = null;
                                                    var37_41 /* !! */ [0] = var17_21;
                                                    var51_59 = 1;
                                                    var37_41 /* !! */ [var51_59] = var29_33 /* !! */ ;
                                                    var29_33 /* !! */  = new Object[var51_59];
                                                    var29_33 /* !! */ [0] = var37_41 /* !! */ ;
                                                    var15_15.invoke(var8_8, var29_33 /* !! */ );
                                                } else {
                                                    var49_57 = var15_15;
                                                    var50_58 = var17_21;
                                                    var52_60 /* !! */  = var37_41 /* !! */ ;
                                                }
                                                var42_48 = var6_6.equals(var25_29);
                                                if (var42_48) {
                                                    var15_15 = var3_3.getClass();
                                                    var53_61 = true;
                                                    var29_33 /* !! */  = new Class[var53_61];
                                                    var53_61 = false;
                                                    var27_31 = null;
                                                    var29_33 /* !! */ [0] = var14_14;
                                                    var15_15 = var15_15.getMethod(var33_37, (Class<?>[])var29_33 /* !! */ );
                                                    var25_29 = var7_7 /* !! */ .getString((String)var25_29);
                                                    var27_31 = new hh1_2((String)var25_29);
                                                    var54_62 = true;
                                                    var29_33 /* !! */  = new InputFilter[var54_62];
                                                    var40_44 = 0;
                                                    var14_14 = null;
                                                    var29_33 /* !! */ [0] = var27_31;
                                                    var27_31 = new Object[var54_62];
                                                    var27_31[0] = var29_33 /* !! */ ;
                                                    var15_15.invoke(var8_8, (Object[])var27_31);
                                                }
                                                if (var42_48 = var6_6.equals(var23_27)) {
                                                    var15_15 = var7_7 /* !! */ .getString((String)var23_27);
                                                    var23_27 = var3_3.getClass();
                                                    var25_29 = "setOnKeyListener";
                                                    var53_61 = true;
                                                    var29_33 /* !! */  = new Class[var53_61];
                                                    var27_31 = View.OnKeyListener.class;
                                                    var40_44 = 0;
                                                    var14_14 = null;
                                                    var29_33 /* !! */ [0] = var27_31;
                                                    var23_27 = var23_27.getMethod((String)var25_29, (Class<?>[])var29_33 /* !! */ );
                                                    var25_29 = new ih1_2(var5_5, (String)var15_15);
                                                    var53_61 = true;
                                                    var15_15 = new Object[var53_61];
                                                    var15_15[0] = var25_29;
                                                    var23_27.invoke(var8_8, (Object[])var15_15);
                                                }
                                                if (!(var42_48 = var6_6.equals(var21_25))) break block64;
                                                var15_15 = var7_7 /* !! */ .getString((String)var21_25);
                                                var21_25 = var3_3.getClass();
                                                var23_27 = "setOnLongClickListener";
                                                var54_62 = true;
                                                var27_31 = new Class[var54_62];
                                                var25_29 = View.OnLongClickListener.class;
                                                var46_53 = false;
                                                var29_33 /* !! */  = null;
                                                var27_31[0] = var25_29;
                                                var21_25 = var21_25.getMethod((String)var23_27, (Class<?>)var27_31);
                                                var23_27 = new jh1_2(var5_5, (String)var15_15);
                                                var54_62 = true;
                                                var15_15 = new Object[var54_62];
                                                var15_15[0] = var23_27;
                                                var21_25.invoke(var8_8, (Object[])var15_15);
                                            }
                                            if (!(var42_48 = var6_6.equals(var19_23)) || !(var42_48 = var8_8 instanceof TextureView)) ** GOTO lbl248
                                            var15_15 = var8_8;
                                            var15_15 = (TextureView)var8_8;
                                            var21_25 = var5_5.dynamicUI;
                                            var25_29 = var21_25.getAppContext();
                                            var21_25 = var25_29.getPackageName();
                                            var19_23 = var7_7 /* !! */ .getString((String)var19_23);
                                            var23_27 = var25_29.getResources();
                                            var27_31 = "raw";
                                            var43_50 = var23_27.getIdentifier(var19_23, (String)var27_31, (String)var21_25);
                                            var23_27 = new StringBuilder(var35_39);
                                            var23_27.append((String)var21_25);
                                            var21_25 = "/raw/";
                                            var23_27.append((String)var21_25);
                                            var23_27.append(var43_50);
                                            var19_23 = var23_27.toString();
                                            var27_31 = Uri.parse((String)var19_23);
                                            var23_27 = new MediaPlayer();
                                            var17_21 = var18_22;
                                            var19_23 = var14_14;
                                            var33_37 = var20_24;
                                            var21_25 = this;
                                            var37_41 /* !! */  = var22_26;
                                            var35_39 = var24_28;
                                            var29_33 /* !! */  = var26_30;
                                            var55_63 = var26_30;
                                            var56_64 = var28_32;
                                            var29_33 /* !! */  = var2_2;
                                            var14_14 = new InflateView$2(this, (MediaPlayer)var23_27, (Context)var25_29, (Uri)var27_31, (JSONObject)var2_2);
                                            var15_15.setSurfaceTextureListener((TextureView.SurfaceTextureListener)var14_14);
                                            break block69;
lbl248:
                                            // 1 sources

                                            var17_21 = var18_22;
                                            var33_37 = var20_24;
                                            var37_41 /* !! */  = var22_26;
                                            var35_39 = var24_28;
                                            var55_63 = var26_30;
                                            var56_64 = var28_32;
                                        }
                                        var15_15 = var50_58;
                                        var43_50 = var6_6.equals(var50_58);
                                        if (var43_50 != 0) {
                                            var15_15 = var7_7 /* !! */ .getString(var50_58);
                                            var19_23 = var3_3.getClass();
                                            var21_25 = "setOnClickListener";
                                            var57_65 = true;
                                            var25_29 = new Class[var57_65];
                                            var23_27 = View.OnClickListener.class;
                                            var53_61 = false;
                                            var27_31 = null;
                                            var25_29[0] = var23_27;
                                            var19_23 = var19_23.getMethod((String)var21_25, (Class<?>)var25_29);
                                            var21_25 = new kh1_2(var5_5, (Serializable)var15_15, 0);
                                            var57_65 = true;
                                            var15_15 = new Object[var57_65];
                                            var15_15[0] = var21_25;
                                            var19_23.invoke(var8_8, (Object[])var15_15);
                                        }
                                        var15_15 = var49_57;
                                        var43_50 = var6_6.equals(var49_57);
                                        if (var43_50 == 0) ** GOTO lbl316
                                        try {
                                            var15_15 = var7_7 /* !! */ .getString((String)var49_57);
                                        }
                                        catch (Exception var15_17) {}
                                        var43_50 = var8_8 instanceof ListView;
                                        if (var43_50 == 0) ** GOTO lbl316
                                        var19_23 = var8_8;
                                        var19_23 = (ListView)var8_8;
                                        var19_23 = var19_23.getTag();
                                        var43_50 = var19_23 instanceof OnScroll;
                                        if (var43_50 == 0) break block70;
                                        var19_23 = var8_8;
                                        var19_23 = (ListView)var8_8;
                                        var19_23 = var19_23.getTag();
                                        var19_23 = (OnScroll)var19_23;
                                        break block65;
                                        break block71;
                                    }
                                    var21_25 = var5_5.duiCallback;
                                    var19_23 = new OnScroll((DuiCallback)var21_25);
                                }
                                var19_23.setScrollCallback((String)var15_15);
                                var15_15 = var8_8;
                                var15_15 = (ListView)var8_8;
                                var15_15.setOnScrollListener((AbsListView.OnScrollListener)var19_23);
                                var15_15 = var8_8;
                                var15_15 = (ListView)var8_8;
                                var15_15.setTag(var19_23);
                                ** GOTO lbl316
                            }
                            var19_23 = System.out;
                            var23_27 = var41_45;
                            var21_25 = new StringBuilder(var41_45);
                            var21_25.append(var15_17);
                            var15_15 = var21_25.toString();
                            var19_23.println((String)var15_15);
lbl316:
                            // 4 sources

                            var19_23 = var39_43;
                            var42_48 = var6_6.equals(var39_43);
                            if (!var42_48) ** GOTO lbl358
                            try {
                                var15_15 = var7_7 /* !! */ .getString(var39_43);
                            }
                            catch (Exception var15_18) {}
                            var43_50 = var8_8 instanceof ListView;
                            if (var43_50 == 0) ** GOTO lbl358
                            var19_23 = var8_8;
                            var19_23 = (ListView)var8_8;
                            var19_23 = var19_23.getTag();
                            var43_50 = var19_23 instanceof OnScroll;
                            if (var43_50 == 0) break block72;
                            var19_23 = var8_8;
                            var19_23 = (ListView)var8_8;
                            var19_23 = var19_23.getTag();
                            var19_23 = (OnScroll)var19_23;
                            break block66;
                            break block73;
                        }
                        var21_25 = var5_5.duiCallback;
                        var19_23 = new OnScroll((DuiCallback)var21_25);
                    }
                    var19_23.setScrollChangeCallback((String)var15_15);
                    var15_15 = var8_8;
                    var15_15 = (ListView)var8_8;
                    var15_15.setOnScrollListener((AbsListView.OnScrollListener)var19_23);
                    var15_15 = var8_8;
                    var15_15 = (ListView)var8_8;
                    var15_15.setTag(var19_23);
                    ** GOTO lbl358
                }
                var19_23 = System.out;
                var23_27 = var36_40;
                var21_25 = new StringBuilder(var36_40);
                var21_25.append(var15_18);
                var15_15 = var21_25.toString();
                var19_23.println((String)var15_15);
lbl358:
                // 4 sources

                var19_23 = var34_38;
                var42_48 = var6_6.equals(var34_38);
                if (!var42_48) ** GOTO lbl389
                {
                    catch (Exception var15_16) {}
                }
                try {
                    var15_15 = var7_7 /* !! */ .getString(var34_38);
                    var19_23 = var3_3.getClass();
                    var21_25 = "setOnRefreshListener";
                    var57_65 = true;
                    var25_29 = new Class[var57_65];
                    var23_27 = SwipeRefreshLayout$f.class;
                    var53_61 = false;
                    var27_31 = null;
                    var25_29[0] = var23_27;
                    var19_23 = var19_23.getMethod((String)var21_25, (Class<?>)var25_29);
                    var21_25 = new lh1_2(var5_5, (String)var15_15);
                    var57_65 = true;
                    var15_15 = new Object[var57_65];
                    var15_15[0] = var21_25;
                    var19_23.invoke(var8_8, (Object[])var15_15);
                    ** GOTO lbl389
                }
                catch (Exception var15_19) {
                    var19_23 = System.out;
                    var23_27 = var32_36;
                    var21_25 = new StringBuilder(var32_36);
                    var21_25.append(var15_19);
                    var15_15 = var21_25.toString();
                    var19_23.println((String)var15_15);
lbl389:
                    // 3 sources

                    var19_23 = var31_35;
                    var42_48 = var6_6.equals(var31_35);
                    if (!var42_48) ** GOTO lbl401
                    var42_48 = var8_8 instanceof ListView;
                    if (!var42_48) {
                        return;
                    }
                    var15_15 = var8_8;
                    var15_15 = (ListView)var8_8;
                    var19_23 = var7_7 /* !! */ .getString(var31_35);
                    var21_25 = new mh1_2(var5_5, (String)var19_23);
                    var15_15.setOnItemClickListener((AdapterView.OnItemClickListener)var21_25);
lbl401:
                    // 2 sources

                    if (var42_48 = var6_6.equals(var15_15 = "onChange")) {
                        var15_15 = "separator";
                        var42_48 = var7_7 /* !! */ .has((String)var15_15);
                        if (var42_48) {
                            var5_5.separatorTextChange((JSONObject)var7_7 /* !! */ , var8_8);
                        } else {
                            var5_5.normalTextChange((JSONObject)var7_7 /* !! */ , var8_8);
                        }
                    }
                    var19_23 = var30_34;
                    var42_48 = var6_6.equals(var30_34);
                    if (var42_48) {
                        var15_15 = var3_3.getClass();
                        var21_25 = "setOnFocusChangeListener";
                        var57_65 = true;
                        var25_29 = new Class[var57_65];
                        var23_27 = View.OnFocusChangeListener.class;
                        var53_61 = false;
                        var27_31 = null;
                        var25_29[0] = var23_27;
                        var15_15 = var15_15.getMethod((String)var21_25, (Class<?>)var25_29);
                        var19_23 = var7_7 /* !! */ .getString(var30_34);
                        var21_25 = new nh1_2(var5_5, (String)var19_23);
                        var43_50 = 1;
                        var23_27 = new Object[var43_50];
                        var43_50 = 0;
                        var19_23 = null;
                        var23_27[0] = var21_25;
                        var15_15.invoke(var8_8, (Object[])var23_27);
                    }
                    var19_23 = var16_20;
                    var42_48 = var6_6.equals(var16_20);
                    var21_25 = View.OnTouchListener.class;
                    var23_27 = "setOnTouchListener";
                    if (var42_48) {
                        var15_15 = var7_7 /* !! */ .getString(var16_20);
                        var19_23 = var3_3.getClass();
                        var54_62 = true;
                        var27_31 = new Class[var54_62];
                        var46_53 = false;
                        var29_33 /* !! */  = null;
                        var27_31[0] = var21_25;
                        var19_23 = var19_23.getMethod((String)var23_27, (Class<?>)var27_31);
                        var27_31 = new InflateView$3(var5_5, (String)var15_15);
                        var15_15 = new Object[var54_62];
                        var15_15[0] = var27_31;
                        var19_23.invoke(var8_8, (Object[])var15_15);
                    }
                    var19_23 = var13_13;
                    var42_48 = var6_6.equals(var13_13);
                    if (var42_48) {
                        var15_15 = var7_7 /* !! */ .getString(var13_13);
                        var19_23 = var3_3.getClass();
                        var25_29 = "setOnDateChangeListener";
                        var53_61 = true;
                        var29_33 /* !! */  = new Class[var53_61];
                        var27_31 = CalendarView.OnDateChangeListener.class;
                        var40_44 = 0;
                        var14_14 = null;
                        var29_33 /* !! */ [0] = var27_31;
                        var19_23 = var19_23.getMethod((String)var25_29, (Class<?>[])var29_33 /* !! */ );
                        var25_29 = new dh1_2(var5_5, (String)var15_15);
                        var53_61 = true;
                        var15_15 = new Object[var53_61];
                        var15_15[0] = var25_29;
                        var19_23.invoke(var8_8, (Object[])var15_15);
                    }
                    if (var42_48 = var6_6.equals(var17_21)) {
                        var15_15 = var7_7 /* !! */ .getString((String)var17_21);
                        var19_23 = var3_3.getClass();
                        var54_62 = true;
                        var27_31 = new Class[var54_62];
                        var46_53 = false;
                        var29_33 /* !! */  = null;
                        var27_31[0] = var21_25;
                        var19_23 = var19_23.getMethod((String)var23_27, (Class<?>)var27_31);
                        var21_25 = new InflateView$4(var5_5, (String)var15_15);
                        var15_15 = new Object[var54_62];
                        var15_15[0] = var21_25;
                        var19_23.invoke(var8_8, (Object[])var15_15);
                    }
                    if (!(var42_48 = var6_6.equals(var33_37))) break block67;
                    var15_15 = var5_5.dynamicUI;
                    if ((var15_15 = var15_15.getActivity()) == null) {
                        var15_15 = var5_5.dynamicUI;
                        var15_15 = var15_15.getLogger();
                        var19_23 = "popupMenu, it is not  activity, it is applicationContext";
                        var21_25 = var48_56;
                        var15_15.e((String)var48_56, (String)var19_23);
                        return;
                    }
                    var15_15 = var7_7 /* !! */ .getString(var33_37);
                    var19_23 = InflateView.FUNCTION_ARG_SPLIT_ESCAPE;
                    var19_23 = var19_23.toString();
                    var15_15 = var15_15.split((String)var19_23);
                    var19_23 = "onMenuItemClick";
                    var19_23 = var7_7 /* !! */ .getString((String)var19_23);
                    var23_27 = var5_5.dynamicUI;
                    var23_27 = var23_27.getActivity();
                    var25_29 = var8_8;
                    var25_29 = (View)var8_8;
                    var21_25 = new PopupMenu((Context)var23_27, (View)var25_29);
                    var5_5.popUpMenu = var21_25;
                    var17_21 = null;
                    break block68;
                }
                var19_23 = var5_5.dynamicUI.getErrorCallback();
                var21_25 = new StringBuilder(" excep: fn__parseKeys  - ");
                var23_27 = this.getErrorDetails();
                var21_25.append((String)var23_27);
                var21_25 = var21_25.toString();
                var23_27 = "WARNING";
                var19_23.onException((String)var23_27, (String)var21_25, var15_16);
                return;
            }
            for (var51_59 = 0; var51_59 < (var47_55 = ((Object)var15_15).length); var21_25 = var21_25.getMenu(), var51_59 += var47_55) {
                var21_25 = var15_15[var51_59];
                var23_27 = "\\";
                var47_55 = (int)var21_25.contains((CharSequence)var23_27);
                if (var47_55 != 0) {
                    var21_25 = var15_15[var51_59];
                    var23_27 = var52_60 /* !! */ ;
                    var47_55 = (int)var21_25.contains((CharSequence)var52_60 /* !! */ );
                    if (var47_55 != 0) {
                        var21_25 = var15_15[var51_59];
                        var25_29 = "\\\\,";
                        var15_15[var51_59] = var21_25 = var21_25.replace((CharSequence)var25_29, (CharSequence)var52_60 /* !! */ );
                    }
                } else {
                    var23_27 = var52_60 /* !! */ ;
                }
                var21_25 = var5_5.popUpMenu;
                var25_29 = var15_15[var51_59];
                var53_61 = false;
                var27_31 = null;
                var21_25.add(0, var51_59, 0, (CharSequence)var25_29);
                var47_55 = 1;
                var52_60 /* !! */  = var23_27;
            }
            var15_15 = var5_5.popUpMenu;
            var21_25 = new eh1_1(var5_5, (String)var19_23);
            var15_15.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener)var21_25);
            var15_15 = var5_5.popUpMenu;
            var19_23 = var8_8;
            var19_23 = (View)var8_8;
            var57_65 = 2 != 0;
            var21_25 = new ro_1(var15_15, (int)var57_65);
            var19_23.setOnClickListener((View.OnClickListener)var21_25);
        }
        if (var42_48 = var6_6.equals(var37_41 /* !! */ )) {
            var15_15 = var7_7 /* !! */ .getString((String)var37_41 /* !! */ );
            var19_23 = var3_3.getClass();
            var21_25 = "setOnSeekBarChangeListener";
            var57_65 = true;
            var25_29 = new Class[var57_65];
            var23_27 = SeekBar.OnSeekBarChangeListener.class;
            var51_59 = 0;
            var17_21 = null;
            var25_29[0] = var23_27;
            var19_23 = var19_23.getMethod((String)var21_25, (Class<?>)var25_29);
            var21_25 = new InflateView$5(var5_5, (String)var15_15);
            var57_65 = true;
            var15_15 = new Object[var57_65];
            var15_15[0] = var21_25;
            var19_23.invoke(var8_8, (Object[])var15_15);
        } else {
            var51_59 = 0;
            var17_21 = null;
        }
        var15_15 = "runInUI";
        var42_48 = var6_6.equals(var15_15);
        if (var42_48) {
            var15_15 = var7_7 /* !! */ .getString((String)var6_6);
            var43_50 = (int)var4_4;
            var15_15 = var5_5.parseAndRunPipe(var8_8, (String)var15_15, var4_4);
        } else {
            var15_15 = var8_8;
        }
        var19_23 = "onStateChanged";
        var43_50 = (int)var19_23.equals(var6_6);
        if (var43_50 != 0 && (var43_50 = var15_15 instanceof BottomSheetLayout) != 0) {
            var19_23 = var15_15;
            {
                var19_23 = (BottomSheetLayout)var15_15;
                var21_25 = var5_5.duiCallback;
                var23_27 = var7_7 /* !! */ .getString((String)var6_6);
                var19_23.setStateChangeCallback((DuiCallback)var21_25, (String)var23_27);
            }
        }
        if ((var43_50 = (int)(var19_23 = "onSlide").equals(var6_6)) == 0 || (var43_50 = var15_15 instanceof BottomSheetLayout) == 0) ** GOTO lbl588
        var19_23 = var15_15;
        {
            var19_23 = (BottomSheetLayout)var15_15;
            var21_25 = var5_5.duiCallback;
            var23_27 = var7_7 /* !! */ .getString((String)var6_6);
            var19_23.setSlideCallback((DuiCallback)var21_25, (String)var23_27);
lbl588:
            // 2 sources

            if ((var43_50 = (int)var6_6.equals(var35_39)) != 0) {
                var21_25 = var7_7 /* !! */ .getString(var35_39);
                var19_23 = new JSONArray((String)var21_25);
                var5_5.handleAnimation(var15_15, (JSONArray)var19_23);
            }
            var19_23 = var55_63;
            var47_55 = var6_6.equals(var55_63);
            if (var47_55 != 0) {
                var21_25 = var56_64;
                var23_27 = var7_7 /* !! */ .getString(var56_64);
                var25_29 = new StringBuilder();
                var27_31 = var12_12;
                var25_29.append(var12_12);
                var19_23 = var7_7 /* !! */ .getString(var55_63);
                var25_29.append((String)var19_23);
                var19_23 = var11_11;
                var25_29.append(var11_11);
                var25_29.append((String)var23_27);
                var23_27 = "');";
                var25_29.append((String)var23_27);
                var23_27 = var25_29.toString();
                var25_29 = var5_5.dynamicUI;
                var25_29.addJsToWebView((String)var23_27);
            } else {
                var19_23 = var11_11;
                var27_31 = var12_12;
                var21_25 = var56_64;
            }
            var23_27 = var10_10;
            var54_62 = var6_6.equals(var10_10);
            if (var54_62) {
                var21_25 = var7_7 /* !! */ .getString((String)var21_25);
                var25_29 = new StringBuilder();
                var25_29.append((String)var27_31);
                var23_27 = var7_7 /* !! */ .getString(var10_10);
                var25_29.append((String)var23_27);
                var25_29.append((String)var19_23);
                var25_29.append((String)var21_25);
                var19_23 = "', 'feedback');";
                var25_29.append((String)var19_23);
                var19_23 = var25_29.toString();
                var21_25 = var5_5.dynamicUI;
                var21_25.addJsToWebView((String)var19_23);
            }
            var19_23 = var9_9;
            var47_55 = (int)var6_6.equals(var9_9);
            if (var47_55 == 0) return;
        }
        var47_55 = var15_15 instanceof EditText;
        if (var47_55 == 0) return;
        {
            var19_23 = var7_7 /* !! */ .getString(var9_9);
            var21_25 = new JSONArray((String)var19_23);
            var43_50 = 0;
            var19_23 = null;
            var57_65 = false;
            var23_27 = null;
            var54_62 = false;
            var25_29 = null;
            var53_61 = false;
            var27_31 = null;
            var46_53 = false;
            var29_33 /* !! */  = null;
            while (true) {
                block80: {
                    block78: {
                        block79: {
                            block77: {
                                block74: {
                                    block75: {
                                        block76: {
                                            if (var43_50 >= (var58_66 = var21_25.length())) {
                                                var15_15 = (EditText)var15_15;
                                                var19_23 = new SecureActionCallback(var57_65, var54_62, var53_61, var46_53);
                                                var15_15.setCustomSelectionActionModeCallback((ActionMode.Callback)var19_23);
                                                return;
                                            }
                                            var6_6 = var21_25.get(var43_50);
                                            var59_67 = (var6_6 = var6_6.toString()).hashCode();
                                            if (var59_67 == (var60_68 = 98882)) break block74;
                                            var60_68 = 3059573;
                                            if (var59_67 == var60_68) break block75;
                                            var60_68 = 106438291;
                                            if (var59_67 == var60_68) break block76;
                                            var60_68 = 109400031;
                                            if (var59_67 != var60_68 || (var58_66 = (int)var6_6.equals(var7_7 /* !! */  = "share")) == 0) ** GOTO lbl-1000
                                            var58_66 = 3;
                                            break block77;
                                        }
                                        var7_7 /* !! */  = "paste";
                                        var58_66 = (int)var6_6.equals(var7_7 /* !! */ );
                                        if (var58_66 == 0) ** GOTO lbl-1000
                                        var58_66 = 1;
                                        break block77;
                                    }
                                    var7_7 /* !! */  = "copy";
                                    var58_66 = (int)var6_6.equals(var7_7 /* !! */ );
                                    if (var58_66 == 0) ** GOTO lbl-1000
                                    var58_66 = 0;
                                    var6_6 = null;
                                    break block77;
                                }
                                var7_7 /* !! */  = "cut";
                                var58_66 = (int)var6_6.equals(var7_7 /* !! */ );
                                if (var58_66 != 0) {
                                    var58_66 = 2;
                                } else lbl-1000:
                                // 4 sources

                                {
                                    var58_66 = -1;
                                }
                            }
                            var59_67 = 1;
                            var60_68 = 2;
                            if (var58_66 == 0) break block78;
                            var40_44 = 3;
                            if (var58_66 == var59_67) break block79;
                            if (var58_66 != var60_68) {
                                if (var58_66 == var40_44) {
                                    var53_61 = true;
                                }
                                break block80;
                            } else {
                                var54_62 = true;
                            }
                            break block80;
                        }
                        var46_53 = true;
                        break block80;
                    }
                    var40_44 = 3;
                    var57_65 = true;
                }
                var43_50 += var59_67;
            }
        }
    }

    public void putInState(String string2, Object object) {
        this.state.put(string2, object);
    }

    public void resetState() {
        HashMap hashMap;
        this.state = hashMap = new HashMap();
    }

    public void setCurrView(String string2) {
        this.currView = string2;
    }

    public void setCurrViewId(String string2) {
        this.currViewId = string2;
    }

    public void setFileOrigin(String string2) {
        this.fileOrigin = string2;
    }

    public void setUseAppContext(boolean bl2) {
        this.useAppContext = bl2;
    }
}

