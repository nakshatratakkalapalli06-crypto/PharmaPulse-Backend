package com.pharmaorderanalytics.service;
import com.pharmaorderanalytics.entity.Order;
import com.pharmaorderanalytics.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
    public Order updateOrder(Long id, Order order) {
        Order existing = orderRepository.findById(id).orElse(null);
        if (existing == null) {
            return null;
        }
        existing.setOrderNumber(order.getOrderNumber());
        existing.setCustomer(order.getCustomer());
        existing.setProduct(order.getProduct());
        existing.setQuantity(order.getQuantity());
        existing.setTotalAmount(order.getTotalAmount());
        existing.setStatus(order.getStatus());
        existing.setPaymentStatus(order.getPaymentStatus());
        existing.setOrderDate(order.getOrderDate());
        existing.setExpectedDelivery(order.getExpectedDelivery());
        return orderRepository.save(existing);
    }
    public boolean deleteOrder(Long id) {
        if (!orderRepository.existsById(id)) {
            return false;
        }
        orderRepository.deleteById(id);
        return true;
    }
}