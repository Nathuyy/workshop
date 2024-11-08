package com.projetos.curso.repository;

import com.projetos.curso.model.Order;
import com.projetos.curso.model.OrderItem;
import com.projetos.curso.model.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
