package dev.jaegyu.sdv.econ;

import net.fabricmc.fabric.api.entity.FakePlayer;
import net.minecraft.server.world.ServerWorld;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import dev.jaegyu.sdv.econ.EconManager;

// TODO: This is pretty much pointless because i'm throwing away these classes. I just wanted to see if i could get this to work.
// TODO: refactor this and fix deps in gradle
class EconManagerTest {
    final ServerWorld mockWorld = Mockito.mock(ServerWorld.class);
    @Test
    void subtractCashFromPlayerWithoutNBTData() {
        EconManager econManager = new EconManager();
        Transaction transaction = econManager.newTransaction();

        var player1 = FakePlayer.get(mockWorld);
        var player2 = FakePlayer.get(mockWorld);

        assertThrows(IllegalArgumentException.class, () -> {
            transaction.from(player1).to(player2).amount(-100).transact();
        });
    }
}
