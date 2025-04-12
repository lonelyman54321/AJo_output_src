/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.view.View
 */
package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.material.datepicker.CalendarItemStyle;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.datepicker.YearGridAdapter;
import java.util.Calendar;
import java.util.Iterator;

class MaterialCalendar$5
extends RecyclerView$n {
    private final Calendar endItem;
    private final Calendar startItem;
    final /* synthetic */ MaterialCalendar this$0;

    public MaterialCalendar$5(MaterialCalendar object) {
        this.this$0 = object;
        this.startItem = object = UtcDates.getUtcCalendar();
        this.endItem = object = UtcDates.getUtcCalendar();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        MaterialCalendar$5 materialCalendar$5 = this;
        Object object = recyclerView.getAdapter();
        boolean bl2 = object instanceof YearGridAdapter;
        if (bl2 && (bl2 = (object = recyclerView.getLayoutManager()) instanceof GridLayoutManager)) {
            int n3;
            object = (YearGridAdapter)recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager)recyclerView.getLayoutManager();
            Iterator iterator = MaterialCalendar.access$200(this.this$0).getSelectedRanges().iterator();
            while ((n3 = iterator.hasNext()) != 0) {
                Object object2 = (lm2)iterator.next();
                Object object3 = ((lm2)object2).a;
                if (object3 == null || (object2 = ((lm2)object2).b) == null) continue;
                Calendar calendar = materialCalendar$5.startItem;
                long l2 = (Long)object3;
                calendar.setTimeInMillis(l2);
                object3 = materialCalendar$5.endItem;
                long l3 = (Long)object2;
                ((Calendar)object3).setTimeInMillis(l3);
                object2 = materialCalendar$5.startItem;
                int n4 = 1;
                n3 = ((Calendar)object2).get(n4);
                n3 = ((YearGridAdapter)object).getPositionForYear(n3);
                n4 = materialCalendar$5.endItem.get(n4);
                n4 = ((YearGridAdapter)object).getPositionForYear(n4);
                calendar = gridLayoutManager.findViewByPosition(n3);
                View view = gridLayoutManager.findViewByPosition(n4);
                int n7 = gridLayoutManager.getSpanCount();
                n3 /= n7;
                n7 = gridLayoutManager.getSpanCount();
                n4 /= n7;
                for (n7 = n3; n7 <= n4; ++n7) {
                    int n8;
                    Paint paint;
                    int n10;
                    int n14 = gridLayoutManager.getSpanCount() * n7;
                    View view2 = gridLayoutManager.findViewByPosition(n14);
                    if (view2 == null) continue;
                    int n15 = view2.getTop();
                    int n16 = MaterialCalendar.access$400((MaterialCalendar)materialCalendar$5.this$0).year.getTopInset();
                    n15 += n16;
                    n14 = view2.getBottom();
                    CalendarItemStyle calendarItemStyle = MaterialCalendar.access$400((MaterialCalendar)materialCalendar$5.this$0).year;
                    n16 = calendarItemStyle.getBottomInset();
                    n14 -= n16;
                    if (n7 == n3 && calendar != null) {
                        n16 = calendar.getLeft();
                        n10 = calendar.getWidth() / 2 + n16;
                    } else {
                        n10 = 0;
                        paint = null;
                    }
                    if (n7 == n4 && view != null) {
                        n16 = view.getLeft();
                        n8 = view.getWidth() / 2 + n16;
                    } else {
                        n8 = recyclerView.getWidth();
                    }
                    float f5 = n10;
                    float f6 = n15;
                    float f7 = n8;
                    float f8 = n14;
                    paint = MaterialCalendar.access$400((MaterialCalendar)materialCalendar$5.this$0).rangeFill;
                    canvas.drawRect(f5, f6, f7, f8, paint);
                }
            }
        }
    }
}

