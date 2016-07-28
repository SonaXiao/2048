package com.bjtu.zero.a2048.core;

public class BlockChangeListItem {

    public Block block;
    public int toX;
    public int toY;
    public NextStatus nextStatus;

    public BlockChangeListItem(Block block, int toX, int toY, NextStatus nextStatus) {
        this.block = block;
        this.toX = toX;
        this.toY = toY;
        this.nextStatus = nextStatus;
    }

    public enum NextStatus {
        MAINTAIN,
        DESTROY,
        INCREASE
    }
}