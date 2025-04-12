/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.GridView
 *  android.widget.ListAdapter
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$id;
import com.google.android.material.datepicker.CalendarItemStyle;
import com.google.android.material.datepicker.CalendarStyle;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MonthAdapter;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

final class MaterialCalendarGridView
extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        object = UtcDates.getUtcCalendar();
        this.dayCompute = object;
        object = this.getContext();
        int n4 = MaterialDatePicker.isFullscreen(object);
        if (n4 != 0) {
            n4 = R$id.cancel_button;
            this.setNextFocusLeftId(n4);
            n4 = R$id.confirm_button;
            this.setNextFocusRightId(n4);
        }
        n4 = (int)(MaterialDatePicker.isNestedScrollable(this.getContext()) ? 1 : 0);
        this.nestedScrollable = n4;
        super(this);
        ViewCompat.s((View)this, (a)object);
    }

    private void gainFocus(int n3, Rect rect) {
        int n4 = 33;
        if (n3 == n4) {
            MonthAdapter monthAdapter = this.getAdapter();
            n3 = monthAdapter.lastPositionInMonth();
            this.setSelection(n3);
        } else {
            n4 = 130;
            if (n3 == n4) {
                MonthAdapter monthAdapter = this.getAdapter();
                n3 = monthAdapter.firstPositionInMonth();
                this.setSelection(n3);
            } else {
                n4 = 1;
                super.onFocusChanged(n4 != 0, n3, rect);
            }
        }
    }

    private View getChildAtPosition(int n3) {
        int n4 = this.getFirstVisiblePosition();
        return this.getChildAt(n3 -= n4);
    }

    private static int horizontalMidPoint(View view) {
        int n3 = view.getLeft();
        return view.getWidth() / 2 + n3;
    }

    private static boolean skipMonth(Long l2, Long l3, Long l4, Long l7) {
        long l8;
        long l12;
        long l14;
        long l15;
        long l16;
        long l17;
        boolean bl2 = true;
        if (l2 != null && l3 != null && l4 != null && l7 != null && (l17 = (l16 = (l15 = l4.longValue()) - (l14 = l3.longValue())) == 0L ? 0 : (l16 < 0L ? -1 : 1)) <= 0 && (l12 = (l8 = (l14 = l7.longValue()) - (l15 = l2.longValue())) == 0L ? 0 : (l8 < 0L ? -1 : 1)) >= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public MonthAdapter getAdapter() {
        return (MonthAdapter)super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        boolean bl2;
        Object object = this;
        super.onDraw(canvas);
        MonthAdapter monthAdapter = this.getAdapter();
        Object object2 = monthAdapter.dateSelector;
        CalendarStyle calendarStyle = monthAdapter.calendarStyle;
        int n3 = monthAdapter.firstPositionInMonth();
        int n4 = this.getFirstVisiblePosition();
        n3 = Math.max(n3, n4);
        n4 = monthAdapter.lastPositionInMonth();
        int n7 = this.getLastVisiblePosition();
        n4 = Math.min(n4, n7);
        Long l2 = monthAdapter.getItem(n3);
        Long l3 = monthAdapter.getItem(n4);
        object2 = object2.getSelectedRanges().iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = (lm2)object2.next();
            Object object4 = ((lm2)object3).a;
            if (object4 != null) {
                int n8;
                Calendar calendar;
                int n10;
                Calendar calendar2;
                int n14;
                object3 = ((lm2)object3).b;
                if (object3 == null) continue;
                object4 = (Long)object4;
                long l4 = (Long)object4;
                object3 = (Long)object3;
                long l7 = (Long)object3;
                bl2 = MaterialCalendarGridView.skipMonth(l2, l3, (Long)object4, (Long)object3);
                if (bl2) continue;
                bl2 = ViewUtils.isLayoutRtl((View)this);
                long l8 = l2;
                int n15 = 5;
                Object object5 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
                if (object5 < 0) {
                    n14 = monthAdapter.isFirstInRow(n3);
                    if (n14 != 0) {
                        n14 = 0;
                        calendar2 = null;
                    } else if (!bl2) {
                        n14 = n3 + -1;
                        calendar2 = object.getChildAtPosition(n14);
                        n14 = calendar2.getRight();
                    } else {
                        n14 = n3 + -1;
                        calendar2 = object.getChildAtPosition(n14);
                        n14 = calendar2.getLeft();
                    }
                    n10 = n14;
                    n14 = n3;
                } else {
                    calendar = object.dayCompute;
                    calendar.setTimeInMillis(l4);
                    calendar2 = object.dayCompute;
                    n14 = calendar2.get(n15);
                    n14 = monthAdapter.dayToPosition(n14);
                    View view = object.getChildAtPosition(n14);
                    n10 = MaterialCalendarGridView.horizontalMidPoint(view);
                }
                l8 = l3;
                object5 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                if (object5 > 0) {
                    n15 = (int)(monthAdapter.isLastInRow(n4) ? 1 : 0);
                    if (n15 != 0) {
                        n15 = this.getWidth();
                    } else if (!bl2) {
                        object4 = object.getChildAtPosition(n4);
                        n15 = object4.getRight();
                    } else {
                        object4 = object.getChildAtPosition(n4);
                        n15 = object4.getLeft();
                    }
                    n8 = n15;
                    n15 = n4;
                } else {
                    calendar = object.dayCompute;
                    calendar.setTimeInMillis(l7);
                    n15 = object.dayCompute.get(n15);
                    n15 = monthAdapter.dayToPosition(n15);
                    View view = object.getChildAtPosition(n15);
                    n8 = MaterialCalendarGridView.horizontalMidPoint(view);
                }
                long l12 = monthAdapter.getItemId(n14);
                int n16 = n3;
                int n17 = n4;
                long l14 = monthAdapter.getItemId(n15);
                n4 = (int)l14;
                for (int i3 = (int)l12; i3 <= n4; ++i3) {
                    float f5;
                    float f6;
                    n3 = this.getNumColumns() * i3;
                    object5 = this.getNumColumns() + n3;
                    MonthAdapter monthAdapter2 = monthAdapter;
                    long l15 = object5 + -1;
                    View view = object.getChildAtPosition(n3);
                    int n18 = view.getTop();
                    object = calendarStyle.day;
                    int n19 = ((CalendarItemStyle)object).getTopInset();
                    n19 = n18 + n19;
                    object5 = view.getBottom();
                    Object object6 = object2;
                    object2 = calendarStyle.day;
                    int n20 = ((CalendarItemStyle)object2).getBottomInset();
                    n20 = (int)(object5 - n20);
                    if (!bl2) {
                        if (n3 > n14) {
                            n3 = 0;
                            f6 = 0.0f;
                        } else {
                            n3 = n10;
                        }
                        l15 = n15 > l15 ? (long)this.getWidth() : (long)n8;
                    } else {
                        if (n15 > l15) {
                            l15 = 0;
                            f5 = 0.0f;
                            monthAdapter = null;
                        } else {
                            l15 = n8;
                        }
                        n3 = n3 > n14 ? this.getWidth() : n10;
                        int n21 = n3;
                        n3 = (int)l15;
                        l15 = n21;
                    }
                    f6 = n3;
                    float f7 = n19;
                    f5 = l15;
                    float f8 = n20;
                    object5 = n4;
                    Paint paint = calendarStyle.rangeFill;
                    canvas.drawRect(f6, f7, f5, f8, paint);
                    object = this;
                    monthAdapter = monthAdapter2;
                    object2 = object6;
                }
                object = this;
                n3 = n16;
                n4 = n17;
                continue;
            }
            object = this;
        }
    }

    public void onFocusChanged(boolean bl2, int n3, Rect rect) {
        if (bl2) {
            this.gainFocus(n3, rect);
        } else {
            bl2 = false;
            super.onFocusChanged(false, n3, rect);
        }
    }

    public boolean onKeyDown(int n3, KeyEvent keyEvent) {
        MonthAdapter monthAdapter;
        int n4 = super.onKeyDown(n3, keyEvent);
        if (n4 == 0) {
            return false;
        }
        n4 = this.getSelectedItemPosition();
        int n7 = -1;
        boolean bl2 = true;
        if (n4 != n7 && (n4 = this.getSelectedItemPosition()) < (n7 = (monthAdapter = this.getAdapter()).firstPositionInMonth())) {
            n4 = 19;
            if (n4 == n3) {
                n3 = this.getAdapter().firstPositionInMonth();
                this.setSelection(n3);
                return bl2;
            }
            return false;
        }
        return bl2;
    }

    public void onMeasure(int n3, int n4) {
        int n7 = this.nestedScrollable;
        if (n7 != 0) {
            n7 = -1 << -1;
            n4 = View.MeasureSpec.makeMeasureSpec((int)0xFFFFFF, (int)n7);
            super.onMeasure(n3, n4);
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            layoutParams.height = n4 = this.getMeasuredHeight();
        } else {
            super.onMeasure(n3, n4);
        }
    }

    public final void setAdapter(ListAdapter object) {
        boolean bl2 = object instanceof MonthAdapter;
        if (bl2) {
            super.setAdapter(object);
            return;
        }
        String string2 = MaterialCalendarGridView.class.getCanonicalName();
        String string3 = MonthAdapter.class.getCanonicalName();
        Object[] objectArray = new Object[]{string2, string3};
        string2 = String.format("%1$s must have its Adapter set to a %2$s", objectArray);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public void setSelection(int n3) {
        MonthAdapter monthAdapter = this.getAdapter();
        int n4 = monthAdapter.firstPositionInMonth();
        if (n3 < n4) {
            MonthAdapter monthAdapter2 = this.getAdapter();
            n3 = monthAdapter2.firstPositionInMonth();
            super.setSelection(n3);
        } else {
            super.setSelection(n3);
        }
    }
}

