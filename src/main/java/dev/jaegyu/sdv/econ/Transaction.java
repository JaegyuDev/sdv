package dev.jaegyu.sdv.econ;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public class Transaction {
    private PlayerEntity sender;
    private PlayerEntity recipient;
    private int amount;

    public Transaction from(PlayerEntity sender) {
        this.sender = sender;
        return this;
    }

    public Transaction to(PlayerEntity recipient) {
        this.recipient = recipient;
        return this;
    }

    public Transaction amount(int amount) {
        this.amount = amount;
        return this;
    }

    public void transact() {
        if (sender == null || recipient == null) {
            throw new IllegalArgumentException("You must specify a sender and recipient");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("You must specify a positive amount");
        }
    }
}
