package br.com.alelo.consumer.consumerpat.respository;

import br.com.alelo.consumer.consumerpat.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CardRepository extends JpaRepository<Card, Long> {

    @Query(nativeQuery = true, value = "select * from CARD where NUMBER = ? ")
    Card findByNumber(Long cardNumber);

}
