/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

public class ShapePathModel
extends ShapeAppearanceModel {
    public void setAllCorners(CornerTreatment cornerTreatment) {
        this.topLeftCorner = cornerTreatment;
        this.topRightCorner = cornerTreatment;
        this.bottomRightCorner = cornerTreatment;
        this.bottomLeftCorner = cornerTreatment;
    }

    public void setAllEdges(EdgeTreatment edgeTreatment) {
        this.leftEdge = edgeTreatment;
        this.topEdge = edgeTreatment;
        this.rightEdge = edgeTreatment;
        this.bottomEdge = edgeTreatment;
    }

    public void setBottomEdge(EdgeTreatment edgeTreatment) {
        this.bottomEdge = edgeTreatment;
    }

    public void setBottomLeftCorner(CornerTreatment cornerTreatment) {
        this.bottomLeftCorner = cornerTreatment;
    }

    public void setBottomRightCorner(CornerTreatment cornerTreatment) {
        this.bottomRightCorner = cornerTreatment;
    }

    public void setCornerTreatments(CornerTreatment cornerTreatment, CornerTreatment cornerTreatment2, CornerTreatment cornerTreatment3, CornerTreatment cornerTreatment4) {
        this.topLeftCorner = cornerTreatment;
        this.topRightCorner = cornerTreatment2;
        this.bottomRightCorner = cornerTreatment3;
        this.bottomLeftCorner = cornerTreatment4;
    }

    public void setEdgeTreatments(EdgeTreatment edgeTreatment, EdgeTreatment edgeTreatment2, EdgeTreatment edgeTreatment3, EdgeTreatment edgeTreatment4) {
        this.leftEdge = edgeTreatment;
        this.topEdge = edgeTreatment2;
        this.rightEdge = edgeTreatment3;
        this.bottomEdge = edgeTreatment4;
    }

    public void setLeftEdge(EdgeTreatment edgeTreatment) {
        this.leftEdge = edgeTreatment;
    }

    public void setRightEdge(EdgeTreatment edgeTreatment) {
        this.rightEdge = edgeTreatment;
    }

    public void setTopEdge(EdgeTreatment edgeTreatment) {
        this.topEdge = edgeTreatment;
    }

    public void setTopLeftCorner(CornerTreatment cornerTreatment) {
        this.topLeftCorner = cornerTreatment;
    }

    public void setTopRightCorner(CornerTreatment cornerTreatment) {
        this.topRightCorner = cornerTreatment;
    }
}

