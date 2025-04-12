/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.core.R$id;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$a;
import androidx.core.view.b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

public class Hn {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading;
    private static final int[] sAccessibilityPaneTitle;
    private static final String[] sClassPrefixList;
    private static final a53 sConstructorMap;
    private static final Class[] sConstructorSignature;
    private static final int[] sOnClickAttrs;
    private static final int[] sScreenReaderFocusable;
    private final Object[] mConstructorArgs;

    static {
        Object object = new Class[]{Context.class, AttributeSet.class};
        sConstructorSignature = object;
        sOnClickAttrs = new int[]{16843375};
        sAccessibilityHeading = new int[]{16844160};
        sAccessibilityPaneTitle = new int[]{16844156};
        sScreenReaderFocusable = new int[]{16844148};
        sClassPrefixList = new String[]{"android.widget.", "android.view.", "android.webkit."};
        sConstructorMap = object = new a53();
    }

    public Hn() {
        Object[] objectArray = new Object[2];
        this.mConstructorArgs = objectArray;
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet object) {
        Object object2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 > n4) {
            return;
        }
        Object object3 = sAccessibilityHeading;
        object3 = context.obtainStyledAttributes(object, (int[])object3);
        int n7 = object3.hasValue(0);
        Class<Boolean> clazz = Boolean.class;
        if (n7 != 0) {
            n7 = object3.getBoolean(0, false);
            Object object4 = ViewCompat.a;
            int n8 = R$id.tag_accessibility_heading;
            object4 = new ViewCompat$a(n8, clazz, 0, n4);
            object2 = n7 != 0;
            ((ViewCompat$a)object4).d(view, object2);
        }
        object3.recycle();
        object3 = sAccessibilityPaneTitle;
        object3 = context.obtainStyledAttributes(object, (int[])object3);
        n7 = object3.hasValue(0);
        if (n7 != 0) {
            object2 = object3.getString(0);
            ViewCompat.t(view, (CharSequence)object2);
        }
        object3.recycle();
        object3 = sScreenReaderFocusable;
        context = context.obtainStyledAttributes(object, (int[])object3);
        boolean bl2 = context.hasValue(0);
        if (bl2) {
            bl2 = context.getBoolean(0, false);
            object3 = ViewCompat.a;
            object3 = new b;
            n7 = R$id.tag_screen_reader_focusable;
            ((ViewCompat$a)object3)(n7, clazz, 0, n4);
            object = bl2;
            ((ViewCompat$a)object3).d(view, object);
        }
        context.recycle();
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Object object = view.getContext();
        boolean bl2 = object instanceof ContextWrapper;
        if (bl2 && (bl2 = view.hasOnClickListeners())) {
            Object object2 = sOnClickAttrs;
            if ((object = (attributeSet = object.obtainStyledAttributes(attributeSet, object2)).getString(0)) != null) {
                object2 = new Hn$a;
                object2(view, (String)object);
                view.setOnClickListener((View.OnClickListener)object2);
            }
            attributeSet.recycle();
        }
    }

    private View createViewByPrefix(Context object, String string2, String classArray) {
        a53 a532 = sConstructorMap;
        Constructor constructor = (Constructor)a532.get(string2);
        if (constructor == null) {
            if (classArray != null) {
                constructor = new Constructor();
                ((StringBuilder)((Object)constructor)).append((String)classArray);
                ((StringBuilder)((Object)constructor)).append(string2);
                classArray = ((StringBuilder)((Object)constructor)).toString();
            } else {
                classArray = string2;
            }
            object = object.getClassLoader();
            constructor = null;
            object = Class.forName((String)classArray, false, (ClassLoader)object);
            classArray = View.class;
            object = ((Class)object).asSubclass(classArray);
            classArray = sConstructorSignature;
            constructor = ((Class)object).getConstructor(classArray);
            a532.put(string2, constructor);
        }
        boolean bl2 = true;
        try {
            ((AccessibleObject)constructor).setAccessible(bl2);
            object = this.mConstructorArgs;
        }
        catch (Exception exception) {
            return null;
        }
        object = constructor.newInstance((Object[])object);
        return (View)object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private View createViewFromTag(Context objectArray, String object, AttributeSet attributeSet) {
        String string2 = "view";
        int n3 = ((String)object).equals(string2) ? 1 : 0;
        if (n3 != 0) {
            object = attributeSet.getAttributeValue(null, "class");
        }
        n3 = 1;
        try {
            View view = this.mConstructorArgs;
            view[0] = objectArray;
            view[n3] = attributeSet;
            int n4 = 46;
            n4 = ((String)object).indexOf(n4);
            int n7 = -1;
            if (n7 == n4) {
                int n8;
                attributeSet = null;
                for (n4 = 0; n4 < (n8 = ((Object[])(view = sClassPrefixList)).length); ++n4) {
                    view = view[n4];
                    if ((view = this.createViewByPrefix((Context)objectArray, (String)object, (String)view)) == null) continue;
                    objectArray = this.mConstructorArgs;
                    objectArray[0] = null;
                    objectArray[n3] = null;
                    return view;
                }
                objectArray = this.mConstructorArgs;
                objectArray[0] = null;
                objectArray[n3] = null;
                return null;
            }
            objectArray = this.createViewByPrefix((Context)objectArray, (String)object, null);
            object = this.mConstructorArgs;
            object[0] = null;
            object[n3] = null;
            return objectArray;
        }
        catch (Throwable throwable) {}
        object = this.mConstructorArgs;
        object[0] = null;
        object[n3] = null;
        throw throwable;
        catch (Exception exception) {
            objectArray = this.mConstructorArgs;
            objectArray[0] = null;
            objectArray[n3] = null;
            return null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet object, boolean n3, boolean bl2) {
        block6: {
            block7: {
                int[] nArray = R$styleable.View;
                object = context.obtainStyledAttributes(object, nArray, 0, 0);
                if (n3 != 0) {
                    n3 = R$styleable.View_android_theme;
                    n3 = object.getResourceId(n3, 0);
                } else {
                    n3 = 0;
                }
                if (bl2 && n3 == 0) {
                    n3 = R$styleable.View_theme;
                    n3 = object.getResourceId(n3, 0);
                }
                object.recycle();
                if (n3 == 0) break block6;
                int n4 = context instanceof d80;
                if (n4 == 0) break block7;
                object = context;
                object = (d80)context;
                n4 = object.a;
                if (n4 == n3) break block6;
            }
            object = new d80(context, n3);
            context = object;
        }
        return context;
    }

    private void verifyNotNull(View object, String string2) {
        if (object != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = this.getClass().getName();
        stringBuilder.append(string3);
        stringBuilder.append(" asked to inflate view for <");
        stringBuilder.append(string2);
        stringBuilder.append(">, but returned null");
        string2 = stringBuilder.toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = new AppCompatAutoCompleteTextView(context, attributeSet);
        return appCompatAutoCompleteTextView;
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        AppCompatButton appCompatButton = new AppCompatButton(context, attributeSet);
        return appCompatButton;
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, attributeSet);
        return appCompatCheckBox;
    }

    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        AppCompatCheckedTextView appCompatCheckedTextView = new AppCompatCheckedTextView(context, attributeSet);
        return appCompatCheckedTextView;
    }

    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        AppCompatEditText appCompatEditText = new AppCompatEditText(context, attributeSet);
        return appCompatEditText;
    }

    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context, attributeSet);
        return appCompatImageButton;
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
        return appCompatImageView;
    }

    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        AppCompatMultiAutoCompleteTextView appCompatMultiAutoCompleteTextView = new AppCompatMultiAutoCompleteTextView(context, attributeSet);
        return appCompatMultiAutoCompleteTextView;
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(context, attributeSet);
        return appCompatRadioButton;
    }

    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        AppCompatRatingBar appCompatRatingBar = new AppCompatRatingBar(context, attributeSet);
        return appCompatRatingBar;
    }

    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        AppCompatSeekBar appCompatSeekBar = new AppCompatSeekBar(context, attributeSet);
        return appCompatSeekBar;
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(context, attributeSet);
        return appCompatSpinner;
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet);
        return appCompatTextView;
    }

    public AppCompatToggleButton createToggleButton(Context context, AttributeSet attributeSet) {
        AppCompatToggleButton appCompatToggleButton = new AppCompatToggleButton(context, attributeSet);
        return appCompatToggleButton;
    }

    public View createView(Context context, String string2, AttributeSet attributeSet) {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final View createView(View view, String string2, Context context, AttributeSet attributeSet, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        void var5_21;
        Object object;
        void var8_39;
        void var7_38;
        void var6_22;
        view = bl2 && view != null ? view.getContext() : context;
        if (var6_22 != false || var7_38 != false) {
            view = Hn.themifyContext((Context)view, attributeSet, (boolean)var6_22, (boolean)var7_38);
        }
        if (var8_39 != false) {
            Qn3.a((Context)view);
        }
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 2001146706: {
                String string3 = "Button";
                boolean bl6 = string2.equals(string3);
                if (!bl6) break;
                int n7 = 13;
                break;
            }
            case 1666676343: {
                String string4 = "EditText";
                boolean bl7 = string2.equals(string4);
                if (!bl7) break;
                int n8 = 12;
                break;
            }
            case 1601505219: {
                String string5 = "CheckBox";
                boolean bl8 = string2.equals(string5);
                if (!bl8) break;
                int n10 = 11;
                break;
            }
            case 1413872058: {
                String string6 = "AutoCompleteTextView";
                boolean bl9 = string2.equals(string6);
                if (!bl9) break;
                int n14 = 10;
                break;
            }
            case 1125864064: {
                String string7 = "ImageView";
                boolean bl10 = string2.equals(string7);
                if (!bl10) break;
                int n15 = 9;
                break;
            }
            case 799298502: {
                String string8 = "ToggleButton";
                boolean bl11 = string2.equals(string8);
                if (!bl11) break;
                int n16 = 8;
                break;
            }
            case 776382189: {
                String string9 = "RadioButton";
                boolean bl12 = string2.equals(string9);
                if (!bl12) break;
                int n17 = 7;
                break;
            }
            case -339785223: {
                String string10 = "Spinner";
                boolean bl13 = string2.equals(string10);
                if (!bl13) break;
                int n18 = 6;
                break;
            }
            case -658531749: {
                String string11 = "SeekBar";
                boolean bl14 = string2.equals(string11);
                if (!bl14) break;
                int n19 = 5;
                break;
            }
            case -937446323: {
                String string12 = "ImageButton";
                boolean bl15 = string2.equals(string12);
                if (!bl15) break;
                int n20 = 4;
                break;
            }
            case -938935918: {
                String string13 = "TextView";
                boolean bl16 = string2.equals(string13);
                if (!bl16) break;
                int n21 = 3;
                break;
            }
            case -1346021293: {
                String string14 = "MultiAutoCompleteTextView";
                boolean bl17 = string2.equals(string14);
                if (!bl17) break;
                int n22 = 2;
                break;
            }
            case -1455429095: {
                String string15 = "CheckedTextView";
                boolean bl18 = string2.equals(string15);
                if (!bl18) break;
                boolean bl19 = true;
                break;
            }
            case -1946472170: {
                String string16 = "RatingBar";
                boolean bl20 = string2.equals(string16);
                if (!bl20) break;
                boolean bl21 = false;
                object = null;
            }
        }
        switch (var5_21) {
            default: {
                object = this.createView((Context)view, string2, attributeSet);
                break;
            }
            case 13: {
                object = this.createButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 12: {
                object = this.createEditText((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 11: {
                object = this.createCheckBox((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 10: {
                object = this.createAutoCompleteTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 9: {
                object = this.createImageView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 8: {
                object = this.createToggleButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 7: {
                object = this.createRadioButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 6: {
                object = this.createSpinner((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 5: {
                object = this.createSeekBar((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 4: {
                object = this.createImageButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 3: {
                object = this.createTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 2: {
                object = this.createMultiAutoCompleteTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 1: {
                object = this.createCheckedTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
                break;
            }
            case 0: {
                object = this.createRatingBar((Context)view, attributeSet);
                this.verifyNotNull((View)object, string2);
            }
        }
        if (object == null && context != view) {
            object = this.createViewFromTag((Context)view, string2, attributeSet);
        }
        if (object != null) {
            this.checkOnClickListener((View)object, attributeSet);
            this.backportAccessibilityAttributes((Context)view, (View)object, attributeSet);
        }
        return object;
    }
}

