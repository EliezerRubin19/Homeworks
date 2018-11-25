SELECT rr.veh_reg_no,cs.name,rr.start_date,rr.end_date
 FROM rental_records AS rr
 INNER JOIN customers as cs ON rr.customer_id=cs.customer_id
WHERE '2012-01-10' BETWEEN rr.start_date AND rr.end_date;