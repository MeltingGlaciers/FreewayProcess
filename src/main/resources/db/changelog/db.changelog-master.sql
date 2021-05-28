CREATE TABLE freeway(
    id SERIAL PRIMARY KEY,
    length INTEGER
);

CREATE TABLE crush(
    id SERIAL PRIMARY KEY,
    crush_position INTEGER,
    date DATE,
    freeway_id INTEGER REFERENCES freeway(id)
);

CREATE TABLE car(
    id SERIAL PRIMARY KEY,
    init_speed INTEGER,
    status INTEGER,
    crush_id INTEGER REFERENCES crush(id),
    freeway_id INTEGER REFERENCES freeway(id)
);