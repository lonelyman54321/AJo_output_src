/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Pair
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewStub
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.MaterialTimePicker$1;
import com.google.android.material.timepicker.MaterialTimePicker$2;
import com.google.android.material.timepicker.MaterialTimePicker$3;
import com.google.android.material.timepicker.MaterialTimePicker$Builder;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerClockPresenter;
import com.google.android.material.timepicker.TimePickerPresenter;
import com.google.android.material.timepicker.TimePickerTextInputPresenter;
import com.google.android.material.timepicker.TimePickerView;
import com.google.android.material.timepicker.TimePickerView$OnDoubleTapListener;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class MaterialTimePicker
extends DialogFragment
implements TimePickerView$OnDoubleTapListener {
    public static final int INPUT_MODE_CLOCK = 0;
    static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    static final String NEGATIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String NEGATIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String OVERRIDE_THEME_RES_ID = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    static final String POSITIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String POSITIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    private TimePickerPresenter activePresenter;
    private Button cancelButton;
    private final Set cancelListeners;
    private int clockIcon;
    private final Set dismissListeners;
    private int inputMode;
    private int keyboardIcon;
    private MaterialButton modeButton;
    private final Set negativeButtonListeners;
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private int overrideThemeResId;
    private final Set positiveButtonListeners;
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private ViewStub textInputStub;
    private TimeModel time;
    private TimePickerClockPresenter timePickerClockPresenter;
    private TimePickerTextInputPresenter timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private int titleResId;
    private CharSequence titleText;

    public MaterialTimePicker() {
        LinkedHashSet linkedHashSet;
        this.positiveButtonListeners = linkedHashSet = new LinkedHashSet();
        this.negativeButtonListeners = linkedHashSet = new LinkedHashSet();
        this.cancelListeners = linkedHashSet = new LinkedHashSet();
        this.dismissListeners = linkedHashSet = new LinkedHashSet();
        this.titleResId = 0;
        this.positiveButtonTextResId = 0;
        this.negativeButtonTextResId = 0;
        this.inputMode = 0;
        this.overrideThemeResId = 0;
    }

    public static /* synthetic */ void Oa(MaterialTimePicker materialTimePicker) {
        materialTimePicker.lambda$onViewCreated$0();
    }

    public static /* synthetic */ Set access$1000(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.negativeButtonListeners;
    }

    public static /* synthetic */ int access$1100(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.inputMode;
    }

    public static /* synthetic */ int access$1102(MaterialTimePicker materialTimePicker, int n3) {
        materialTimePicker.inputMode = n3;
        return n3;
    }

    public static /* synthetic */ MaterialButton access$1200(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.modeButton;
    }

    public static /* synthetic */ void access$1300(MaterialTimePicker materialTimePicker, MaterialButton materialButton) {
        materialTimePicker.updateInputMode(materialButton);
    }

    public static /* synthetic */ MaterialTimePicker access$1400(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return MaterialTimePicker.newInstance(materialTimePicker$Builder);
    }

    public static /* synthetic */ Set access$900(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.positiveButtonListeners;
    }

    private Pair dataForMode(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                Integer n7 = this.clockIcon;
                Integer n8 = R$string.material_timepicker_clock_mode_description;
                Pair pair = new Pair((Object)n7, (Object)n8);
                return pair;
            }
            String string2 = hj0_0.a(n3, "no icon for mode: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        Integer n10 = this.keyboardIcon;
        Integer n14 = R$string.material_timepicker_text_input_mode_description;
        Pair pair = new Pair((Object)n10, (Object)n14);
        return pair;
    }

    private int getThemeResId() {
        int n3 = this.overrideThemeResId;
        if (n3 != 0) {
            return n3;
        }
        Context context = this.requireContext();
        int n4 = R$attr.materialTimePickerTheme;
        if ((context = MaterialAttributes.resolve(context, n4)) == null) {
            n3 = 0;
            context = null;
        } else {
            n3 = context.data;
        }
        return n3;
    }

    private TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int n3, TimePickerView object, ViewStub object2) {
        if (n3 == 0) {
            TimePickerClockPresenter timePickerClockPresenter = this.timePickerClockPresenter;
            if (timePickerClockPresenter == null) {
                object2 = this.time;
                timePickerClockPresenter = new TimePickerClockPresenter((TimePickerView)object, (TimeModel)object2);
            }
            this.timePickerClockPresenter = timePickerClockPresenter;
            return timePickerClockPresenter;
        }
        TimePickerTextInputPresenter timePickerTextInputPresenter = this.timePickerTextInputPresenter;
        if (timePickerTextInputPresenter == null) {
            timePickerTextInputPresenter = (LinearLayout)object2.inflate();
            object2 = this.time;
            this.timePickerTextInputPresenter = object = new TimePickerTextInputPresenter((LinearLayout)timePickerTextInputPresenter, (TimeModel)object2);
        }
        this.timePickerTextInputPresenter.clearCheck();
        return this.timePickerTextInputPresenter;
    }

    private /* synthetic */ void lambda$onViewCreated$0() {
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        boolean bl2 = timePickerPresenter instanceof TimePickerTextInputPresenter;
        if (bl2) {
            timePickerPresenter = (TimePickerTextInputPresenter)timePickerPresenter;
            ((TimePickerTextInputPresenter)timePickerPresenter).resetChecked();
        }
    }

    private static MaterialTimePicker newInstance(MaterialTimePicker$Builder materialTimePicker$Builder) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        Object object = MaterialTimePicker$Builder.access$000(materialTimePicker$Builder);
        bundle.putParcelable(TIME_MODEL_EXTRA, (Parcelable)object);
        Object object2 = MaterialTimePicker$Builder.access$100(materialTimePicker$Builder);
        if (object2 != null) {
            object2 = MaterialTimePicker$Builder.access$100(materialTimePicker$Builder);
            int n3 = (Integer)object2;
            object = INPUT_MODE_EXTRA;
            bundle.putInt((String)object, n3);
        }
        int n4 = MaterialTimePicker$Builder.access$200(materialTimePicker$Builder);
        bundle.putInt(TITLE_RES_EXTRA, n4);
        object2 = MaterialTimePicker$Builder.access$300(materialTimePicker$Builder);
        if (object2 != null) {
            object2 = TITLE_TEXT_EXTRA;
            object = MaterialTimePicker$Builder.access$300(materialTimePicker$Builder);
            bundle.putCharSequence((String)object2, (CharSequence)object);
        }
        n4 = MaterialTimePicker$Builder.access$400(materialTimePicker$Builder);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, n4);
        object2 = MaterialTimePicker$Builder.access$500(materialTimePicker$Builder);
        if (object2 != null) {
            object2 = POSITIVE_BUTTON_TEXT_EXTRA;
            object = MaterialTimePicker$Builder.access$500(materialTimePicker$Builder);
            bundle.putCharSequence((String)object2, (CharSequence)object);
        }
        n4 = MaterialTimePicker$Builder.access$600(materialTimePicker$Builder);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, n4);
        object2 = MaterialTimePicker$Builder.access$700(materialTimePicker$Builder);
        if (object2 != null) {
            object2 = NEGATIVE_BUTTON_TEXT_EXTRA;
            object = MaterialTimePicker$Builder.access$700(materialTimePicker$Builder);
            bundle.putCharSequence((String)object2, (CharSequence)object);
        }
        int n7 = MaterialTimePicker$Builder.access$800(materialTimePicker$Builder);
        bundle.putInt(OVERRIDE_THEME_RES_ID, n7);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    private void restoreState(Bundle bundle) {
        int n3;
        if (bundle == null) {
            return;
        }
        Object object = (TimeModel)bundle.getParcelable(TIME_MODEL_EXTRA);
        this.time = object;
        if (object == null) {
            object = new TimeModel();
            this.time = object;
        }
        object = this.time;
        int n4 = ((TimeModel)object).format;
        int n7 = 1;
        if (n4 != n7) {
            n7 = 0;
        }
        this.inputMode = n4 = bundle.getInt(INPUT_MODE_EXTRA, n7);
        this.titleResId = n4 = bundle.getInt(TITLE_RES_EXTRA, 0);
        this.titleText = object = bundle.getCharSequence(TITLE_TEXT_EXTRA);
        this.positiveButtonTextResId = n4 = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.positiveButtonText = object = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_EXTRA);
        this.negativeButtonTextResId = n4 = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.negativeButtonText = object = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA);
        this.overrideThemeResId = n3 = bundle.getInt(OVERRIDE_THEME_RES_ID, 0);
    }

    private void updateCancelButtonVisibility() {
        Button button = this.cancelButton;
        if (button != null) {
            int n3 = this.isCancelable();
            n3 = n3 != 0 ? 0 : 8;
            button.setVisibility(n3);
        }
    }

    private void updateInputMode(MaterialButton materialButton) {
        Object object;
        if (materialButton != null && (object = this.timePickerView) != null && (object = this.textInputStub) != null) {
            object = this.activePresenter;
            if (object != null) {
                object.hide();
            }
            int n3 = this.inputMode;
            TimePickerView timePickerView = this.timePickerView;
            ViewStub viewStub = this.textInputStub;
            this.activePresenter = object = this.initializeOrRetrieveActivePresenterForMode(n3, timePickerView, viewStub);
            object.show();
            this.activePresenter.invalidate();
            n3 = this.inputMode;
            object = this.dataForMode(n3);
            int n4 = (Integer)((Pair)object).first;
            materialButton.setIconResource(n4);
            timePickerView = this.getResources();
            n3 = (Integer)((Pair)object).second;
            object = timePickerView.getString(n3);
            materialButton.setContentDescription((CharSequence)object);
            n3 = 4;
            materialButton.sendAccessibilityEvent(n3);
        }
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.cancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.dismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.negativeButtonListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.positiveButtonListeners.clear();
    }

    public int getHour() {
        return this.time.hour % 24;
    }

    public int getInputMode() {
        return this.inputMode;
    }

    public int getMinute() {
        return this.time.minute;
    }

    public TimePickerClockPresenter getTimePickerClockPresenter() {
        return this.timePickerClockPresenter;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        boolean bl2;
        Iterator iterator = this.cancelListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            DialogInterface.OnCancelListener onCancelListener = (DialogInterface.OnCancelListener)iterator.next();
            onCancelListener.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.getArguments();
        }
        this.restoreState(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = this.requireContext();
        int n3 = this.getThemeResId();
        bundle = new Dialog(context, n3);
        context = bundle.getContext();
        int n4 = R$attr.materialTimePickerStyle;
        int n7 = R$style.Widget_MaterialComponents_TimePicker;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, n4, n7);
        Object object = R$styleable.MaterialTimePicker;
        n7 = R$attr.materialTimePickerStyle;
        int n8 = R$style.Widget_MaterialComponents_TimePicker;
        object = context.obtainStyledAttributes(null, object, n7, n8);
        n7 = R$styleable.MaterialTimePicker_clockIcon;
        this.clockIcon = n7 = object.getResourceId(n7, 0);
        n7 = R$styleable.MaterialTimePicker_keyboardIcon;
        this.keyboardIcon = n7 = object.getResourceId(n7, 0);
        n7 = R$styleable.MaterialTimePicker_backgroundTint;
        n7 = object.getColor(n7, 0);
        object.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        context = ColorStateList.valueOf((int)n7);
        materialShapeDrawable.setFillColor((ColorStateList)context);
        context = bundle.getWindow();
        context.setBackgroundDrawable((Drawable)materialShapeDrawable);
        context.requestFeature(1);
        n4 = -2;
        context.setLayout(n4, n4);
        context = context.getDecorView();
        object = ViewCompat.a;
        float f5 = ViewCompat$c.e((View)context);
        materialShapeDrawable.setElevation(f5);
        return bundle;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        int n3 = R$layout.material_timepicker_dialog;
        layoutInflater = (ViewGroup)layoutInflater.inflate(n3, object);
        int n4 = R$id.material_timepicker_view;
        object = (TimePickerView)layoutInflater.findViewById(n4);
        this.timePickerView = object;
        object.setOnDoubleTapListener(this);
        n4 = R$id.material_textinput_timepicker;
        object = (ViewStub)layoutInflater.findViewById(n4);
        this.textInputStub = object;
        n4 = R$id.material_timepicker_mode_button;
        object = (MaterialButton)layoutInflater.findViewById(n4);
        this.modeButton = object;
        n4 = R$id.header_title;
        object = (TextView)layoutInflater.findViewById(n4);
        n3 = this.titleResId;
        if (n3 != 0) {
            object.setText(n3);
        } else {
            object2 = this.titleText;
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 == 0) {
                object2 = this.titleText;
                object.setText((CharSequence)object2);
            }
        }
        object = this.modeButton;
        this.updateInputMode((MaterialButton)object);
        n4 = R$id.material_timepicker_ok_button;
        object = (Button)layoutInflater.findViewById(n4);
        object2 = new MaterialTimePicker$1(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n3 = this.positiveButtonTextResId;
        if (n3 != 0) {
            object.setText(n3);
        } else {
            object2 = this.positiveButtonText;
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 == 0) {
                object2 = this.positiveButtonText;
                object.setText((CharSequence)object2);
            }
        }
        n4 = R$id.material_timepicker_cancel_button;
        object = (Button)layoutInflater.findViewById(n4);
        this.cancelButton = object;
        object2 = new MaterialTimePicker$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n4 = this.negativeButtonTextResId;
        if (n4 != 0) {
            object2 = this.cancelButton;
            object2.setText(n4);
        } else {
            object = this.negativeButtonText;
            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n4 == 0) {
                object = this.cancelButton;
                object2 = this.negativeButtonText;
                object.setText((CharSequence)object2);
            }
        }
        this.updateCancelButtonVisibility();
        object = this.modeButton;
        object2 = new MaterialTimePicker$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        return layoutInflater;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.activePresenter = null;
        this.timePickerClockPresenter = null;
        this.timePickerTextInputPresenter = null;
        TimePickerView timePickerView = this.timePickerView;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.timePickerView = null;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean bl2;
        Iterator iterator = this.dismissListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener)iterator.next();
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onDoubleTap() {
        this.inputMode = 1;
        MaterialButton materialButton = this.modeButton;
        this.updateInputMode(materialButton);
        this.timePickerTextInputPresenter.resetChecked();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Object object = this.time;
        bundle.putParcelable(TIME_MODEL_EXTRA, (Parcelable)object);
        int n3 = this.inputMode;
        bundle.putInt(INPUT_MODE_EXTRA, n3);
        n3 = this.titleResId;
        bundle.putInt(TITLE_RES_EXTRA, n3);
        object = this.titleText;
        bundle.putCharSequence(TITLE_TEXT_EXTRA, (CharSequence)object);
        n3 = this.positiveButtonTextResId;
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, n3);
        object = this.positiveButtonText;
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, (CharSequence)object);
        n3 = this.negativeButtonTextResId;
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, n3);
        object = this.negativeButtonText;
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, (CharSequence)object);
        n3 = this.overrideThemeResId;
        bundle.putInt(OVERRIDE_THEME_RES_ID, n3);
    }

    public void onViewCreated(View view, Bundle object) {
        super.onViewCreated(view, (Bundle)object);
        object = this.activePresenter;
        boolean bl2 = object instanceof TimePickerTextInputPresenter;
        if (bl2) {
            int n3 = 1;
            object = new Ox0(this, n3);
            long l2 = 100;
            view.postDelayed((Runnable)object, l2);
        }
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.remove(onClickListener);
    }

    public void setActivePresenter(TimePickerPresenter timePickerPresenter) {
        this.activePresenter = timePickerPresenter;
    }

    public void setCancelable(boolean bl2) {
        super.setCancelable(bl2);
        this.updateCancelButtonVisibility();
    }

    public void setHour(int n3) {
        TimeModel timeModel = this.time;
        timeModel.setHour(n3);
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }

    public void setMinute(int n3) {
        TimeModel timeModel = this.time;
        timeModel.setMinute(n3);
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }
}

