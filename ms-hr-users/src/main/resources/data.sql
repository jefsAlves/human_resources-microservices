INSERT INTO TB_USERS (NAME, EMAIL, PASSWORD) VALUES ('Bob', 'bob@gmail.com', '$2a$10$FJulwLfOjvkwTfH1fWVEY.GMCDoEi3byZKcmZynXzo2Yb0EZeWn/O');
INSERT INTO TB_USERS (NAME, EMAIL, PASSWORD) VALUES ('Alex', 'alex@gmail.com', '$2a$10$xpDNvkRf7flAg68VPz3qcuBKuvLyWxq/b0WW4NZvYV6r2PsO4xhxu');
INSERT INTO TB_USERS (NAME, EMAIL, PASSWORD) VALUES ('Ray', 'ray@gmail.com', '$2a$10$18NWv6R6U8ZRkLDQ1ENwYOmg7zA189kC9PpFKZm9Fr96U39WYk5TW');
INSERT INTO TB_USERS (NAME, EMAIL, PASSWORD) VALUES ('Green', 'green@gmail.com', '$2a$10$3N8XAnFbRU3RBV/dIgupdeRZxd4SXdQ8PGuB3qWo4QpAS8wipOKga');
INSERT INTO TB_USERS (NAME, EMAIL, PASSWORD) VALUES ('Chris', 'chris@gmail.com', '$2a$10$7FyN5yDv0.UMb0XyA6nlrOiQtt.keDv9nk1amNsZtTcmi9BwDVkFG');
INSERT INTO TB_USERS (NAME, EMAIL, PASSWORD) VALUES ('Musk', 'musk@gmail.com', '$2a$10$3anEwscRC7.qz9N.Ts7UbOnBxTZ9YWcSF75xXdizKFGdvw1IPWaKW');

INSERT INTO TB_ROLES (ROLE_NAME) VALUES ('ROLE_OPERATOR');
INSERT INTO TB_ROLES (ROLE_NAME) VALUES ('ROLE_ADM');

INSERT INTO TB_USERS_ROLES (USER_ID, ROLE_ID) VALUES (1, 1);
INSERT INTO TB_USERS_ROLES (USER_ID, ROLE_ID) VALUES (2, 1);
INSERT INTO TB_USERS_ROLES (USER_ID, ROLE_ID) VALUES (2, 2);

