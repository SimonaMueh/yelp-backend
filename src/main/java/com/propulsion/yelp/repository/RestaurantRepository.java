package com.propulsion.yelp.repository;

import com.propulsion.yelp.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
    List<Restaurant> findByName( String name );
    
    List<Restaurant> findByNameIgnoreCaseContaining( String name );
    
    Restaurant findById( Long id );
    
}
