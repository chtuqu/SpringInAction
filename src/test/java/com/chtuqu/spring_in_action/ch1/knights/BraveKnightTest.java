package com.chtuqu.spring_in_action.ch1.knights;

import com.chtuqu.spring_in_action.ch1.knights.entities.BraveKnight;
import com.chtuqu.spring_in_action.ch1.knights.entities.Knight;
import com.chtuqu.spring_in_action.ch1.knights.entities.Quest;
import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = Mockito.mock(Quest.class);
        Knight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }
}
